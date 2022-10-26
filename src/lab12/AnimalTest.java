package lab12;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Falcon falcon = new Falcon();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();

        List<MoveAble> animalList = Arrays.asList(dog, eagle, falcon, horse, tiger);
        for (MoveAble animal : animalList) {
            System.out.println("{object_type = '" + animal.getClass().getSimpleName() + "', speed = '" + animal.speed() + " km/h'}");
        }

        List racebleAnimals = new AnimalController().getAnimalRacer(Arrays.asList(dog, eagle, falcon, horse, tiger));
        System.out.println("=== List of the raceable animals ===");
        for (Object animal : racebleAnimals) {
            System.out.println("{object_type = '" + animal.getClass().getSimpleName() + "}");
        }

        List<MoveAble> winnerList = new AnimalController().getWinnerList(racebleAnimals);
        String winnerListName = new lab12.AnimalController().animalListName(winnerList);
        System.out.println("==> " + winnerListName + " is/are the winner, with speed = "
                + winnerList.get(0).speed() + " km/h.");
    }
}
