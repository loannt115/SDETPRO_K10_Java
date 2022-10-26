package lab12;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public List<MoveAble> getWinnerList(List<MoveAble> animalList){
        List<MoveAble> maximumSpeedAnimalList = new ArrayList<>();
        int maximumSpeed = 0;
        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index).speed() > maximumSpeed)
                maximumSpeed = animalList.get(index).speed();
        }
        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index).speed() == maximumSpeed)
                maximumSpeedAnimalList.add(animalList.get(index));
        }
        return maximumSpeedAnimalList;
    }

    public List<FlyAble> getAnimalRacer(List<FlyAble> animalList){
        List<FlyAble> raceableAnimals = new ArrayList<>();
        for (int index = 0; index < animalList.size(); index++) {
            if (!animalList.get(index).flyAble()){
                raceableAnimals.add(animalList.get(index));
            }
        }
        return raceableAnimals;
    }

    public String animalListName (List<MoveAble> animalList){
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
