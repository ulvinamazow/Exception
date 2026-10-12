
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        divide();
        printWithIndex(2);
        conversionInteger();

        Integer i = parseIntOrDefault("3", 0);
        System.out.println(i);

        Double d = parseDoubleOrDefault("4.4", 0.0);
        System.out.println(d);
    }

    public static void divide() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the first number: ");
                int a = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int b = scanner.nextInt();

                int result = a / b;

                System.out.println("Result: " + result);

                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a whole number.");

                scanner.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }

        scanner.close();
    }

    public static void printWithIndex(Integer index) {
        String[] names = {"Ali", "Vüsal", "Aysel"};
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index is greater than the length of the array!");
        }
    }

    public static void conversionInteger() {
        String[] arr = {"12", "abc", "7", "", "3.5", "-4"};
        Integer count = 0;

        for (int i = 0; i < arr.length; i++) {
            try {
                Integer convertion = Integer.parseInt(arr[i]);
                System.out.println(arr[i] + " was converted to an Integer.");
                count++;
            } catch (NumberFormatException ex) {
            System.out.println(arr[i] + "not a Integer.");
            }
        }

        System.out.println("A total of " + count + " items were correctly converted to Integer.");
    }

    static int parseIntOrDefault(String s, int def) throws NumberFormatException {
        int parsedString = Integer.parseInt(s);

        return parsedString;
    }
    static double parseDoubleOrDefault(String s, double def) throws NumberFormatException {
        double parsedString = Double.parseDouble(s);
        return parsedString;
    }
}
