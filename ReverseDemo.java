public class ReverseDemo {
    public static void main(String[] args) {
        // 1. Reverse a Number using mathematical logic
        int number = 12345;
        int reversedNum = 0;
        int tempNum = number; // Keep original number intact

        while (tempNum != 0) {
            int digit = tempNum % 10;          // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Build reversed number
            tempNum /= 10;                     // Remove the last digit
        }

        // 2. Reverse a String using StringBuilder
        String text = "HelloWorld";
        String reversedStr = new StringBuilder(text).reverse().toString();

        // Print Results
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNum);
        System.out.println("-------------------------");
        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reversedStr);
    }
}

