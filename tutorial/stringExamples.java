package tutorial;
public class stringExamples {
    public static void main(String[] args){
        //String greeting = "Hello";
        //String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //System.out.println("The length of the txt string is: " + txt.length());
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        
        String text1 = "Please locate where 'locate' occurs!";
        System.out.println(text1.indexOf("locate")); // Outputs 7
        
        
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);


    }
}
