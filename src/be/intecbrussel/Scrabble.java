package be.intecbrussel;
import java.io.*;
import java.util.Scanner;


public class Scrabble {
    public static void main(String[] args) throws IOException {
        Scanner kbd = new Scanner(System.in);
        int letterValue = 0;


        System.out.println("Enter a letter");
        char letter = (char)System.in.read();

        letter = Character.toLowerCase(letter);

        switch (letter) {
            default: letterValue = 0;break;
            case 'a':
            case 'e':
            case 'i':
            case 'l':
            case 'n':
            case 'o':
            case 'r':
            case 's':
            case 't':
            case 'u':letterValue = 1;break;

            case 'd':
            case 'g':letterValue = 2;break;

            case 'b':
            case 'c':
            case 'm':
            case 'p': letterValue = 3;break;

            case 'f':
            case 'h':
            case 'v':
            case 'y' :
            case 'w':letterValue = 4;break;

            case 'k':letterValue = 5;break;

            case 'j':
            case 'x':letterValue = 8;break;

            case 'q':
            case 'z':letterValue = 10;

        }
        System.out.println("The entered character would be a character of the alphabet");


        if (letterValue != 0) {
            System.out.println("The scrabble value of this letter is" + letterValue);
        }
        kbd.close();


    }
}

