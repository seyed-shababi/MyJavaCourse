import java.util.*;

public class basics_46{
    public static void main(String[] args){
        System.out.print("What is your grade: ");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade > 60){
            System.out.println("You passed the exam.");
        }
        else if(grade > 50){
            System.out.println("You have been added to the waiting list!");
        }
        else if(grade < 50 && grade >= 0){
            System.out.println("You did not passed the exam, please try again!");
        } else{
            System.out.println("Please enter the valid grade value!");
        }
    }
}