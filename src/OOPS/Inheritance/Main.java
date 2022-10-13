package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.printf(box1.l + " " + box1.w + " " + box1.h);
//        Box box2 = new Box(4);
//        System.out.println(box2.h + " " + box2.w + " " + box2.l);
//        Box box3 = new Box(12, 13, 14);
//        System.out.println(box3.h + " " + box3.w + " " + box3.l);
//
//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.h + " " + box4.weight);
//
//        BoxWeight box5 = new BoxWeight(13, 11, 10, 4);
//        System.out.println(box5.l + " " + box5.w + " " + box5.h + " " + box5.weight);

//        Shapes obj = new Shapes();
//
//        obj.color = "Red";
//        obj.name = "MyName";
//
//
//
//        Triangle obj1 = new Triangle(4);
//
//        obj1.calPer();

        MountainBike mb = new MountainBike(3, 100, 25);

        System.out.println(mb.toString());


        Bicycle bc = new Bicycle(5, 150);
        bc.applyBrakes(10);

        System.out.println(bc.toString());
    }
}
