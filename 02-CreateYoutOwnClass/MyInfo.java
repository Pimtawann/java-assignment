public class MyInfo {
    public MyInfo(){
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setSpeed(120);
        car1.displayInfo();
    }
}

class Car {
    private String brand;
    private int speed;

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed > 0) {
            speed = newSpeed;
        } else {
            System.out.println("Invalid speed!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }


}