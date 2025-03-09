/*
 * Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
 */

package classes;
class Vehicle{
    protected String brand = "Ford";

    public void wheelNum(){
        System.out.println("Car has 4 wheels");
    }
}


class Truck extends Vehicle{
    public String modelName = "F 150";
    public void maxSpeed(){
        System.out.println("max speed is 140");
    }
}

class SedanCar extends Vehicle{
    public String modelName = "mustang";
    public void maxSpeed(){
        System.out.println("max speed is 200");
    }
}

public class inheritanceExamples{
    public static void main(String[] args) {
        SedanCar myCar = new SedanCar();
        Truck myCar2 = new Truck();
        myCar.wheelNum();
        myCar2.wheelNum();

        System.out.println(myCar.brand+" "+myCar.modelName);
        System.out.println(myCar2.brand+" "+myCar2.modelName);

    }
}