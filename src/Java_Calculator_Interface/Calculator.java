package Java_Calculator_Interface;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("División por cero");
        }
        return (double) x / y;
    }
}