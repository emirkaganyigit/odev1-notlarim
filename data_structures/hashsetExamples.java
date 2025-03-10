package data_structures;

import java.util.HashSet;
/*
 * Java HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
 */
public class hashsetExamples {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        //check if an item exists
        System.out.println(cars.contains("Mazda"));

        //to remove
        cars.remove("Volvo");

        cars.size();
        for (String i : cars) {
            System.out.println(i);
          }

        HashSet<Integer> numbers = new HashSet<Integer>();

      // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
      
          // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
          }
  }
}
