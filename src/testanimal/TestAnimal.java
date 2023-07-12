/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testanimal;

/**
 *
 * @author HOME
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---------------cat----------------
        Cat cat = new Cat(true, true, Animal.MOOD_HAPPY, 4); 
        cat.sayHello();
        cat.sayHello(1);
        System.out.println("cats have "+cat.getNumberOfLegs()+" legs");
        boolean catMammals = cat.isMammals();
        if (catMammals)
            System.out.println("cat is a mammal animal!");
        else
            System.out.println("cat is not a mammal animal!");
        
        //---------------dog----------------
        Dog dog = new Dog(true, true, Animal.MOOD_SCARE, 4);
        dog.sayHello();
         dog.sayHello(2);
        boolean dogCarnivorous = dog.isCarnivorous();
        if (dogCarnivorous)
            System.out.println("dog is a carnivorous animal!");
        else
            System.out.println("dog is not a carnivorous animal!");
        
        //---------------frog----------------
         Frog frog = new Frog(false, false, 1, 4);
        frog.sayHello(1); 
    }
    
}
