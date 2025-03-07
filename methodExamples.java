public class methodExamples {
    public static void main(String [] args){
        myMethod("Emir", 21);
        myMethod("İlke", 20);
        checker(17);
        checker(21);
        System.out.println(summer(15, 17));

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        
    }

    static void myMethod(String name, int age){
        /*
        A method must be declared within a class. It is defined with the name of the method, 
        followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(),
         but you can also create your own methods to perform certain actions
        */
        System.out.println("Welcome: "+ name + ", your age is: " + age);

    }

    static void checker(int age){
        if (age < 18){
            System.out.println("access denied");
        }
        else{
            System.out.println("Access granted, welcome");
        }
    }

    /*In the previous page, we used the void keyword in all examples, 
    which indicates that the method should not return a value.
    If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) 
    instead of void, and use the return keyword inside the method: */
    static int summer(int x, int y){
        return x + y;

    }

    /*OVERLOADING same method name */
    static int plusMethod(int x, int y) {
        return x + y;
      }
      
      static double plusMethod(double x, double y) {
        return x + y;
      }
}
