/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question08.example2;

/**
 *
 * @author S541902
 */
public class AssaultGun extends Gun{
    double back_force;

    public AssaultGun(double back_force, String color, double width) {
        super(color, width);
        this.back_force = back_force;
    }
    
    
    public void firing_speed(){
        if(super.getWidth() >12)
            System.out.println("This is speed bullet is  120kmph with backforce "+back_force);
        else
             System.out.println("This is speed bullet is  240kmph with backforce "+back_force);
    }

    @Override
    public String toString() {
        return super.toString()+"\nAssaultGun{" + "back_force=" + back_force + '}';
    }
    
    
}
