public class LongestCommonPrefix {

    public static String LongestCommonPrefix(String[] strs) {
        // Edge case: if the array is null or empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the first word is the common prefix
        String prefix = strs[0];

        // Compare the prefix with the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it is found at the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Test Case 1: Standard case with a common prefix
        String[] words1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: \"" + LongestCommonPrefix(words1) + "\""); 
        // Output: "fl"

        // Test Case 2: No common prefix
        String[] words2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: \"" + LongestCommonPrefix(words2) + "\""); 
        // Output: ""

        // Test Case 3: One word completely encompasses the others
        String[] words3 = {"interspecies", "interstellar", "interstate"};
        System.out.println("Longest Common Prefix: \"" + LongestCommonPrefix(words3) + "\""); 
        // Output: "inters"
    }
}
