package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first name");
        String firstname = scanner.next();
        System.out.println("Enter the last name");
        String lastname = scanner.next();

        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle(firstname+" "+lastname);
        frame.setVisible(true);
    }
}
