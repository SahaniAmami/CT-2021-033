package Q_06;

import javax.swing.*;
import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the frame width");
        int width = scanner.nextInt();
        System.out.println("Enter the frame height");
        int height = scanner.nextInt();

        frame.setSize(width,height);
        frame.setVisible(true);

    }
}
