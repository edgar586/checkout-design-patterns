package workshop.command;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 COMMAND PATTERN — Invoker / Cola de comandos.
 Encola comandos y los ejecuta en orden.
 Si uno falla, registra el fallo y puede reintentar.
*/

// ══════════════════════════════════════════════════════════════
// COMMAND PATTERN — Cola de Comandos
// ══════════════════════════════════════════════════════════════
// CONTEXTO: Después del pago, hay varias acciones:
//   - Enviar email de confirmación
//   - Actualizar inventario
//   - Registrar en analytics
// Queremos encolarlas y ejecutarlas en orden.
// Si alguna falla, poder reintentar solo las fallidas.
//
// 1. enqueue(): agrega comando a pendingCommands
// 2. processAll(): saca comandos de la cola y ejecuta cada uno
//    - Si execute() retorna true → agregar a executedCommands
//    - Si retorna false → agregar a failedCommands
// 3. retryFailed(): mueve failedCommands a pendingCommands y llama processAll()
// ══════════════════════════════════════════════════════════════

public class CommandQueue {
    private final Queue<OrderCommand> pendingCommands = new ArrayDeque<>();
    private final List<OrderCommand> executedCommands = new ArrayList<>();
    private final List<OrderCommand> failedCommands = new ArrayList<>();

    public void enqueue(OrderCommand command) {
        pendingCommands.add(command);
        System.out.printf("  📥 [QUEUE] Encolado: %s (pendientes: %d)%n",
                command.getCommandName(), pendingCommands.size());
    }

    public void processAll() {
        System.out.printf("%n  🚀 [QUEUE] Procesando %d comandos...%n", pendingCommands.size());

        while (!pendingCommands.isEmpty()) {
            OrderCommand command = pendingCommands.poll();
            boolean success = command.execute();

            if (success) {
                executedCommands.add(command);
                System.out.printf(" [QUEUE] Completado: %s%n", command.getCommandName());
            } else {
                failedCommands.add(command);
                System.out.printf(" [QUEUE] Fallido: %s%n", command.getCommandName());
            }
        }

        printSummary();
    }

    public void retryFailed() {
        if (failedCommands.isEmpty()) {
            System.out.println("  [QUEUE] No hay comandos fallidos para reintentar");
            return;
        }

        System.out.printf("%n  🔄 [QUEUE] Reintentando %d comandos fallidos...%n", failedCommands.size());
        List<OrderCommand> toRetry = new ArrayList<>(failedCommands);
        failedCommands.clear();
        toRetry.forEach(this::enqueue);
        processAll();
    }

    private void printSummary() {
        System.out.printf("%n  📊 [QUEUE] Resumen: ✅ %d exitosos,%d fallidos%n",
                executedCommands.size(), failedCommands.size());
    }

    public List<OrderCommand> getExecutedCommands() { return executedCommands; }
    public List<OrderCommand> getFailedCommands() { return failedCommands; }
}
