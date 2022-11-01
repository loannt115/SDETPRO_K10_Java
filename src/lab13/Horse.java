package lab13;

public class Horse extends Animal {
    public Horse() {
        flySkill = new CanNotFly();
        moveSkill = new MaxSpeed75();
    }
}
