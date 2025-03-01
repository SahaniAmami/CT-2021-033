package Q_08;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sen = scanner.nextLine();
        scanner.close();
        String[] parts = sen.split("!");
        for (String part:parts){
            System.out.println(part.trim());
            System.out.println();
        }
    }
}
