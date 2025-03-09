/*The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
To achieve this, you must:
-declare class variables/attributes as private
-provide public get and set methods to access and update the value of a private variable

you learned from the previous chapter that private variables can only be accessed within the same class 
(an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, 
with the first letter in upper case:
*/

package classes;


public class encapsulationExamples {
    private String name;
    private int salary;

    //getter
    public String getName(){
        return name;
    }

    //getter
    public int getSalary(){
        return salary;
    }

    //setter 
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        /*
        Person myObj = new Person();
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error 
        */
        encapsulationExamples person = new encapsulationExamples();
        person.setName("emir");
        String result = person.getName();
        System.out.println(result);
      }
}
