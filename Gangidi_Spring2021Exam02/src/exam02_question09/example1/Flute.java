/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question09.example1;

import exam02_question09.example1.MusicInstrument;

/**
 *This is Flute class
 * @author Saikiran Reddy Gangidi
 */
public class Flute implements MusicInstrument {
    private double height;
    
/**
 * This is parameter constructor
 * @param height This is first parameter
 */
    public Flute(double height) {
        this.height = height;
    }
    /**
     *This method is start method
    */
    public void start(){
        System.out.println("flute started playing with height of "+height+"cms");
    }
    /**
     *This method is stop method
    */
    public void stop(){
        System.out.println("flute stoped playing with height of "+height+"cms");
                
    }
/**
 * This method height
 * @return double return height of flute
 */
    public double getHeight() {
        return height;
    }
/**
     *This is method is shape method
    */
    public void shape(){
        System.out.println("shape of the flute is long oval");
    }
    
}
