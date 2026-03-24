package org.checkout.patterns._01_solid.isp;

class _RobotWorker implements _Worker {

    public void work() {
        System.out.println("Robot trabajando");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robot no come");
    }

    public void sleep() {
        throw new UnsupportedOperationException("Robot no duerme");
    }
}
