package lab12;

import java.security.SecureRandom;

public class Horse implements MoveAble, FlyAble {
    @Override
    public boolean flyAble() {
        return false;
    }

    int randomSpeed = new SecureRandom().nextInt(75);

    @Override
    public int speed() {
        return randomSpeed;
    }
}
