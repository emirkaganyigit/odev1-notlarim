package classes;
import java.util.Scanner; //import the scanner class

public class inputExamples {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in); //scanner object created
        System.out.println("Enter name, age and salary:  ");

        
        //String input
        String name= myObject.nextLine(); //read user input
        
        //Numerical Input
        int age = myObject.nextInt();
        double salary = myObject.nextDouble();
        
        
        
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        myObject.close();
    }
    
}
/*
 * Input Types
In the example above, we used the nextLine() method, which is used to read Strings. 
To read other types, look at the table below:

Method	Description
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
 */