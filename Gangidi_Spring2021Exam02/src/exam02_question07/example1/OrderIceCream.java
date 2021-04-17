/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question07.example1;

import exam02_question07.example1.IceCream;

/**
 *This is OrderIceCream Class
 * @author Saikiran Reddy Gangidi
 */
public class OrderIceCream {
private int nooficecreams;
        private String type;
    /**
     * This is parameter constructor
     * @param args the command line arguments
     */
        
    public OrderIceCream( String type,int nooficecreams) {
        this.nooficecreams = nooficecreams;
        this.type = type;
        // TODO code application logic here
        
    }
   /**
    * This method return count of no of ice creams
    * @return int returns no of ice creams
    */
    public int getNooficecreams() {
        return nooficecreams;
    }

    
/**
 * This method type of ice Cream
 * @return 
 */
    public String getType() {
        return type;
    }

   
    
/**
 * This is main method
 * @param args this is main method
 */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("This is solution of seventh question - Saikiran Reddy Gangidi");
                
                
        OrderIceCream oi=new OrderIceCream("kulfi",2);
        double prize=0;
       switch(oi.getType().toLowerCase()){
           case "kulfi": prize =IceCream.KULFI.getPrize()*oi.getNooficecreams();
                         break;
           case "sorbet": prize =IceCream.SORBET.getPrize()*oi.getNooficecreams();
                         break;
            case "custard": prize =IceCream.CUSTARD.getPrize()*oi.getNooficecreams();
                         break;
       }
       
        System.out.println("The icecream is "+oi.getType()+"\nThe total prize of "+oi.getNooficecreams()+"icecreams is : $"+prize);
    }
    
}
