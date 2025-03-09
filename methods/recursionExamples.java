package methods;
public class recursionExamples {
    public static void main(String[] args) {
        int z= sumMethod(10);
        System.out.println(z);
    }

    static int sumMethod(int number){
        if (number <= 0){
            return 0;
        }
        else {
            return sumMethod(number-1) + number;
        }
    }
}
