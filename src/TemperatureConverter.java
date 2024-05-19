import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9/5 - 459.67;
    }

    public static void convertTemperature(double value, char unit) {
        switch (Character.toLowerCase(unit)) {
            case 'c':
                double fahrenheit = celsiusToFahrenheit(value);
                double kelvin = celsiusToKelvin(value);
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit and %.2f Kelvin.%n", value, fahrenheit, kelvin);
                break;
            case 'f':
                double celsius = fahrenheitToCelsius(value);
                kelvin = fahrenheitToKelvin(value);
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius and %.2f Kelvin.%n", value, celsius, kelvin);
                break;
            case 'k':
                celsius = kelvinToCelsius(value);
                fahrenheit = kelvinToFahrenheit(value);
                System.out.printf("%.2f Kelvin is equal to %.2f degrees Celsius and %.2f Fahrenheit.%n", value, celsius, fahrenheit);
                break;
            default:
                System.out.println("Invalid unit. Please enter 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter the original unit of measurement (C/F/K): ");
        char unit = scanner.next().charAt(0);

        convertTemperature(value, unit);

        scanner.close();
    }
}
