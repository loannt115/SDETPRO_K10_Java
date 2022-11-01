package lab13;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Horse horse = new Horse();

        List<Animal> animalList = Arrays.asList(dog, eagle, horse);
        for (Animal animal : animalList) {
            System.out.println("{object_type = '" + animal.getClass().getSimpleName() + "', flyAble = " + animal.flyAble() + ", speed = '" + animal.getSpeed() + " km/h'}");
        }

        List<Animal> raceAbleAnimals = new AnimalController().getAnimalRacer(animalList);
        System.out.println("=== List of the race-able animals ===");
        for (Animal animal : raceAbleAnimals) {
            System.out.println("{object_type = '" + animal.getClass().getSimpleName() + "', flyAble = " + animal.flyAble() + ", speed = '" + animal.getSpeed() + " km/h'}");
        }

        List<Animal> winnerList = new AnimalController().getWinnerList(raceAbleAnimals);
        String winnerListName = new AnimalController().animalListName(winnerList);
        System.out.println("==> " + winnerListName + " is/are the winner, with speed = "
                + winnerList.get(0).getSpeed() + " km/h.");
    }
}
