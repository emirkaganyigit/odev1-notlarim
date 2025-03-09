/*
 * Java Polymorphism
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. 
This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own 
implementation of an animal sound (the pig oinks, and the cat meows, etc.):
 */

package classes;

class Animal{
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig says wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog says haw haw");
    }
}
public class polymorphismExamples {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myAnimal2 = new Dog();
        Animal myAnimal3 = new Pig();

        myAnimal.animalSound();
        myAnimal2.animalSound();
        myAnimal3.animalSound();
    }
}