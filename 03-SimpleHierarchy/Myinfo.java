class Vehicle {
    private String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }

    void start() {
        System.out.println(this.brand + " is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println(this.getBrand() + " is moving on the road.");
    }
}

class Boat extends Vehicle {
    void sail() {
        System.out.println(this.getBrand() + " is sailing on the water.");
    }
}

public class Myinfo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Porsche");
        car.start();
        car.drive();

        System.out.println("----------------");

        Boat boat = new Boat();
        boat.setBrand("Beneteau");
        boat.start();
        boat.sail();
    }
    
}
