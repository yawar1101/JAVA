package OOPS.Interfaces;

public class Car implements  Engine, Media{
    @Override
    public void start() {
        System.out.println("I am starting like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I am accelerating like a normal car");
    }
}
