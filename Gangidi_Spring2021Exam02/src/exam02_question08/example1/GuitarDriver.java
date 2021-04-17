/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example1;

import exam02_question08.example1.ElectronicBassGuitar;
import exam02_question08.example1.Guitars;

/**
 *This is test class
 * @author Saikiran Reddy Gangidi
 */
public class GuitarDriver {

    /**
     * This is main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of eigth question - Saikiran Reddy gangidi");
        AcousticGuitars g1 = new AcousticGuitars("parlor",6,"steelstringacoustic");
        Guitars g2 = new ElectronicBassGuitar("bass guitar",4,"frets");
        System.out.println("---------------------------------");
        g1.play();
        System.out.println("---------------------------------");
               
        g2.play();
        System.out.println("---------------------------------");
    }
    
}
