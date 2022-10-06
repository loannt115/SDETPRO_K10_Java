package lab09;

import java.security.SecureRandom;

public class Horse extends Animal {
    static int randomSpeed = new SecureRandom().nextInt(75);
    public Horse() {
        super(randomSpeed);
    }
}
