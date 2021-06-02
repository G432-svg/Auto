package be.intecbrussel;

   import java.util.*;
    public class MyClass {
        public static void main(String args[]) {
            int rows =4;
            int columns =6;


            int[][] array2d = {{0,4,5,6,16,17},{1,7,8,9,18,19},{2,10,11,12,20,21},{3,13,14,15,22,23}};

            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++)
                    array2d[i][j] = 0;
            }

            for (int i=0; i<array2d.length; i++) {
                for (int j=0; j<array2d[i].length; j++) {
                    System.out.print(array2d[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

