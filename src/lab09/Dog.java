package lab09;

import java.security.SecureRandom;

public class Dog extends Animal {
    static int randomSpeed = new SecureRandom().nextInt(60);
    public Dog() {
        super(randomSpeed);
    }

//    *** way 2 ***
//    public Dog() {
//        super(60);
//    }
}
