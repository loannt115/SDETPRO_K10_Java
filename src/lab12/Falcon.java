package lab12;

import java.security.SecureRandom;

public class Falcon implements MoveAble, FlyAble {
    @Override
    public boolean flyAble() {
        return true;
    }

    int randomSpeed = new SecureRandom().nextInt(250);

    @Override
    public int speed() {
        return randomSpeed;
    }
}
