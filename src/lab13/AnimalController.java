package lab13;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public List<Animal> getWinnerList(List<Animal> animalList){
        List<Animal> winnerList = new ArrayList<>();
        int maximumSpeed = 0;
        for (Animal animal : animalList) {
            if (animal.getSpeed() > maximumSpeed)
                maximumSpeed = animal.getSpeed();
        }
        for (Animal animal : animalList) {
            if (animal.getSpeed() == maximumSpeed)
                winnerList.add(animal);
        }
        return winnerList;
    }
    
    public List<Animal> getAnimalRacer(List<Animal> animalList){
        List<Animal> animalRacer = new ArrayList<>();
        for (Animal animal : animalList) {
            if(!animal.flyAble()){
                animalRacer.add(animal);
            }
        }
        return animalRacer;
    }

    public String animalListName (List<Animal> animalList){
        String animalListName = "";
        if (animalList.size() == 0) {
            animalListName = "List is empty.";
        } else if (animalList.size() == 1) {
            animalListName = animalList.get(0).getClass().getSimpleName();
        } else if (animalList.size() == 2) {
            animalListName = animalList.get(0).getClass().getSimpleName() + " and " + animalList.get(1).getClass().getSimpleName();
        } else {
            for (int index = 0; index < (animalList.size() - 2); index++) {
                animalListName = animalListName + animalList.get(index).getClass().getSimpleName() + ", ";
            }
            animalListName = animalListName
                    + animalList.get(animalList.size() - 2).getClass().getSimpleName()
                    + " and " + animalList.get(animalList.size() - 1).getClass().getSimpleName();
        }
        return animalListName;
    }
}
