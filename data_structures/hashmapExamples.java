package data_structures;

import java.util.HashMap;

/*
In the ArrayList chapter, you learned that Arrays store items as an ordered collection, 
and you have to access them with an index number (int type). 
A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: 
String keys and Integer values, or the same type, like: String keys and String values:
 */
public class hashmapExamples {
    public static void main(String args[]){
        //create hashmap object
        HashMap<String, String> capitalCities= new HashMap<String, String>();

        //add keys and values 
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Holland", "Amsterdam");
        capitalCities.put("Türkiye", "Ankara");
        System.out.println(capitalCities);
        //to access value
        System.out.println(capitalCities.get("England"));
        //to remove
        capitalCities.remove("England");
        System.out.println(capitalCities);
        //remove all
        //capitalCities.clear();

        //size
        System.out.println(capitalCities.size());

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String x : capitalCities.values()) {
            System.out.println(x);
        }

// Print keys and values
        for (String c : capitalCities.keySet()) {
            System.out.println("key: " + c + " value: " + capitalCities.get(c));
        }

    }
}
