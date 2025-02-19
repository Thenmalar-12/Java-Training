import java.util.*;

abstract class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    public abstract void start();
}

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void start() {
        System.out.println(getBrand() + " car is starting at speed " + getSpeed() + " km/h.");
    }
}

public class oops {
    public static void main(String[] args) {

        Car myCar = new Car("Benz", 60);

        myCar.start();

        myCar.setSpeed(80);
        System.out.println("Updated Speed: " + myCar.getSpeed() + " km/h");

        myCar.start();
    }
}
