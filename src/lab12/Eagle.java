package lab12;

import java.security.SecureRandom;

public class Eagle implements MoveAble, FlyAble {
    @Override
    public boolean flyAble() {
        return true;
    }

    int randomSpeed = new SecureRandom().nextInt(300);

    @Override
    public int speed() {
        return randomSpeed;
    }
}
