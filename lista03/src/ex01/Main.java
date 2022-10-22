package ex01;

public class Main {
    
        public static void main(String[] args) {

            /*
            * Testing the Calculator class
             */
            Calculator calculator = new Calculator();
            System.out.println("Calculator");
            System.out.println("Sum: " + calculator.sum(10, 20));
            System.out.println("Subtraction: " + calculator.sub(20, 10));
            System.out.println("Multiplication: " + calculator.mult(10, 20));
            System.out.println("Division: " + calculator.div(10, 5));

            System.out.println("\n################################\n");

            System.out.println("Scientific Calculator");
            Scientific_Calculator scientificCalculator = new Scientific_Calculator();
            System.out.println("Sum: " + scientificCalculator.sum(2, 5));
            System.out.println("Subtraction: " + scientificCalculator.sub(22, 5));
            System.out.println("Multiplication: " + scientificCalculator.mult(2, 5));
            System.out.println("Division: " + scientificCalculator.div(3, 6));
            System.out.println("Power: " + scientificCalculator.pow(2, 2));
            System.out.println("Square root: " + scientificCalculator.sqrt(9));

            System.out.println("\n################################\n");
            
            /*
            * Testing exceptions
             */

            System.out.println("Testing exceptions");
            System.out.println("Division by zero: " + calculator.div(10, 0));
            System.out.println("Square root of a negative number: " + scientificCalculator.sqrt(-9));
            System.out.println("Power of zero to the zero: " + scientificCalculator.pow(0, 0));
        }
}
