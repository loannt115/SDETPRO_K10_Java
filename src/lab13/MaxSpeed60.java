package lab13;

import java.security.SecureRandom;

public class MaxSpeed60 implements MoveSkill {
    int randomSpeed = new SecureRandom().nextInt(60);
    @Override
    public int speed() {
        return randomSpeed;
    }
}
