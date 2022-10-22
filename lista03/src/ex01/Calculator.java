package ex01;


public class Calculator {

    /*
    * This class is used to calculate the sum , subtraction, multiplication and division of two numbers
     */

    public double sum(double number1, double number2) {
        /*
        * This method is used to calculate the sum of two numbers
         */
        return number1 + number2;
    }

    public double sub(double number1, double number2) {
        /*
        * This method is used to calculate the subtraction of two numbers
         */
        return number1 - number2;
    }

    public double mult(double number1, double number2) {
        /*
        * This method is used to calculate the multiplication of two numbers
         */
        return number1 * number2;
    }

    public String div(double number1, double number2) {
        /*
        * This method is used to calculate the division of two numbers
         */
        if (number2 == 0) {
            return "ERROR";
        } else {
            return String.valueOf(number1 / number2);
        }
        
    }
        
    

    


}
