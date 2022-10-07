package lab10;


import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public List<Animal> getWinnerList(List<Animal> animalList) {
        List<Animal> raceableAnimals = getAnimalRacer(animalList);
        int maximumSpeed = 0;
        List<Animal> maximumSpeedAnimalList = new ArrayList<>();
        for (int index = 0; index < raceableAnimals.size(); index++) {
            if (raceableAnimals.get(index).getSpeed() > maximumSpeed)
                maximumSpeed = raceableAnimals.get(index).getSpeed();
        }
        for (int index = 0; index < raceableAnimals.size(); index++) {
            if (raceableAnimals.get(index).getSpeed() == maximumSpeed)
                maximumSpeedAnimalList.add(raceableAnimals.get(index));
        }
        return maximumSpeedAnimalList;
    }

    public List<Animal> getAnimalRacer(List<Animal> animalList){
        List<Animal> raceableAnimals = new ArrayList<>();
        for (int index = 0; index < animalList.size(); index++) {
            if (!animalList.get(index).isFlyable()){
                raceableAnimals.add(animalList.get(index));
            }
        }
        return raceableAnimals;
    }

    public String animalListName(List<Animal> animalList) {
        String animalListName = "";
        if (animalList.size() == 0) {
            animalListName = "List is empty.";
        } else if (animalList.size() == 1) {
            animalListName = animalList.get(0).getName();
        } else if (animalList.size() == 2) {
            animalListName = animalList.get(0).getName() + " and " + animalList.get(1).getName();
        } else {
            for (int index = 0; index < (animalList.size() - 2); index++) {
                animalListName = animalListName + animalList.get(index).getName() + ", ";
            }
            animalListName = animalListName
                    + animalList.get(animalList.size() - 2).getName()
                    + " and " + animalList.get(animalList.size() - 1).getName();
        }
        return animalListName;
    }
}
