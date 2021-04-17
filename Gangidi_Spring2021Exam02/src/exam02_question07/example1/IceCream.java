/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question07.example1;

/**
 *This is IceCream ENUM class
 * @author S541902
 */
public enum IceCream {
    SORBET(4),CUSTARD(7),KULFI(12);
    private double prize;
    /**
     * This is parameter private constructor
     * @param prize This is first parameter
     */
    private IceCream(double prize) {
        this.prize = prize;
    }
/**
 * This method returns prize value
 * @return double Prize
 */
    public double getPrize() {
        return prize;
    }

  
}
