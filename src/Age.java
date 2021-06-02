import be.intecbrussel.Auto;

import java.util.Scanner;

public class Age {
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    System.out.println("Enter your age:");
    int age = keyboard.nextInt();

    if(age >=18){

        System.out.println("You are an adult");
    }else if(age>=10){
        System.out.println("Teenager");
    }else if(age>=2){
        System.out.println("child");
    }else{
        System.out.println("Baby");

    }


}


    public static class AutoTester {
        public class AutoApp {


            public void main(String[] args) {

                Auto auto;
                auto = new Auto("VW GOLF", "BHZ456");

                System.out.println("Test van: " + auto);


                for (int i = 0; i < 30; i++) {

                    auto.geefGas(3000);

                    auto.toonToerental();

                }

                System.out.println("REMMEN");

                auto.rem();


                for (int i = 0; i < 3; i++) {

                    auto.geefGas(3000);

                    auto.toonToerental();

                }

                Auto kopie = new Auto(auto);

                System.out.println("\nkopie: " + kopie);

            }
        }
    }
}