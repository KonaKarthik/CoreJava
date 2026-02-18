package Sixth_oops;

public class Employee {
    //instance variable
    String empName;

    //static variable
    static String companyname="Digital edify";

    //Show details of the employee
    public void showempInfo(){
        //local variables
        int sal=100000;
        System.out.println(empName+" earns "+sal+" at "+companyname);
    }
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.empName="Karthik";
        e1.showempInfo();
    }
    
}
