package org.checkout.patterns._01_solid.isp;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot trabajando...");
    }
}
