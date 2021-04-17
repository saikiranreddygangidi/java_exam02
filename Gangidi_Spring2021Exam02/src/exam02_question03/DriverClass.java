/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question03;

import java.util.ArrayList;
import java.util.Date;


/**
 *This is class is used to test another class
 * @author Saikiran Reddy Gangidi
 */
public class DriverClass {

    /**
     * This is the main method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList();
        System.out.println("This is the solution of third question - Saikiran Reddy Gangidi");
        Loan loan = new Loan("education",20000,9.8);
        list.add(loan);
       
        Date date=new Date();
        list.add(date);
        
        String name="saikiran reddy gangidi";
        list.add(name);
        
        Circle circle=new Circle(5.6);
        list.add(circle);
        System.out.println("--------------------------------------------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
            System.out.println("--------------------------------------------");
        }
        
        
        
        
    }
    
}
