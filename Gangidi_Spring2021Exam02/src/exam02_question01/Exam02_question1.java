/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *This class delete the duplicate elements in array list
 * @author Saikiran Reddy Gangidi
 */
public class Exam02_question1 {

    /**
     * This is main method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("This is the solution of first question - Saikiran Reddy Gangidi");
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            int a =sc.nextInt();
            list.add(a);
            
        }
        removeDuplicate(list);
         System.out.print("The distinct integers are ");
        for(Integer i :list)
                System.out.print(i+" ");
        
    }
    /**
     * This method remove duplicate values 
     * @param list the ArrayList which all the values
     */
    public static void removeDuplicate(ArrayList<Integer> list){
        for(int i =0;i<list.size();i++){
            if(i!=list.indexOf(list.get(i)) && list.get(i) == list.get(list.indexOf(list.get(i)))){
                //System.out.println(list.get(i)+" "+list.get(list.indexOf(list.get(i))));
                list.remove(i);
                i--;
            }
            
            
        }
        
       
        
    }
    
}
