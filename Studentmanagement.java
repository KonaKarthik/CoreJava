import java.util.*;
public class Studentmanagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the id:");
        int id =sc.nextInt();
        System.out.print("Enter the name:");
        String name =sc.next();
        System.out.print("Enter the quiz score (1-10):");
        int quiz =sc.nextInt();
        System.out.print("Enter the assignment score (1-10):");
        int assignment =sc.nextInt();
        System.out.print("Enter the exam score (1-80):");
        int exam =sc.nextInt();
        System.out.print("Enter the attendence percentage:");
        int attendence =sc.nextInt();
        int total_score = (quiz+assignment+exam);
        float avg_score = (total_score/2f);
        System.out.println(total_score);
        System.out.println(avg_score);
        if(total_score > 75){
            System.out.println("The student "+name+" is passed.");
            attendence += 1;
            if(attendence>100){
                attendence=100;
            }
        }
        else{
            System.out.println("The student "+name+" is failed.");   
        }
        System.out.println("The updated attendece is "+attendence +"%");
        String award="Star kid";
        if(avg_score >= 40 && attendence> 75){
            System.out.println("The "+name + "is a "+award +" of 2026");
        }
        else{
            System.out.println(name + " all the best for next year 2027");
        }
        System.out.println("The id of the student is:"+id+" "+"name is:"+name+" "+"The total score is:"+total_score+" "+"The average score is:"+avg_score+" "+"The attendence is:"+attendence+" "+"The award is:"+award );
    }
}