import java.util.Random;
import java.util.Scanner;

public class BmiUtility {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your weight (kg):");
        float weight = keyboard.nextFloat();

        System.out.println("Enter your height (m):");
        float height = keyboard.nextFloat();



        float Bmi = weight/(height*height)*10000;
        System.out.println("Your Bmi is:"+ Bmi);

        if (Bmi<20) {
            System.out.println("Underweight");
        } else if (Bmi<25){
            System.out.println("Ok");
        } else if (Bmi<30){
            System.out.println("Overweight");
        } else if (Bmi<40) {
            System.out.println("Obesity");
        }else if (Bmi>=40) {
            System.out.println("Sickly overweight");
        }


    }
}
