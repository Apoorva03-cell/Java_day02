public class ReversePrefix {
    
    public static String reversePrefix(String word, char ch) {
        // Find the index of the first occurrence of the character
        int index = word.indexOf(ch);
        
        // If the character does not exist in the word, return it as is
        if (index == -1) {
            return word;
        }
        
        // Extract the prefix up to the character (inclusive) and reverse it
        StringBuilder prefix = new StringBuilder(word.substring(0, index + 1));
        prefix.reverse();
        
        // Append the remaining part of the original word
        prefix.append(word.substring(index + 1));
        
        return prefix.toString();
    }

    public static void main(String[] args) {
        // Test Case 1: Character is present
        String word1 = "abcdefd";
        char ch1 = 'd';
        System.out.println("Original: " + word1 + ", Char: " + ch1);
        System.out.println("Result:   " + reversePrefix(word1, ch1)); // Output: dcbaefd
        
        System.out.println();

        // Test Case 2: Character is not present
        String word2 = "abcd";
        char ch2 = 'z';
        System.out.println("Original: " + word2 + ", Char: " + ch2);
        System.out.println("Result:   " + reversePrefix(word2, ch2)); // Output: abcd
    }
}
