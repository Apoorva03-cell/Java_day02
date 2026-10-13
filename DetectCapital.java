public class DetectCapital {

    public static boolean detectCapital(String word) {
        int uppercaseCount = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
        }

        return uppercaseCount == 0 ||
               uppercaseCount == word.length() ||
               (uppercaseCount == 1 &&
                Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        System.out.println(detectCapital("USA"));
        System.out.println(detectCapital("Google"));
        System.out.println(detectCapital("hello"));
        System.out.println(detectCapital("FlaG"));
    }
}