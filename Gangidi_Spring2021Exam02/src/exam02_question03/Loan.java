/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question03;

/**
 *This is Loan class
 * @author Saikiran Reddy Gangidi
 */
public class Loan {
    private double interest;
    private String loantype;
    private double loanamount;

    /**
     *This is parameter construction
     * @param loantype This is first parameter 
     * @param loanamount This is second Parameter
     * @param interest This is third parameter
     */
    public Loan( String loantype, double loanamount,double interest) {
        this.interest = interest;
        this.loantype = loantype;
        this.loanamount = loanamount;
    }

    /**
     * This method returns interest instance value
     * @return double return interest value
     */
    public double getInterest() {
        return interest;
    }

    
   

    /**
     *This method returns LoanType instance value
     * @return String return loan type value
     */
    public String getLoantype() {
        return loantype;
    }

  

    /**
     *This return loan amount
     * @return double return LoanAmount value
     */
    public double getLoanamount() {
        return loanamount;
    }


    /**
     *This method return all details of the class
     * @return String complete details
     */
    @Override
    public String toString() {
        return  "loan detials\nloantype = " + loantype + "\nloanamount = " + loanamount+"\ninterest = " + interest  ;
    }
    
    
    
}
