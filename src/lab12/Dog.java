package lab12;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble {

    @Override
    public boolean flyAble() {
        return false;
    }

    int randomSpeed = new SecureRandom().nextInt(60);

    @Override
    public int speed() {
        return randomSpeed;
    }
}
