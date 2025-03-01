package Q_03;

import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.next();
        System.out.println("Enter your middle name");
        String middleName = scanner.next();
        System.out.println("Enter your last name");
        String lastName = scanner.next();
        String initial = middleName.substring(0,1);
        System.out.println(firstName+" "+initial+"."+lastName);
    }
}
