package tutorial;
public class operatorExamples {
    
    public static void main(String[] args){
        int a = 10, b = 3;            
        System.out.println("Toplama: " + (a + b)); // 13
        System.out.println("Çıkarma: " + (a - b)); // 7
        System.out.println("Çarpma: " + (a * b)); // 30                System.out.println("Bölme: " + (a / b)); // 3 (Tamsayı bölme!)
        System.out.println("Modül: " + (a % b)); // 1

        int x = 10;
        x += 5; // x = x + 5
        System.out.println("x'in yeni değeri: " + x); // 15
        
        /* 
        int a = 10, b = 20;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        */
        /*
        
        int x = 5;
        x++; // x = 6
        x--; // x = 5
        */

        boolean c = true, d = false;
        System.out.println(c && d); // false (and)
        System.out.println(c || d); // true (or)
        System.out.println(!c);     // false (negate)

        
    }
}
