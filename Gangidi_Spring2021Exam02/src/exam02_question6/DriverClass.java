/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question6;

import java.util.Scanner;

/**
 *This is test class
 * @author Saikiran reddy Gangidi
 */
public class DriverClass {

    /**
     * This is main method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is the solution of sixth question - Saikiran Reddy Gangidi");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of triangle");
        System.out.print("Enter side1 : ");
        double side1=sc.nextDouble();
        System.out.print("Enter side2 : ");
        double side2=sc.nextDouble();
        System.out.print("Enter side3 : ");
        double side3=sc.nextDouble();
        System.out.print("Enter color for triangle : ");
        String color =sc.next();
        System.out.print("Enter boolean value that indicated figure to filled or not : ");
        boolean filled = sc.nextBoolean();
        Triangle triangle=new Triangle(side1,side2,side3,color,filled);
        System.out.println(triangle.toString());
        
    }
    
}
