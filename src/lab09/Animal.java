package lab09;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int speed) {
        this.speed = speed;
    }
//    *** way 2 ***
//    public Animal(int speed) {
//        this.speed = new SecureRandom().nextInt(speed);
//    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int speed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
