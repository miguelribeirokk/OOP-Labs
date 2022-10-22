package ex01;

public class Scientific_Calculator extends Calculator {
    /*
    * This class is used to calculate the sum , subtraction,
    * multiplication, division, power and square root of two numbers
    * This class extends the Calculator class
     */

    public String pow(double number1, double number2) {
        /*
        * This method is used to calculate the power of two numbers
         */
        if (number1 == 0 && number2 == 0) {
            return "ERROR";
        } else {
            return String.valueOf(Math.pow(number1, number2));
        }
    }

    public String sqrt(double number1) {
        /*
        * This method is used to calculate the square root of a number
         */
        if (number1 < 0) {
            return "ERROR";
        } else {
            return String.valueOf(Math.sqrt(number1));
        }

    }
}
