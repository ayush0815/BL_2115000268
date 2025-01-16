import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation (1-4):");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1: // Addition
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2: // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3: // Multiplication
                System.out.println("Result: " + (num1 * num2));
                break;

                default: // Division
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }

        scanner.close();
    }
}
