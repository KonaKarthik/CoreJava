package Fifth_loops;
import java.util.*;
public class Demo {
    public static void main(String[] args){
        //without loops
        //greeting
        // System.out.println("Good morning");
        // System.out.println("Good morning");
        // System.out.println("Good morning");
        // System.out.println("Good morning");
        // System.out.println("Good morning");
        // //with loops
        // //greet 5 times
        // //for loop : Used when you know number of iterations / repetations in advance.
         
        // for(int count=1;count<=5;count++){
        //     System.out.println(count);
        // }
        // //Forward Direction
        // for(int count=1;count<=5;count++){
        //     System.out.println("Good morning");
        // }
        // //Reverse direction
        // for(int count=5;count>=1;count--){
        //     System.out.println(count);
        // }
        // for(int count=5;count>=1;count--){
        //     System.out.println("Good Morning");
        // }

        // //while loop:  Used when you don't know number of iterations / repetations in advance.
        // int count=1;
        // while(count<=5){
        //     System.out.println(count);
        //     count++;
        // }
        // //Reverse
        // int count1=5;
        // while(count1>=1){
        //     System.out.println(count1);
        //     count1--; 
        // }

        //Check for phone password
        Scanner sc=new Scanner(System.in);
        // int password=2003;
        // int entered =0;
        // while(entered != password){
        //         System.out.println("Enter password");
        //         entered=sc.nextInt();
        // }
        // System.out.println("Phone unlocked");
        

        //Provide only the 3 attempts for the user.
        // int attempt=0;
        // int pass=2004;
        // while(attempt<3){
        //     System.out.println("Enter password");
        //     int entered=sc.nextInt();
        //     if(pass == entered){
        //         System.out.println("Your phone is unlocked");
        //         break;
        //     }
        //     // else{
        //     //     System.out.println("Wrong password");
        //     // }
        //     attempt++;
        // }

        //Provide only the 3 attempts for the user.
        // int password=1234;
        // int entered=0;
        // for(int attempt=0;attempt<3;attempt++){
        //     System.out.println("Enter the password");
        //     entered=sc.nextInt();
        //     if(entered==password){
        //         System.out.println("Phone is unlocked");
        //         break;
        //     }
        // }

        //do while loop: similar to while, but runs the code at least once, before checking the condition.
        // int i=7;
        // do{
        //     System.out.println("I will be executed definitely");
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=5);



        //Nested loops
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.println(i +"X" + j +"="+(i*j));
        //     }
        // }

        //Print 5 table
        // int table=5;
        // for(int i=1;i<=10;i++){
        //     System.out.println("The "+i+" table is starting");
        //     for(int j=1;j<=10;j++){
        //         System.out.println(i+"X"+j+"="+(i*j));
        //     }
        //     System.out.println("The "+i+" table is finished");
        //     System.out.println("------------------------------------------------");
        // }


        //while while loops - like above
        // int i=5;
        // while(i<=5){
        //     int j=1;
        //     while(j<=10){
        //         System.out.println(i+"X"+j+"="+(i*j));
        //         j++;
        //     }
        //     i++;
        // }


        //1-10 tables 
        int i=1;
        while(i<=10){
            System.out.println("This is "+i+" table");
            int j=1;
            while(j<=10){
                System.out.println(i+"X"+j+"="+(i*j));
                j++;
            }
            i++;
            System.out.println("--------------------------");
        }

        //break: used to terminate the loop
        // for(int count=1;count<=5;count++){
        //     if(count==3){
        //         break;
        //     }
        //     System.out.println(count);
        // }

        //continue: skip current iteration.
        for(int count=1;count<=5;count++){
            if(count==3){
                continue;
            }
            System.out.println(count);
        }

        //using return to get sum
        System.out.println(addNumbers(200,300));
    }
    // return :return a value to caller
    public static int addNumbers(int a, int b){
        return a+b;
    }

}
