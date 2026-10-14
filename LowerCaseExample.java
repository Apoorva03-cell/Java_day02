import java.util.Scanner;

public class LowerCaseExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to convert: ");
        String originalString = scanner.nextLine();
        
        // Convert the string to lower case
        String lowerCaseString = originalString.toLowerCase();
        
        // Output the result
        System.out.println("Lower case result: " + lowerCaseString);
        
        // Close the scanner
        scanner.close();
    }
}
