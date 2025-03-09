package tutorial;
//Java'da 8 temel veri tipi (primitive type) vardır:

//Tam Sayılar: byte, short, int, long
//Ondalıklı Sayılar: float, double
//Karakterler: char
//Mantıksal Değerler: boolean
        

public class primitiveExamples{

        public static void main(String[] args){
            byte myByte = 100;      // Küçük tam sayılar için
            short myShort = 32000;  // Orta büyüklükte tam sayılar için
            int myInt = 500000;     // Genellikle kullanılan tam sayı tipi
            long myLong = 10000000000L; // Büyük tam sayılar için (sonunda 'L' yazılır)
    
            System.out.println(myByte);  // 100
            System.out.println(myShort); // 32000
            System.out.println(myInt);   // 500000
            System.out.println(myLong);  // 10000000000

            float myFloat = 3.14f;   // Float için 'f' eklenmeli
            double myDouble = 3.141592653589793;
            //📌 float değerlerinde f harfi eklemek zorundayız, çünkü Java varsayılan olarak double kullanır.
    
            System.out.println(myFloat);  // 3.14
            System.out.println(myDouble); // 3.141592653589793

            char letter = 'A';
            char numberChar = '7';
            char symbol = '@';
            char unicodeChar = '\u20AC'; // € (Euro işareti)
            //Dikkat chr Tek tırnak (') içinde yazılır

            System.out.println(letter);      // A
            System.out.println(numberChar);  // 7
            System.out.println(symbol);      // @
            System.out.println(unicodeChar); // €

            boolean isJavaFun = true;
            boolean isFishTasty = false;
    
            System.out.println(isJavaFun);  // true
            System.out.println(isFishTasty);
        }
}