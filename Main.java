import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do { 
            //starting prompt & operation choice input
            startingPrompts();
            String operation = sc.nextLine().toLowerCase();

            //two number input
            operationPrompt();
            System.out.print("Enter first number: ");
            int x = sc.nextInt();
            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            //call operation methods
            switch (operation) {
                case "add":
                    
                    break;
                
                default:
                    throw new AssertionError();
            }
        } while (true);

    }

    //minor static methods
    static void startingPrompts(){
        System.out.println("Welcome to calculator");
        System.out.println("Please select an operation");
        System.out.println("----------------------------");
        System.out.println("Add \n Multiply \n Subtract \n Divide");
    }

    static void operationPrompt(){
        System.out.println("Please enter two numbers");
    }
}