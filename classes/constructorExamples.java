package classes;

public class constructorExamples {
/* 
  int x;  // Create a class attribute
  
  // Create a class constructor for the Main class    
  //constructor here!!
  public constructorExamples(int y) {
    x = y;  // Set the initial value for the class attribute x
    }
*/



  int modelYear;
  String modelName;

  public constructorExamples(int year, String name){ //create a constructor
    modelName = name;
    modelYear = year;
  }
  
  public static void main(String[] args) {
  /*
    constructorExamples myObj = new constructorExamples(5); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  */
    constructorExamples newCar = new constructorExamples(1998,"mustang");
    System.out.println(newCar.modelName+" " + newCar.modelYear);

    }
  }
  
  // Outputs 5