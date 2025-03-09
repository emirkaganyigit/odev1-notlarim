package classes;
public class classmethodExamples {

    /*
    Static vs. Public
    You will often see Java programs that have either static or public attributes and methods.

    In the example below, we created a static method, which means that it can be accessed without 
    creating an object of the class, unlike public, which can only be accessed by objects:

    when using public methods we must create an object which belongs to that class
     */
    static void myStaticMethod(){
        System.out.println("static method executed");
    }

    public void myPublicMethod(){
        System.out.println("public method executed");

    }


    //Access Methods With an Objects Example
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+ maxSpeed );
    }


    public static void main(String[] args) {
        myStaticMethod();

        //myPublicMethod();
        //Cannot make a static reference to the non-static method myPublicMethod() from the type classmethodExamples


        classmethodExamples newObj = new classmethodExamples();
        newObj.myPublicMethod();

        classmethodExamples myCar = new classmethodExamples();
        myCar.fullThrottle();
        myCar.speed(200);
    }


}
