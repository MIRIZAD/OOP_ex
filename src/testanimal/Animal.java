/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testanimal;

/**
 *
 * @author HOME
 */
public abstract class Animal{
    private boolean mammals; //יונק
    private boolean carnivorous; //טורף
    static final int MOOD_HAPPY = 1; //ערך קבוע עבור כל המופעים ובלתי ניתן לשינוי - static final
    static  final int MOOD_SCARE = 2; //ערך קבוע עבור כל המופעים ובלתי ניתן לשינוי -static final
    private int mood;
    
    public Animal(boolean mammals, boolean carnivorous, int mood){ 
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }; 
    
    public void setMammals(boolean mammals){ 
        this.mammals = mammals;
    }; 
    
    public boolean isMammals(){
        return mammals;
    };
    
    public void setCarnivorous(boolean carnivorous){
        this.carnivorous = carnivorous;
    };
    
    public boolean isCarnivorous(){
       return carnivorous;
    }; 
    
    public abstract void sayHello(); //פונקציה מופשטת המחייבת מימוש במחלקות היורשות 
    
    public abstract void sayHello(int mood); //פונקציה מופשטת המחייבת מימוש במחלקות היורשות 
    
}
