public class whileExamples {
    public static void main(String[] args) {
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        
        }

        /*do-while döngüsü, en az bir kez çalışan ve belirli bir koşul sağlandığı sürece tekrar eden bir döngü türüdür.

📌 Java’da while ve do-while arasındaki temel fark şudur:

while döngüsünde, koşul başta kontrol edilir, eğer yanlışsa döngü hiç çalışmaz.
do-while döngüsünde, döngü en az bir kere çalışır çünkü koşul sonda kontrol edilir. */

        do {
            System.out.println(i);
            i--;
        }
        while (i>2);
    }
}
