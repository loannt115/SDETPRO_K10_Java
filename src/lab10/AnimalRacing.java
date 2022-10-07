package lab10;

import java.util.Arrays;
import java.util.List;

import static lab10.Animal.Builder;

public class AnimalRacing {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder
//                .setName("Snake")
//                .setSpeed(12)
//                .setFlyable(true);
//        Animal snake = builder.build();

        Animal eagle = new Builder().setName("Eagle").setSpeed(300).setFlyable(true).build();
        Animal falcon = new Builder().setName("Falcon").setSpeed(250).setFlyable(true).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(100).setFlyable(false).build();
        Animal snake = new Builder().setName("Snake").setSpeed(20).setFlyable(false).build();
        Animal owl = new Builder().setName("Owl").setSpeed(260).setFlyable(true).build();
        Animal horse = new Builder().setName("Horse").setSpeed(75).setFlyable(false).build();

        List<Animal> animalList = Arrays.asList(eagle, falcon, tiger, snake, owl, horse);
        List<Animal> raceableList = new AnimalController().getAnimalRacer(animalList);
        List<Animal> winnerList = new AnimalController().getWinnerList(animalList);

        System.out.println("** Animal list:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }

        System.out.println("** Raceable animal list:");
        for (Animal animal : raceableList) {
            System.out.println(animal);
        }

        System.out.println("==> " + new AnimalController().animalListName(winnerList) + " is/are the winner, with speed = "
                + winnerList.get(0).getSpeed() + " km/h.");
    }
}
