package datastructure;


// utilizamos sout en vez de sysout

import java.util.Arrays;

public class MultiDemensionalArrayTest {
    public static void main(String[] args) {

        int rows = 10;
        int columns = 30;

        int[][] world = new int[rows][columns];
        int[][] numbers = {
                {1, 2, 3},
                {23, 4, 67},
                {1, 8, 345},
                {23, 34, 2767}};
        int[] arr = {2, 5677, 67, 89};
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
            System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + "");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(world[i][j] + "");
            }


        }
        //
        int depth = 3;
        int[][][] minecraftwolrd = new int[rows][columns][depth];
        for (int i = 0; i < minecraftwolrd.length; i++) {
            for (int j = 0; j < minecraftwolrd[i].length; j++) {
                for (int k = 0; k < minecraftwolrd[i][j].length; k++) {
                    minecraftwolrd[i][j][k] = i + j + k;
                }
            }

        }
        System.out.println("The first depth");
        for (int i = 0; i < minecraftwolrd.length; i++) {
            for (int j = 0; j < minecraftwolrd[i].length; j++) {
                System.out.print(minecraftwolrd[i][j][0] + "");
            }
            System.out.println();
        }

        System.out.println("The second depth");
        for (int i = 0; i < minecraftwolrd.length; i++) {
            for (int j = 0; j < minecraftwolrd[i].length; j++) {
                System.out.print(minecraftwolrd[i][j][1] + "");
            }
            System.out.println();
        }

        System.out.println("The third depth");
        for (int i = 0; i < minecraftwolrd.length; i++) {
            for (int j = 0; j < minecraftwolrd[i].length; j++) {
                System.out.print(minecraftwolrd[i][j][2] + "");
            }
            System.out.println();
        }

        for (int k = 0; k < depth; k++) {
            System.out.println("print ");
            for (int i = 0; i < minecraftwolrd.length; i++) {
                for (int j = 0; j < minecraftwolrd[i].length; j++) {
                    System.out.print(minecraftwolrd[i][j][k] + " ");
                }
                System.out.println();
            }

        }
    }
}
