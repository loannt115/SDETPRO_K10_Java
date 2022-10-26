package lab12;

import java.security.SecureRandom;

public class Tiger implements MoveAble, FlyAble {
    @Override
    public boolean flyAble() {
        return false;
    }

    int randomSpeed = new SecureRandom().nextInt(100);

    @Override
    public int speed() {
        return randomSpeed;
    }
}
