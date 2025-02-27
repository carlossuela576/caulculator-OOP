import Operation.operations;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do { 
            //starting prompt & operation choice input
            System.out.println();
            startingPrompts();
            String operationChoice = sc.nextLine().toLowerCase();

            //two number input
            operationPrompt();
            System.out.print("Enter first number: ");
            double x = sc.nextDouble();
            System.out.print("Enter second number: ");
            double y = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            //call operation methods
            switch (operationChoice) {
                case "add":
                    System.out.println(operations.add(x, y));
                    break;
                case "subtract":
                    System.out.println(operations.subtract(x, y));
                    break;
                case "multiply":
                    System.out.println(operations.multiply(x, y));
                    break;
                case "divide":
                    System.out.println(operations.divide(x, y));
                    break;
                default:
                    throw new InputMismatchException("must provide correct operation input");
            }
        } while (true);

    }

    //minor static methods
    static void startingPrompts(){
        System.out.println("Welcome to calculator");
        System.out.println("Please select an operation");
        System.out.println("----------------------------");
        System.out.println("Add \nSubtract \nMultiply \nDivide");
    }

    static void operationPrompt(){
        System.out.println("Please enter two numbers");
    }
}