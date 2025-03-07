import java.util.Arrays;

public class arrayExamples {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(Arrays.toString(myNum));

        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs Opel instead of Volvo

        System.out.println(cars.length);
// Outputs 4

        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }

        for (String i : cars) {
            System.out.println(i);
        }


/*
 Multidimensional Arrays
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces:
 */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
          }

    }
}
