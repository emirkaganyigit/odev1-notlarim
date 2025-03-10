package classes;

import java.time.LocalDate;
import java.time.LocalTime;
public class dateandtimeExamples {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);
      }
}
