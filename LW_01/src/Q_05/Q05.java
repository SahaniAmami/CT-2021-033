package Q_05;

import java.text.SimpleDateFormat;
import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE,MMMM MM,yyyy");
        System.out.println(sdf.format(today));
    }
}
