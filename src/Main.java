import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.INFO,"New test");

        System.out.println(calculate().re+"+"+ calculate().im+"i");
    }
    private static Complex calculate() {
        double operand1re = Double.parseDouble(prompt("Enter first number real : "));
        double operand1im = Double.parseDouble(prompt("Enter first number imag : "));

        double operand2re = Double.parseDouble(prompt("Enter second number real: "));
        double operand2im = Double.parseDouble(prompt("Enter second number image: "));
        String operator = prompt("Enter math operation (+ /  *): ");
        Complex result = new Complex(0,0);
        Complex a = new Complex(operand1re,operand1im);
        Complex b = new Complex(operand2re,operand2im);

        if (operator.equals("+")) {
            result = new  Addition().calculate(a,b);
        }

        else if (operator.equals("*")) {
            result = new Multiplication().calculate(a,b);
        }

        else if (operator.equals("/")) {
            result = new Division().calculate(a,b);
        }

        else throw new RuntimeException("Unsupported math operation");

        return result;
    }

    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}