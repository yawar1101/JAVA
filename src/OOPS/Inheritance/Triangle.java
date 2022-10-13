package OOPS.Inheritance;

public class Triangle extends Shapes{
    int side;

    Triangle() {
        super();
        side = -1;
    }


    Triangle(int s) {
        side = s;
    }

    public void calPer() {
        int res = 4 * side;
        System.out.println("Perimeter = " + res);
    }
}
