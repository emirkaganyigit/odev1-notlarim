/*
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte 
*/


public class castingExamples {
    
    public static void main(String[] args){
        //implicit casting (otomatik)

        int num = 100;
        double doubleNum = num; // int → double (Otomatik dönüşüm)
        System.out.println("Integer: " + num);       // 100                
        System.out.println("Double: " + doubleNum);  // 100.0
        
        //byte → short → int → long → float → double
        //Soldan sağa gidildikçe dönüşüm otomatik olur.


        // Explicit (Zorunlu) Casting (Daraltma)
        double double_num = 9.78;
        int intNum = (int) double_num; // double → int (Manuel dönüşüm)

        System.out.println("Double: " + double_num); // 9.78
        System.out.println("Integer: " + intNum);   // 9 (Ondalık kısım kayboldu!)
    }
}
