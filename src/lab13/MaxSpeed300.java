package lab13;

import java.security.SecureRandom;

public class MaxSpeed300 implements MoveSkill {
    int randomSpeed = new SecureRandom().nextInt(300);
    @Override
    public int speed() {
        return randomSpeed;
    }
}
