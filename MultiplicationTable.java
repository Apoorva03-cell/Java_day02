import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take number input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication Table for " + number + ":");
        
        // Loop from 1 to 10 to generate the table structure
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}
