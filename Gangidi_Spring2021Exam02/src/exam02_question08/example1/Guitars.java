/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example1;

/**
 *This is Guitars class
 * @author Saikiran Reddy Gangidi
 */
public abstract class Guitars {
    private int noofStrings;
    private String name;
/**
 * This is parameter constructor
 * @param noofStrings This is first parameter
 * @param name This is second parameter
 */
    public Guitars(int noofStrings, String name) {
        this.noofStrings = noofStrings;
        this.name = name;
    }
/**
 * This method return no of Strings for guitars
 * @return int no of String
 */
    public int getNoofStrings() {
        return noofStrings;
    }

   
/**
 * This method return name 
 * @return String return name
 */
    public String getName() {
        return name;
    }

 /**
  * This method is abstract method
  */
   abstract public void play();
    
}
