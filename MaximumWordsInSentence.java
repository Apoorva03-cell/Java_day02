public class MaximumWordsInSentence {

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int words = sentence.split(" ").length;
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        System.out.println("Maximum words: " + mostWordsFound(sentences));
    }
}