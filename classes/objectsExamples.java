package classes;
//REFERANS (NESNE) TİPLERİ

public class objectsExamples {
    int z = 7;
    public static void main(String[] args){
        //2.1 String (Metin)
        String message = "Hello - World";
        System.out.println(message);

        //2.2 Diziler (Array)
        int[] numbers = {1, 2, 3, 4, 5}; // Bir dizi tanımlama

        System.out.println(numbers[0]); // İlk eleman: 1
        System.out.println(numbers[2]); // Üçüncü eleman: 3
        
        //2.3 Sarmalayıcı Sınıflar (Wrapper Classes)
        Integer num = 10;  // int yerine Integer
        Double pi = 3.14;  // double yerine Double
        Boolean isJavaFun = true; // boolean yerine Boolean

        System.out.println(num);  // 10
        System.out.println(pi);   // 3.14
        System.out.println(isJavaFun); // true
        /* Primitive türlere göre avantajları:
           -null değer alabilir.
           -Nesne tabanlı işlemler için kullanılabilir. */
    }
    
}
