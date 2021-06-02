import java.util.Scanner;

public class HelloApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter a number:");
//        int a = keyboard.nextInt();
//
//        System.out.println("Enter another number:");
//        int b = keyboard.nextInt();
//
//        int sum = a + b;
//
//        System.out.println("The sum is" +sum);


        System.out.println("Enter your age:");
        int age = keyboard.nextInt();

        if (age >= 18){

            System.out.println("You are an adult");
        }else if(age>=10){
            System.out.println("Teenager");
        }else if(age>=2){
            System.out.println("child");
        }else {
            System.out.println("Baby");

        }

        final int i = 3;
        int i2 = 5;
        i2 = 4;
        int b = 3000;

        double d = b;
        byte b1 =(byte) b;

        System.out.println(b1);


        }






        }



