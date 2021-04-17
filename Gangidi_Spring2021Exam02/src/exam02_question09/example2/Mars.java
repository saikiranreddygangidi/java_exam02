/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question09.example2;

/**
 *This is Mars Class Which extends 
 * @author Saikiran Reddy Gangidi
 */
public class Mars implements Planet{
    
    double time;

    public Mars(double time) {
       
        this.time = time;
    }
   public void size(){
        System.out.println("the size of Mars 2,106.1 mi ");           
    }
    public void color(){
        System.out.println("The color is Mars red");
    }
    
    public void rotation_period(){
        System.out.println("The no of rotation for "+time+" hours is "+(time/24.6));
    }
}
