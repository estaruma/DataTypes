// Write a Java program to convert temperature from Fahrenheit to Celsius


public class FToC {
    public static void main(String[] args) {
        // for a specific temperature
       double farenheit = 212;

       // convert f to c (f-32)*5/9

        double celsius = (farenheit - 32) * 5/9;

        System.out.println("Temperature in f = " + farenheit);
        System.out.println("Temperature in c = " + celsius);

    }
}