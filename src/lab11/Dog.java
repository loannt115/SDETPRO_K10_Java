package lab11;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public Animal setName() {
        this.name = "Dog";
        return this;
    }

    @Override
    public void setSpeed() {
        int randomSpeed = new SecureRandom().nextInt(60);
        this.speed = randomSpeed;
    }
}
