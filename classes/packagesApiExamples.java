/*A package in Java is used to group related classes. Think of it as a folder in a file directory.
 We use packages to avoid name conflicts, and to write a better maintainable code. 
 Packages are divided into two categories:
    -Built-in Packages (packages from the Java API)
    -User-defined Packages (create your own packages) 
    
    To import a whole package, end the sentence with an asterisk sign (*). 
    The following example will import ALL the classes in the java.util package:
        -import java.util.*;
        
        */


package classes;
import java.util.Scanner;

public class packagesApiExamples {
    public static void main(String[] args) {
        Scanner newObject = new Scanner(System.in);
        System.out.println( "Enter username");

        String userName = newObject.nextLine();
        System.out.println("username is: "+userName );
        newObject.close();
    }
    
}