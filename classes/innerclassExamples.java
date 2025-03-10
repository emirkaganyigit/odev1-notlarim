package classes;


class outerClass{
    int x = 5;

    class innerClass{
        int y = 10;
        public int myInnerMethod(){
            return x;
        }
    }
}





public class innerclassExamples {
    public static void main(String[] args) {
        outerClass outerObj = new outerClass();
        outerClass.innerClass innerObj = outerObj.new innerClass();
        System.out.println(String.valueOf(outerObj.x)+ String.valueOf(innerObj.y));
        System.out.println(outerObj.x + " " + innerObj.y);
        System.out.println(innerObj.myInnerMethod()); //Access Outer Class From Inner Class

    }
}

/*
 class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}
  An inner class can also be static, which means that you can access it without creating an object of the outer class:
 */