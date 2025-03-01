package Q_09;

import java.util.*;


public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        System.out.println("Enter your sentence :");
        sentence = scanner.nextLine();
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(10));
    }
}
