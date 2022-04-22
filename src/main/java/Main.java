import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create age(int) and price(double) variables
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        double price;
        boolean hasToy = false;
        boolean hasSticker = false;
        boolean hasDrink = false;


        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();


        if (age <= 10) {
            price = 5;

            if (age < 5) {
                hasToy = true;
            }
        } else if (age > 65) {
            price = 8;

            if (age > 85) {
                hasDrink = true;

            } else if (age >75) {
                hasSticker = true;
            }
        } else {
            price = 12.5;
        }
        //print out results
        System.out.println("Your ticket price is: " + numberFormat.format(price));

        if (hasToy) {
            System.out.println("You get a toy!");
        } else if (hasSticker) {
            System.out.println("You get a sticker!");
        } else if (hasDrink) {
            System.out.println("You get a free drink!");
        } else {
            System.out.println("You get no extra");
        }
    }
}
