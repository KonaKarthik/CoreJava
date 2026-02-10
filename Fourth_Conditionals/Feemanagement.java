package Fourth_Conditionals;
import java.util.*;
public class Feemanagement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("The Fee Structure is provide as below");
        System.out.println("The Basic fee from 1st - 5th Grade is : 70000 ");
        int basic1=70000;
        System.out.println("The Basic fee from 6st - 8th Grade is : 100000 ");
        int basic2=100000; 
        System.out.println("The Basic fee from 9st - 12th Grade is : 150000 ");
        int basic3=150000;
        System.out.println("Enter the student name:");
        String name=sc.next();
        System.out.println("Enter the grade of the student:");
        int grade = sc.nextInt();
        

        if(grade>=9 && grade<=12){
            System.out.println("Enter whether the student is academic topper (yes/no)");
            String academic=sc.next();
            if(academic.equalsIgnoreCase("yes")){
                double discount = (20*basic3)/100;
                double newbasic3= basic3-discount;
                System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic3 +" "+"actual fee to be paid after 1st discount is "+newbasic3);
                if(grade == 10){
                        double newdiscount=(3*newbasic3)/100;
                        double newbasic_3=newbasic3-newdiscount;
                        System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic3 +" "+"actual fee to be paid after 2st discount  is"+newbasic_3);
                }
                if(grade == 12){
                        double newdiscount=(5*newbasic3)/100;
                        double newbasic_3=newbasic3-newdiscount;
                        System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is 12"+basic3 +" "+"actual fee to be paid  after 1st discount is "+newbasic_3);
                }
            }
            else {
                double discount = (10*basic3)/100;
                double newbasic3= basic3-discount;
                System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic3 +" "+"actual fee to be paid after 1st discount is "+newbasic3);
                if(grade == 10){
                        double newdiscount=(3*newbasic3)/100;
                        double newbasic_3=newbasic3-newdiscount;
                        System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic3 +" "+"actual fee to be paid after 2st discount  is "+newbasic_3);
                }
                if(grade == 12){
                        double newdiscount=(5*newbasic3)/100;
                        double newbasic_3=newbasic3-newdiscount;
                        System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic3 +" "+"actual fee to be paid  after 1st discount is "+newbasic_3);
                }
            }
        }
        if(grade>=6 && grade<=8){
            double discount = (5*basic2)/100;
            double newbasic2= basic2-discount;
            System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic2 +" "+"actual fee to be paid after 1st discount is "+newbasic2);
        }
        if(grade<6){
            double newbasic1= basic1;
            System.out.println("The name os the student is "+name+" "+"grade is "+grade+" "+"base fee is "+basic1 +" "+"actual fee to be paid is "+newbasic1);
        }
        
    }
}
