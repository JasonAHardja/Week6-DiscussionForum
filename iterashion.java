import java.util.Scanner;

public class iterashion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write something ->");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("words: " + wordCount);
        scanner.close();
    }
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        } return countWordsIterative(input.trim());
    }
    public static int countWordsIterative(String input) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isWhitespace(currentChar)) {
                if (inWord) {
                    count++;
                    inWord = false;
                }
            } else { if (!inWord) {
                    inWord = true;
                }
            }
        } if (inWord) {
            count++;
        } return count;
    }
}

