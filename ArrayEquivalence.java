import java.util.Arrays;

public class ArrayEquivalence {
    
    // Method to check if elements combined in order form the same string
    public static boolean areArraysEquivalentByConcatenation(String[] word1, String[] word2) {
        // Joins the array elements without any delimiter
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        
        // Compare string content using .equals() instead of ==
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        String[] arr3 = {"abc", "d"};

        System.out.println("Arrays: " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
        System.out.println("Equivalent? " + areArraysEquivalentByConcatenation(arr1, arr2)); // Expected: true

        System.out.println("\nArrays: " + Arrays.toString(arr1) + " and " + Arrays.toString(arr3));
        System.out.println("Equivalent? " + areArraysEquivalentByConcatenation(arr1, arr3)); // Expected: false
    }
}
