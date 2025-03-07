public class classExamples {
    int x = 5;
    final int y = 3;
    int c;
    String name = "Emir Kagan Yigit";
    public static void main(String[] args) {
        classExamples myObj = new classExamples();
        objectsExamples myObj2 = new objectsExamples();
        System.out.println(myObj.x);
        System.out.println(myObj2.z);
        myObj.x = 40;
        System.out.println(myObj.x);
        //myObj.y = 21;
        //System.out.println(myObj.y);
        myObj.c = 24;
        System.out.println(myObj.c);
        classExamples myObj3 = new classExamples();
        myObj3.x = 27;
        System.out.println(myObj.x); //40
        System.out.println(myObj3.x); //27
        System.out.println("Welcome: " + myObj.name);





        
    }
}
