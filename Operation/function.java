package Operation;
import java.util.Scanner;

public class function {
    Scanner sc = new Scanner(System.in);
    public double functions(){
        startingPrompts();
        String operationChoice = sc.nextLine().toLowerCase();

        do { 
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
                    double a = operations.add(x, y);
                    return a;
                case "subtract":
                    double s = operations.subtract(x, y);
                    return s;
                case "multiply":
                    double m = operations.multiply(x, y);
                    return m;
                case "divide":
                    double d = operations.divide(x, y);
                    return d;
                default:
                    try {
                        System.out.println("Your first number is " + x + " and your second number is " + y);
                        System.out.println("Make sure to enter the correct inputs");
                    } catch (Exception e) {
                        // TODO: handle exception
                        throw new ArithmeticException("Something went wrong, internal error");
                    }
                    finally{
                        System.out.println("try catch executed");
                    }
            }
        } while (true);
        /* for some unknown reason this method generates an error when the functions
         * are put outside the do-while loop. Return keywords cannot be seen as return
         * values - only the gods initially know why does that happen. at all costs - 
         * DON'T PUT THE FUNCTIONS OUT OF THE DO - WHILE LOOP.
         */
    }

    //minor static methods
    static void startingPrompts(){
        System.out.println("Welcome to calculator");
        System.out.println("Please select an operation");
        System.out.println("----------------------------");
        System.out.println("Add \nSubtract \nMultiply \nDivide");
    }

    static void operationPrompt(){
        System.out.println();
        System.out.println("Please enter two numbers");
    }
}
