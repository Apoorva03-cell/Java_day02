public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        
        // Start traversing the string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            // If we encounter a non-space character, increment the length
            if (s.charAt(i) != ' ') {
                length++;
            } 
            // If we encounter a space and we have already found a word, stop
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }

    public static void main(String[] args) {
        // Test Cases
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";

        System.out.println("Length: " + lengthOfLastWord(test1)); // Output: 5
        System.out.println("Length: " + lengthOfLastWord(test2)); // Output: 4
        System.out.println("Length: " + lengthOfLastWord(test3)); // Output: 6
    }
}
