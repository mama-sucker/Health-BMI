
// Module 3 Excercise 3.6
// By Addison Roy

// Imports
import java.util.Scanner;

public class Health {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Get your BMI Today!\n");

        System.out.print("Enter weight in LBS: ");
        double weightInLbs = scanner.nextDouble();

        System.out.print("Enter height in feet: ");
        int feet = scanner.nextInt();

        System.out.print("Enter height in inches: ");
        int inches = scanner.nextInt();

        double weightInKg = weightInLbs * 0.45359237;
        double heightInMeters = ((feet * 12) + inches) * 0.0254;
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.printf("BMI is %.15f\n", bmi);
        System.out.println("Your BMI is " + category);
    }
}