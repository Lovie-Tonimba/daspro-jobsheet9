import java.util.Scanner;
public class ArrayAverageScore244107060101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudent = sc.nextInt();

        int [] score = new int[numberOfStudent];
        int totalPassed = 0, totalFailed = 0;
        double averagePassed, averageFailed;
        int studentPassed = 0, studentFailed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter final score " + i + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if(score[i] > 70){
                studentPassed++;
                totalPassed += score[i];
            }else if(score[i] < 70){
                studentFailed++;
                totalFailed += score[i];
            }
        }
        averagePassed = totalPassed / studentPassed;
        averageFailed = totalFailed / studentFailed;
        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("THe average score of students who failed is " +  averageFailed);
    }
}