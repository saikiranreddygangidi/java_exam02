/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example1;

import exam02_question08.example1.Guitars;

/**
 *This is AcousticGuitars class
 * @author Saikiran Reddy Gangidi
 */
public class AcousticGuitars extends Guitars{
    private String model;

    /**
     * This is parameter constructor 
     * @param name This is first parameter
     * @param noofStrings This is second parameter
     * @param model This is third parameter
     */
    public AcousticGuitars( String name,int noofStrings,String model) {
        super(noofStrings, name);
        this.model = model;
    }
/**
 * This method return model
 * @return String return model
 */
    public String getModel() {
        return model;
    }

  /**
   * This is method is implemented
   */
    public void play(){
        System.out.println("playing the "+super.getName()+"\nthis Guitar has  "+super.getNoofStrings() +" Strings \nThe model is "+getModel());
    }
}
