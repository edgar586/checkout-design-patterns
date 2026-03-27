package workshop.command;

public interface OrderCommand {
    boolean execute();
    String getCommandName();

}
