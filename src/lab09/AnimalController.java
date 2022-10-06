package lab09;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public List<Animal> maximumSpeedAnimalList(List<Animal> animalList) {
        int maximumSpeed = 0;
        List<Animal> maximumSpeedAnimalList = new ArrayList<>();
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

    public String animalListName(List<Animal> animalList) {
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
