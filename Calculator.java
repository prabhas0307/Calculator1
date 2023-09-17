import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Options:");
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to end the program");
            
            System.out.print(": ");
            String userChoice = scanner.nextLine();
            
            if (userChoice.equals("5")) {
                break;
            }
            
            double result;
            
            if (userChoice.equals("1")) {
                result = performAddition(scanner);
            } else if (userChoice.equals("2")) {
                result = performSubtraction(scanner);
            } else if (userChoice.equals("3")) {
                result = performMultiplication(scanner);
            } else if (userChoice.equals("4")) {
                result = performDivision(scanner);
            } else {
                System.out.println("Invalid input. Please try again.");
                continue;
            }
            
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
    
    private static double performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return num1 + num2;
    }
    
    private static double performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return num1 - num2;
    }
    
    private static double performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return num1 * num2;
    }
    
    private static double performDivision(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        if (denominator == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return numerator / denominator;
    }
}