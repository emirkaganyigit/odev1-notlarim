public class forloopExamples {
    public static void main(String[] args) {
/*for (statement 1; statement 2; statement 3) {
code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed. */
for (int i = 0; i<5; i++){
    System.out.println(i);
}
for (int a = 0; a<10; a += 3){
    System.out.println(a);
}
/*
 There is also a "for-each" loop, which is used exclusively
  to loop through elements in an array (or other data sets):

for (type variableName : arrayName) {
    code block to be executed
}
 */

 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

 for (String car : cars){
    System.out.println(car);
 }






    }

}
