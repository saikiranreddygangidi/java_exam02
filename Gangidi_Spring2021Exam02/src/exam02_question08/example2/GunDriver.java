/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example2;

import exam02_question08.example2.AssaultGun;

/**
 *
 * @author S541902
 */
public class GunDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of question 8 - Saikiran Reddy Gangidi");
        Gun g =new AssaultGun(36,"black",10);
        System.out.println(g.toString());
        g.firing_speed();
          Gun g1 =new AssaultGun(46,"gold",20);
        System.out.println(g1.toString());
        g1.firing_speed();
    }
    
}
