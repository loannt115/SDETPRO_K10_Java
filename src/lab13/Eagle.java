package lab13;

public class Eagle extends Animal {
    public Eagle() {
        flySkill = new CanFly();
        moveSkill = new MaxSpeed300();
    }
}
