/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testanimal;

/**
 *
 * @author HOME
 */
public class Dog extends Animal implements Land{
    
     private int numOfLegs; 
    
    public Dog(boolean mammals, boolean carnivorous, int mood, int numOfLegs){ 
        super(mammals, carnivorous, mood);
        if(numOfLegs==4)
            this.numOfLegs = numOfLegs;
        else
            System.out.println("The number of legs is incorrect!");
    }; 
    
    @Override
    public void sayHello(){
        System.out.println("wagging their tails"); 
    };
    
    @Override
    public void sayHello(int mood){
        if(mood ==  MOOD_HAPPY)
            System.out.println("hau, hau"); //מצב רוח טוב
        else
            System.out.println("whooping"); // מצב מפוחד
    };
    
    @Override
    public int getNumberOfLegs(){
        return numOfLegs;
    };
}
