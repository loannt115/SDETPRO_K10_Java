package lab09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        List<Animal> animalList = Arrays.asList(horse, tiger, dog);
        List<Animal> maximumSpeedAnimalList = new AnimalController().maximumSpeedAnimalList(animalList);

        for (Animal animal : animalList) {
            System.out.println("{object_type = '" + animal.getClass().getSimpleName() + "', speed = '" + animal.speed() + " km/h'}");
        }

        String maximumSpeedAnimalListName = new AnimalController().animalListName(maximumSpeedAnimalList);
        System.out.println(maximumSpeedAnimalListName + " is/are the winner, with speed = "
                            + maximumSpeedAnimalList.get(0).speed() + " km/h.");
    }
}
