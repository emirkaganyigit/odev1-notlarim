package tutorial;
public class switchExamples {
    public static void main(String[] args) {
        int day = 5;
        
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2: 
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;

            //case'lerin hiçbiri çalışmazsa default çalışır
            default:
                System.out.println("Other days except first 3");

        }
    }
}
