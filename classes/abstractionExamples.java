package classes;

abstract class Animals {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("zzz");
    }
}

class Pig extends Animals {
    public void animalSound() {
        System.out.println("pig says wee wee");
    }
}

public class abstractionExamples {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound(); // "pig says wee wee"
        myPig.sleep();       // "zzz"
    }
}
