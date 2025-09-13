package task.index;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        int choice;  
        do {
            System.out.println("\nEnter the choice to perform: ");
            System.out.println("1-Addition\n2-Subtraction\n3-Division\n4-Multiply\n5-Modulus\n0-Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Addition of two numbers: " + (a + b)); break;
                case 2: System.out.println("Subtraction of two numbers: " + (a - b)); break;
                case 3: System.out.println("Division of two numbers: " + (a / b)); break;
                case 4: System.out.println("Multiplication of two numbers: " + (a * b)); break;
                case 5: System.out.println("Modulus of two numbers: " + (a % b)); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice, try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
