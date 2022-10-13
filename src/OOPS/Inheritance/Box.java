package OOPS.Inheritance;

public class Box {
    double h;
    double w;
    double l;


    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    // Cube

    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double height, double width, double length) {
        this.h = height;
        this.w = width;
        this.l = length;
    }
}
