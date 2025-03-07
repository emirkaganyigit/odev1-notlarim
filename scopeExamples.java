public class scopeExamples{
    
    /*Instance (Nesne) Değişkenleri
    -Sınıf içinde ama metodun dışında tanımlanır.
    -Her nesne için ayrı bir değer taşır.
    -Varsayılan bir başlangıç değeri vardır.*/
    int instanceVar = 20; // Instance değişken (Metodun dışında)

    /* Static (Sınıf) Değişkenleri
    -static anahtar kelimesiyle tanımlanır.
    -Sınıfa aittir, tüm nesneler tarafından paylaşılır.
    -Nesne oluşturulmadan erişilebilir (ClassName.variableName).
    -Program çalışırken yalnızca bir kopyası bulunur. */
    static int staticVar = 50; // Static değişken

    public static void main(String[] args){

        scopeExamples obj1 = new scopeExamples();
        System.out.println("Instance değişken: " + obj1.instanceVar);

        /* Local (Yerel) Değişkenler
        -Bir metodun veya bloğun içinde tanımlanır.
        -Sadece o metodun/bloğun içinde erişilebilir.
        -Metot sona erdiğinde bellekten silinir.
        -Varsayılan değer almaz, kullanmadan önce başlatılmalıdır */
        
        int localVar = 10; // Bu değişken sadece main() içinde geçerli
        System.out.println("Local değişken: " + localVar);


        System.out.println("Static değişken: " + staticVar);
    }

}