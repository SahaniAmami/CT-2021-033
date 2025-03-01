package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Q07 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        JFrame frame = new JFrame();
        frame.setSize(500,600);
        frame.setTitle(sdf.format(today));
        frame.setVisible(true);
    }
}
