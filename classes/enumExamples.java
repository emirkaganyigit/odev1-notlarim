package classes;
/*An enum is a special "class" that represents a group of constants 
(unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), 
and separate the constants with a comma. Note that they should be in uppercase letters: */






public class enumExamples {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        switch (myVar) {
            case LOW:
                System.out.println("low level");
                break;
            case MEDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("high level");
                break;
        }

        for (Level myVar2 : Level.values()){
            System.out.println(myVar2);
        }
    }
}
/*Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. 
The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, 
like month days, days, colors, deck of cards, etc. */