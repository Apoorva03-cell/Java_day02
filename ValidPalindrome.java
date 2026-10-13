public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Initialize pointers at the beginning and the end of the string
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move the left pointer forward if the character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Move the right pointer backward if the character is not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // If both characters are alphanumeric, compare them case-insensitively
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Mismatch found, not a valid palindrome
                }
                left++;
                right--;
            }
        }
        return true; // All valid pairs matched perfectly
    }

    public static void main(String[] args) {
        // Test Case 1: Standard phrase with spaces and punctuation
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("\"" + s1 + "\" -> " + isPalindrome(s1)); // Output: true

        // Test Case 2: Non-palindrome phrase
        String s2 = "race a car";
        System.out.println("\"" + s2 + "\" -> " + isPalindrome(s2)); // Output: false

        // Test Case 3: Empty or spacing-only string
        String s3 = " ";
        System.out.println("\"" + s3 + "\" -> " + isPalindrome(s3)); // Output: true
    }
}
