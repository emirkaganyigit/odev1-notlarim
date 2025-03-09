package tutorial;
public class ifelseExamples {
    public static void main(String[] args){
        int a = 15;
        int b = 10;
        if (a>b){
            System.out.println("A is bigger");
            b = b+ 5;
        } else if( a == b){
            System.out.println("they are equal");
        } else {
            System.out.println("B is bigger");
        }


        /*
Short Hand if...else
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

SyntaxGet your own Java Server
variable = (condition) ? expressionTrue :  expressionFalse; */
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
