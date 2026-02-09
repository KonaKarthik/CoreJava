package Fourth_Conditionals;

public class Demo {
    public static void main(String[] args)
    {
        // if condition
        int num =10;
        if(num>0){
            System.out.println("Number is positive");
        }

        //Check if given number is in range of 10 and 20
        int num1=16;
        if(num1>10 && num1<20){
            System.out.println("The number is in the range");
        }

        // if-else condition
        int num2=-76;
        if(num2>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }

        //voting-app
        int age=19;
        if(age >= 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }

        // ternary operator (Most important)
        // variable = (condition) ? value_if_true:value_if_false

        int a =10;
        int b= 20;
        int max = (a > b) ? a:b;
        System.out.println(max);


        //Voting app using the ternary operator
        String result= (age>=18) ? "You can vote":"You cannot vote";
        System.out.println(result);


        //else-if ladder
        int marks=9;
        if(marks>=90 && marks<=100){
            System.out.println("Grade A");
        }
        else if(marks>=75 && marks<=90){
            System.out.println("Grade B");
        }
        else if(marks>=60 && marks<=75){
            System.out.println("Grade C");
        }
        else if(marks>=35 && marks<=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("FAIL");
        }


        //Switch case
        int day =5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid");
                break;
        }

        //Switch case with fall through
        //int day =6;
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:              
            case 5:
                System.out.println("WEEKDAYS");
                break;
            case 6:
            case 7:
                System.out.println("WEEKEND");
                break;
            default :
                System.out.println("Invalid");
                break;
        }
    }

}
