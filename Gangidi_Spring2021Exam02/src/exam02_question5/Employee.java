/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question5;

/**
 *This is Employee class which extends Person
 * @author Saikiran Reddy Gangidi
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phonenumber, String email,String office, double salary, String dateHired) {
        super(name, address, phonenumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    /**
     * This method office of employee
     * @return String returns office
     */
    public String getOffice() {
        return office;
    }

   
/**
 * This method return salary
 * @return String return salary
 */
    public double getSalary() {
        return salary;
    }


/**
 * This method return dateHired 
 * @return String dateHired
 */
    public String getDateHired() {
        return dateHired;
    }

   
/**
 * This method return complete details
 * @return  return Complete details
 */
    @Override
    public String toString() {
        return "Employee class \nName of the person is :- "+super.getName();
    }
    
    
}
