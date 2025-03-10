package data_structures;
import java.util.ArrayList;
import java.util.Collections;

public class arrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        //add with index
        cars.add(0,"Mazda");
        System.out.println(cars);

        //access item with index
        System.out.println(cars.get(2));

        //change an item
        cars.set(0, "Opel");
        System.out.println(cars);

        //remove item with index
        cars.remove(2);
        System.out.println(cars);

        //to remove all
        //cars.clear();

        //size of the arrayList
        System.out.println(cars.size());
        
        //loop through an arrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
          }

        for (String i : cars) {
            System.out.println(i);
        }
        
        //sort arrayList
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
        System.out.println(i);
        }

        //other types
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
    
        Collections.sort(myNumbers);  // Sort myNumbers
    
        for (int i : myNumbers) {
          System.out.println(i);
        }
    }


}
