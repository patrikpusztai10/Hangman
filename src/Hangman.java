import java.util.Scanner;

public class Hangman {
    public static String Found(String lines, String letter, int pos) {
        return lines.substring(0, 2 * pos) + letter + lines.substring(2 * pos + 1);
    }

    public static String wrong_Guesses(int n) {
        if (n == 0) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n";
        }
        if (n == 1) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n";
        }
        if (n == 2) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n";
        }
        if (n == 3) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n";
        }
        if (n == 4) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n";
        }
        if (n == 5) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========\n";
        }
        if (n == 6) {
            return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=========\n";
        }
        return "0";
    }

    public static void run(String word) {
        Scanner input = new Scanner(System.in);
        String letter;
        String initial_word = word;
        System.out.println("WELCOME TO HANGMAN\n");
        System.out.println("  +---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========\n");

        // Dynamically create the underscores based on word length
        String lines = "_".repeat(word.length()).replace("", " ").trim();
        int guess = 0;

        // Game continues until all guesses are used or word is fully revealed
        while (guess != 6 && !word.equals("©".repeat(word.length()))) {
            System.out.println("Choose a letter:");
            letter = input.nextLine();

            // Ensure input is a single letter
            if (letter.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            // Check if the word contains the guessed letter
            if (word.contains(letter)) {
                // Replace all occurrences of the letter
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter.charAt(0)) {
                        lines = Found(lines, letter, i);
                        word = word.substring(0, i) + "©" + word.substring(i + 1);
                    }
                }
                System.out.println(lines);
            } else {
                // Wrong guess, increment the guess count
                guess++;
                System.out.println(wrong_Guesses(guess));
            }
        }

        // Determine the end result
        if (guess == 6) {
            System.out.println("GAME OVER!\n");
            System.out.println("The initial word was: " + initial_word);
        } else {
            System.out.println("Congrats! You won!\n");
        }
    }
}
