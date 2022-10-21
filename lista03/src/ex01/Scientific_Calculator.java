package ex01;

public class Scientific_Calculator extends Calculator {

    public String pow(double number1, double number2) {
        if (number1 == 0 && number2 == 0) {
            return "ERROR";
        } else {
            return String.valueOf(Math.pow(number1, number2));
        }
    }

    public String sqrt(double number1) {
        if (number1 < 0) {
            return "ERROR";
        } else {
            return String.valueOf(Math.sqrt(number1));
        }

    }
}
