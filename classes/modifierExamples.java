package classes;
    /*
     The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

    We divide modifiers into two groups:

    Access Modifiers - controls the access level
    Non-Access Modifiers - do not control access level, but provides other functionality

    -----Access Modifiers-----
    ###For classes, you can use either public or default:
    public-->	The class is accessible by any other class	
    default-->	The class is only accessible by classes in the same package. This is used when you don't specify a modifier.

    
    ###For attributes, methods and constructors, you can use the one of the following:
    public-->	The code is accessible for all classes	
    private-->	The code is only accessible within the declared class	
    default-->  The code is only accessible in the same package. This is used when you don't specify a modifier.
    protected--> The code is accessible in the same package and subclasses.
    

    ------Non-Access Modifiers-----
    ###For classes, you can use either final or abstract:
    final-->	The class cannot be inherited by other classes 
    abstract-->	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.)


    ###For attributes and methods, you can use the one of the following:
    final-->	    Attributes and methods cannot be overridden/modified
    static-->	    Attributes and methods belongs to the class, rather than an object
    abstract-->	    Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). 
    transient-->	Attributes and methods are skipped when serializing the object containing them
    synchronized-->	Methods can only be accessed by one thread at a time
    volatile--> 	The value of an attribute is not cached thread-locally, and is always read from the "main memor
     */

public class modifierExamples {
    final int x = 10;
    final double PI = 3.14;
  
    public static void main(String[] args) {
      modifierExamples myObj = new modifierExamples();
      //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
      //myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
      System.out.println(myObj.x);
    }
  }

/*
 * Abstract
An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

Example
// Code from filename: Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}

🛑 Abstract Class'tan Nesne Oluşturamazsın!

Hayvan h = new Hayvan(); // HATA! Soyut sınıfın nesnesi OLAMAZ!
Ama onun alt sınıfını oluşturup, kullanabilirsin:
 */