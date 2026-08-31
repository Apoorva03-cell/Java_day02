import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the student name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter marks of subject 1:");
        double sub1 = scanner.nextDouble();
        
        System.out.println("Enter marks of subject 2:");
        double sub2 = scanner.nextDouble();
        
        System.out.println("Enter marks of subject 3:");
        double sub3 = scanner.nextDouble();
        
        double totalMarks = sub1 + sub2 + sub3;
        double average = totalMarks / 3.0;
        
        boolean isPassed = average >= 35.0;
        boolean isDistinction = average >= 75.0;
        boolean isSpecialAward = average >= 95.0;
        
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        
        if (isPassed) {
            System.out.println("Status: PASSED");
            if (isDistinction) {
                System.out.println("Status: DISTINCTION");
            }
            if (isSpecialAward) {
                System.out.println("Status: TOPPER");
            }
        } else {
            System.out.println("You have failed the exam");
        }

        // Close the scanner here to resolve the warning
        scanner.close(); 
    }
}