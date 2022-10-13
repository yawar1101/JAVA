package OOPS.Inheritance;

public class Bicycle {
    int gear, speed;


    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n" + "Speed of bicycle is " + speed);
    }
}
