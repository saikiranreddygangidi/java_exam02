/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question04.example1;

import exam02_question04.example1.Car;
import exam02_question04.example1.ElectronicCar;
import exam02_question04.example1.GasCar;

/**
 *This is Class which is used to test other class
 * @author Saikiran Reddy Gangidi
 */
public class DriverClass {

    /**
     * this is main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution for fourth Question");
        Car car1=new ElectronicCar("telsa","x-car",86000,1200);
        Car car2 = new GasCar("audi","r8",96000,84);
        System.out.println("-----------------------------------");
        System.out.println(car1.toString());
         System.out.println("-----------------------------------");
        System.out.println(car2.toString());
         System.out.println("-----------------------------------");
    }
    
}
