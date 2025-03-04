import Operation.function;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        function fn1 = new function();

        //choose between integer an integer and double
        System.out.println("Choose a data type: \nInteger \nDouble");
        String formIn = sc.nextLine().toLowerCase();
        System.out.println();

        switch (formIn) {
            case "integer":
                double defaultOut = fn1.functions();
                //narrowcasting: double --> integer
                int changeOut = (int) defaultOut;
                System.out.println(changeOut);
                break;
            case "double":
                System.out.println(fn1.functions());
                break;
            default:
                throw new AssertionError();
        }
    }
}