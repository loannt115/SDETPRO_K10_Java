package lab13;

public class Animal {
    protected FlySkill flySkill;

    protected boolean flyAble(){
        return flySkill.fly();
    }

    public void setFlySkill(FlySkill flySkill){
        this.flySkill = flySkill;
    }

    protected MoveSkill moveSkill;

    protected int getSpeed(){
        return moveSkill.speed();
    }
}
