/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question09.example1;

import exam02_question09.example1.MusicInstrument;

/**
 *This  is test class
 * @author Saikiran Reddy Gangidi
 */
public class DriverClass {

    /**
     * This is main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MusicInstrument f1=new Flute(24.2);
        System.out.println("This is solution of ninth question - Saikiran Reddy Gangidi");
        System.out.println("-------------------------------------------------");
        f1.start();
        f1.stop();
        f1.shape();
        
        System.out.println("-------------------------------------------------");
         Flute f2=new Flute(30.2);
       
        f2.start();
        f2.stop();
        f2.shape();
        
        System.out.println("-------------------------------------------------");
    }
    
}
