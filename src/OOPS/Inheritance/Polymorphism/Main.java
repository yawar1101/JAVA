package OOPS.Inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();

        Shapes circle = new Circle();
        circle.area();

        Shapes square = new Square();
        square.area();
    }
}
