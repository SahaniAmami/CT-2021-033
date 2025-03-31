package Q_01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Temperature celsius :");
        double celsius = scanner.nextDouble();

        Temperature temp=new Temperature();
        temp.setCelsius(celsius);
        System.out.println("The celsius is converted into fahrenheit :"+temp.toFahrenheit());


        //Q2
        System.out.println("Enter the Temperature Fahrenheit :");
        double fahrenheit = scanner.nextDouble();

        Temperature temp1 = new Temperature();
        temp1.setFahrenheit(fahrenheit);
        System.out.println("The Fahrenheit is convert into Fahrenheit:"+temp1.toCelsius());
    }
}
