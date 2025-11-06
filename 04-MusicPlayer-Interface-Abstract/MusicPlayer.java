interface Playable {
    void play();
}

abstract class MusicDevice {
    String brand;

    MusicDevice(String brand) {
        this.brand = brand;
    }

    void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {

    CDPlayer(String brand) {
        super(brand);
    }
    public void play() {
        System.out.println("กำลัังเล่นเพลงจาก CD...");
    }
    void connect() {
        System.out.println("เชื่อมต่อแผ่น CD");
    }
}

class Smartphone extends MusicDevice implements Playable {

    Smartphone(String band) {
        super(band);
    }

    public void play() {
        System.out.println("กำลัังเล่นเพลงจาก Spotify");
    }

    void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        CDPlayer cd = new CDPlayer("LG");
        cd.connect();
        cd.info();
        cd.play();

        Smartphone phone = new Smartphone("Iphone");
        phone.connect();
        phone.info();
        phone.play();
    }

}