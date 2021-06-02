package be.intecbrussel;
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);

//        System.out.println("Enter the month:");

        int month = 0;
        int days = 0;

//        switch (month) {
//            default: days = 0; break;
//            case 1: days = 31;  break;
//            case 2: days = 28;  break;
//            case 3: days = 21;  break;
//            case 4: days = 30;  break;
//            case 5: days = 31;  break;
//            case 6: days = 30;  break;
//            case 7: days = 31;  break;
//            case 8: days = 31;  break;
//            case 9: days = 30;  break;
//            case 10: days= 31;  break;
//            case 11: days = 30;  break;
//            case 12: days = 31;  break;
//
//
//        }

//        System.out.println(days);

         switch(month){
             default: days = 0; break;
             case 2: days =28; break;
             case 4:
             case 6:
             case 9:
             case 11: days = 30; break;
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12: days = 31;
         }
        System.out.println(days);
    }

}
