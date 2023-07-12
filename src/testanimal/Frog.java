/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testanimal;

/**
 *
 * @author HOME
 */
public class Frog extends Animal implements Water, Land{
    
    private int numOfLegs; 
    
    public Frog(boolean mammals, boolean carnivorous, int mood, int numOfLegs){ 
        super(mammals, carnivorous, mood);
        if(numOfLegs==4)
            this.numOfLegs = numOfLegs;
        else
            System.out.println("The number of legs is incorrect!");
    }; 
    
    @Override
     public void sayHello() {
        // Frogs don't have a default greeting, so it can be left empty here
    }
    
    @Override
    public void sayHello(int mood){
         if(mood == MOOD_HAPPY)
            System.out.println("quack quack quack"); //מצב רוח טוב
        else
            System.out.println("plop into the water"); // מצב מפוחד
    };
    
    @Override
    public boolean hasGills(){ 
        return false;
    }; 
    
    @Override
    public boolean hasLaysEggs(){ 
        return true;
    }; 
    
    @Override
    public int getNumberOfLegs() {
        return numOfLegs;
    }
    
}
