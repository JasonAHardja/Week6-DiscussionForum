import java.util.Scanner;

public class Main {
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
        }return countWordsRecursive(input.trim(), 0);
    }
    public static int countWordsRecursive(String input, int count) {
        if (input.isEmpty()) {
            return count;
        }

        int index = input.indexOf(' ');
        if (index != -1) {
            return countWordsRecursive(input.substring(index).trim(), count + 1);
        } else {
            return count + 1;
        }
    }
}