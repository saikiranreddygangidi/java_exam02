/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question02;

import java.util.Scanner;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Exam02_question2 {

    /**
     * This is the main method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m1[][] =new int[3][3];
        int m2[][] =new int[3][3];
        Scanner sc =new Scanner(System.in);
        System.out.println(" This is the solution of second Question -Saikiran Reddy Gangidi");
        System.out.print("Enter list1: ");
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2[i].length;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        
        if(equals(m1,m2))
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are not strictly identical");
        
    }
    /**
     * This is equals method which compares two methods
     * @param m1 This is first parameter
     * @param m2 This is second parameter
     * @return Boolean value based upon the value in two 2DArrays
     */
    public static boolean equals(int[][] m1, int[][] m2){
        int flag =1;
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                if(m1[i][j] != m2[i][j]){
                    flag=0;
                    break;
                }
            }
            if(flag == 0)
                break;
                
        }
        
        return flag ==1;
        
    }
    
}
