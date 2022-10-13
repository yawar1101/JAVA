package OOPS.Inheritance;

public class MountainBike extends Bicycle{
    int seatHeight;

    MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override

    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
