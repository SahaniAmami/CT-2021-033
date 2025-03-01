package Q_10;

import java.util.Scanner;

public class Q10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();
        scanner.close();

        if (word.length() % 2 == 0) {
            System.out.println("Please enter a word with an odd number of characters.");
        } else {
            int middleIndex = word.length() / 2;
            System.out.println("Middle character: " + word.charAt(middleIndex));
        }
    }
}
