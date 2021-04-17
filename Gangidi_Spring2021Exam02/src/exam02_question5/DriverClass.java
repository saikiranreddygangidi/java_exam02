/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02_question5;

/**
 *This is driver class
 * @author Saikiran reddy gangidi
 */
public class DriverClass {

    /**
     * This is main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is the solution of fifth question - Saikiran Reddy gangidi");
        Person person =new Person("saikiran","1121 n college dr","309909099","abcd@nwmissouri.edu");
        Employee emp = new Employee("ganesh","govt press colony","35656678873","abcdef@nwmissouri.edu","tech",80000,"12-09-2020");
        Staff staff = new Staff("vineeth","shamshabad","9194689877","abcdedff@nwmissouri.edu","tech",34000,"09-08-2019","office assistance");
        Faculty faculty =new Faculty("ramu","1121 n college","6789002823","dfgeuhd@nwmissouri.edu","biofect",111111,"02-02-20202",20,3);
        Student student = new Student("dinesh","village 0 ","9095969451","swewdr4@nwmissouri.edu",3.5);
        
        System.out.println("---------------------------------------");
        System.out.println(person.toString());
        System.out.println("---------------------------------------");
        System.out.println(emp.toString());
        System.out.println("---------------------------------------");
        
        System.out.println(staff.toString());
        System.out.println("---------------------------------------");
        System.out.println(faculty.toString());
        System.out.println("---------------------------------------");
        System.out.println(student.toString());
        System.out.println("---------------------------------------");
      
    }
    
}
