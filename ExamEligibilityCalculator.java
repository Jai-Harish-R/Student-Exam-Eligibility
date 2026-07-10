import java.util.*;
public class  ExamEligibilityCalculator{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);

     System.out.println("Student Exam Eligibility checker ");

     System.out.print("Enter the total number of wording day (Usually 100 days) :");
     int tday=sc.nextInt();

     System.out.print("Enter the Number of days Attended Days: ");
     int adays=sc.nextInt();

     float avg=((float)adays/tday)*100;
     System.out.println("Your attendance : "+avg+"%");

    if(avg>=75){
       System.out.println("You are Eligible to write exam");
    }
    else{
        System.out.println("You are Not Eligible to write exam !!! ");
    }
}
}
