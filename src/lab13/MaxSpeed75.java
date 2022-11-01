package lab13;

import java.security.SecureRandom;

public class MaxSpeed75 implements MoveSkill {
    int randomSpeed = new SecureRandom().nextInt(75);
    @Override
    public int speed() {
        return randomSpeed;
    }
}
