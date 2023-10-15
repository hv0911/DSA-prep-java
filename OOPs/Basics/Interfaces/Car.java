package OOPs.Basics.Interfaces;

public class Car implements Engine,Brake {
    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void acc() {
        System.out.println("Accelarate the car");
    }
}
