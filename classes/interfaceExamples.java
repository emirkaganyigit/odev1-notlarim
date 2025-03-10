package classes;
/*
*Interfaces
Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group related methods with empty bodies:
*/ 

interface Fruit{
    public void color(); // interface method (does not have a body)
    public void taste(); // interface method (does not have a body)
}

/*To access the interface methods, the interface must be "implemented" 
(kinda like inherited) by another class with the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class:*/


// Apple "implements" the Fruit interface
class Apple implements Fruit{
    public void color(){
        // The body of color() is provided here
        System.out.println("Apple is red");
    }
    public void taste(){
        // The body of taste() is provided here
        System.out.println("apple is sweet");
    }
}


//Multiple Interfaces
interface firstInterface{
    public void myMethod(); //interface method
}

interface secondInterface{
    public void myOtherMethod(); //interface method 
}

class demoClass implements firstInterface, secondInterface{
    public void myMethod(){
        System.out.println("text text");
    }
    public void myOtherMethod(){
        System.out.println("test test");
    }
}
public class interfaceExamples {
    public static void main(String[] args) {
        Apple myApple = new Apple();
        myApple.color();
        myApple.taste();

        demoClass myObj = new demoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
