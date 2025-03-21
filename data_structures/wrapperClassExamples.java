package data_structures;

/*
 * Java Wrapper Classes
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type	Wrapper Class
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
boolean	Boolean
char	Character
Sometimes you must use wrapper classes, for example when working with Collection objects, 
such as ArrayList, where primitive types cannot be used (the list can only store objects):
 */

public class wrapperClassExamples {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        //Another useful method is the toString() method, which is used to convert wrapper objects to strings.
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
      }
    
}
