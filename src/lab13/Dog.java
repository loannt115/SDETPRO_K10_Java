package lab13;

public class Dog extends Animal {
    public Dog() {
        flySkill = new CanNotFly();
        moveSkill = new MaxSpeed60();
    }
}
