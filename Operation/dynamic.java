package Operation;

import java.util.Scanner;

public class dynamic {
    Scanner sc = new Scanner(System.in);
    //attribute
    String choice;
    
    public void dynamIn(){
        System.out.print("Integer \n Decimal");
        String form = sc.nextLine().toLowerCase();
        choice = form;
    }

    public void dynamicNum(){
        switch (choice) {
            case "integer":
                
                break;
            case "decimal":

                break;
            default:
                throw new AssertionError();
        }
    }
}
