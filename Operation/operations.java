package Operation;

public class operations {
    
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b){
        int difference = a - b;
        return difference;
    }

    public int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public int divide(int a, int b){
        int quo = a / b;
        return quo;
    }
//method overload (doesn't work)
    public double divide(double a, double b){
        double quo = a / b;
        return quo;
    }
}
