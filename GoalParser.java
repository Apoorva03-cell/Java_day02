public class GoalParser {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < command.length(); ) {
            // Case 1: The character is 'G' -> stays "G"
            if (command.charAt(i) == 'G') {
                sb.append("G");
                i++; // Move 1 step forward
            } 
            // Case 2: The next character is ')' -> "()" becomes "o"
            else if (command.charAt(i + 1) == ')') {
                sb.append("o");
                i += 2; // Move 2 steps forward
            } 
            // Case 3: Otherwise, it must be "(al)" -> becomes "al"
            else {
                sb.append("al");
                i += 4; // Move 4 steps forward
            }
        }
        
        return sb.toString();
    }

    // Main method to test the solution with LeetCode examples
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));         // Output: Goal
        System.out.println(interpret("G()()()()(al)"));   // Output: Gooooal
        System.out.println(interpret("(al)G(al)()()G"));   // Output: alGalooG
    }
}
