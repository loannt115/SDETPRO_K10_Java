package lab02;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        final float UNDERWEIGHT_THRESHOLD = 18.5F;
        final float NORMAL_THRESHOLD = 24.9F;
        final float OVER_WEIGHT_THRESHOLD = 29.9F;
        final float OBESITY_THRESHOLD = 30F;

        float height;
        float weight;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your height (m): ");
        if (scanner.hasNextFloat()) {
            height = scanner.nextFloat();
            System.out.print("Input your weight (kg): ");
            if (scanner.hasNextFloat()) {
                weight = scanner.nextFloat();

                float BMIScore = weight / (height * 2);
                System.out.println("Your BMI = " + BMIScore);
                System.out.println("***********************");

                float expected_weight_min = 37 * height;
                float expected_weight_max = 49.8F * height;
                float adjusted_weight_min;
                float adjusted_weight_max;

                if (BMIScore < UNDERWEIGHT_THRESHOLD && height > 0 && weight > 0) {
                    System.out.println("You are Underweight!");
                    adjusted_weight_min = expected_weight_min - weight;
                    adjusted_weight_max = expected_weight_max - weight;
                    System.out.println("You should gain from " + adjusted_weight_min + " to " + adjusted_weight_max + " (kg)!");
                } else if (BMIScore >= UNDERWEIGHT_THRESHOLD && BMIScore < NORMAL_THRESHOLD && height > 0 && weight > 0) {
                    System.out.println("You are Normal weight!");
                } else if (BMIScore >= NORMAL_THRESHOLD && BMIScore < OVER_WEIGHT_THRESHOLD && height > 0 && weight > 0) {
                    System.out.println("You are Overweight!");
                    adjusted_weight_min = weight - expected_weight_max;
                    adjusted_weight_max = weight - expected_weight_min;
                    System.out.println("You should lose from " + adjusted_weight_min + " to " + adjusted_weight_max + " (kg)!");
                } else if (BMIScore >= OBESITY_THRESHOLD && height > 0 && weight > 0) {
                    System.out.println("You are Obesity!");
                    adjusted_weight_min = weight - expected_weight_max;
                    adjusted_weight_max = weight - expected_weight_min;
                    System.out.println("You should lose from " + adjusted_weight_min + " to " + adjusted_weight_max + " (kg)!");
                } else {
                    System.out.println("Please input your weight/height correctly!");
                }
            } else {
                System.out.println("Please input your weight correctly!");
            }
        } else {
            System.out.println("Please input your height correctly!");
        }
    }
}
