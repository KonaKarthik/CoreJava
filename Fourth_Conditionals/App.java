package Fourth_Conditionals;

import java.util.Scanner;

public class App {
    public static void main (String args[]){
        //Scaner - input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("The name is "+name);
        System.out.println("The name is  "+name+" and age of "+name +" is "+age);

        //Votig app dynamic
        if(age<=18){
            System.out.println("you cannot vote because your age is "+age);   
        }
        else{
            System.out.println("you can vote because your age is "+age);
        }

        //Voting app dynamic with nested conditionals
        if(age>18){
            System.out.println("Do you have card (yes/no):");
            String input=sc.next();
            if(input.equalsIgnoreCase("yes")){
                System.out.println("You are eligible to vote");
                
            }
            else{
                System.out.println("You are  not eligible to vote");
            }
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        

    }
}
