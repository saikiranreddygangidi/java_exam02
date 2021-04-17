/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example1;

import exam02_question08.example1.Guitars;

/**
 *This is ElectronicBassGuitar Class
 * @author Saikiran Reddy Gangidi
 */
public class ElectronicBassGuitar extends Guitars{
       private String model;

    /**
     * this is parameter constructor
     * @param name This is first parameter
     * @param noofStrings This is second parameter
     * @param model  This is third parameter
     */
    public ElectronicBassGuitar( String name,int noofStrings,String model) {
        super(noofStrings, name);
        this.model = model;
    }
/**
 * This method return model
 * @return String model
 */
    public String getModel() {
        return model;
    }

  
    
/**
 * This method implement which as structure in abstract class
 */
    public void play(){
        System.out.println("playing the "+super.getName()+"\nthis Guitar has  "+super.getNoofStrings() +" Strings \nThe model is "+getModel());
    }
    
}
