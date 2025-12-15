// Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.

 import java.util.Scanner;

public class SumOrDoubleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result based on the condition
        if (num1 == num2) {
            System.out.println("The numbers are the same. Sum: " + sum);
        } else {
            System.out.println("The numbers are different. Double of the sum: " + (2 * sum));
        }

        scanner.close();
    }
}
