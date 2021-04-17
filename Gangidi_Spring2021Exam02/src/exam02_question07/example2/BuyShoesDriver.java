/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question07.example2;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class BuyShoesDriver {

    /**
     * @param args the command line arguments
     */
    String model;

    public BuyShoesDriver(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double prize=0;
        System.out.println("This is solution of seventh question - Saikiran Reddy Gangidi");
        BuyShoesDriver b=new BuyShoesDriver("blazer");
         switch(b.getModel().toLowerCase()){
           case "blazer": prize =NikeShoes.BLAZER.getPrize();
                         break;
           case "vapomax": prize =NikeShoes.VAPORMAX.getPrize();
                         break;
            
       }
        System.out.println("The prize of shoe is "+prize);
    }
    
}
