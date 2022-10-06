package lab09;

import java.security.SecureRandom;

public class Tiger extends Animal {
    static int randomSpeed = new SecureRandom().nextInt(100);
    public Tiger() {
        super(randomSpeed);
    }
}
