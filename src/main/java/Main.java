import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create age(int) and price(double) variables
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        double price = 12.5;


        if (age <= 10) {
            price = 5;
        } else if (age > 65) {
            price = 8;
        } else {
            price = 12.5;
        }
        //print out results
        System.out.println("Your ticket price is: " + numberFormat.format(price));
    }
}
