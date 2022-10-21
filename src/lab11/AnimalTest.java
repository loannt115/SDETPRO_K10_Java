package lab11;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        dog.setName().setSpeed();
        horse.setName().setSpeed();
        tiger.setName().setSpeed();

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        List<Animal> winnerList = new AnimalController().getWinnerList(animalList);

        System.out.println("** Animal list:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }

        System.out.println("==> " + new AnimalController().animalListName(winnerList) + " is/are the winner, with speed = "
                + winnerList.get(0).getSpeed() + " km/h.");
    }
}
