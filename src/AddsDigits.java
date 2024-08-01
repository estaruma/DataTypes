// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;

public class AddsDigits {
    public static void main(String[] args) {

        // read user input
        // scanner object

        Scanner scanner = new Scanner(System.in);

        // user information
        System.out.println("Enter number between 1-1000: ");

        // read int input

        int number = scanner.nextInt();

        // if to capture numbers outside range

        if (number < 0 || number > 1000) {
            int sum =0;

            // extract digits
            // modulus by 10 get the last digit
            // divide the next by 10 and then modulus - get the last digit again
            // do the same but divide by 100

            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = (number / 100) % 10;

            sum = digit1 + digit2 + digit3;


        }

    }
}
