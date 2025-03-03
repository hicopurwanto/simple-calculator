import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo this is a project for simple calculator");

        Scanner scanner = new Scanner(System.in);
        boolean continueApplication = true;

        while (continueApplication) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("5")) {
                System.out.println("Thanks for using this calculator");
                continueApplication = false; // exit the loop

            } else {
                try {
                    System.out.print("Input first number: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Input second number: ");
                    double num2 = scanner.nextDouble();
                    scanner.nextLine(); // consume the new line char

                    double result = 0;
                    switch (operation) {
                        case "1":
                            result = num1 + num2;
                            System.out.println("Result of addition: " + result);
                            break;
                        case "2":
                            result = num1 - num2;
                            System.out.println("Result of subtraction: " + result);
                            break;
                        case "3":
                            result = num1 * num2;
                            System.out.println("Result of multiplication: " + result);
                            break;
                        case "4":
                            result = num1 / num2;
                            System.out.println("Result of division: " + result);
                            break;
                        default:
                            System.out.println("Invalid operation selected");
                            break;
                    }

                    System.out.print("Do you want to use calculator again? (y/n): ");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("n")) {
                        continueApplication = false;
                        System.out.println("Thanks for using this calculator");

                    } else if (choice.equalsIgnoreCase("y")) {
                        continueApplication = true;

                    } else {
                        System.out.println("Thanks for using this calculator");
                        System.out.println("Exiting...");

                    }
                } catch (Exception e) {
                    System.out.println("There are error: " + e.getMessage());
                    scanner.nextLine();
                }
            }
        }
        scanner.close();
    }
}