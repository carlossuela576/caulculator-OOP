package Operation;

public class operations {
    
    public static double add(double a, double b){
        double sum = a + b;
        return sum;
    }

    public static double subtract(double a, double b){
        double difference = a - b;
        return difference;
    }

    public static double multiply(double  a, double  b){
        double product = a * b;
        return product;
    }

    public static double divide(double a, double b){
        if(a == 0 || b == 0){
            try {
                System.out.println("Can't divide by zero");
            } catch (ArithmeticException e) {
                // TODO: handle exception
                throw new ArithmeticException("Input error: please try again");
            }
        }
        double quo = a / b;
        return quo;
    }
}
