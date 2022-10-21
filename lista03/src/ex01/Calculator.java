package ex01;


public class Calculator {

    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public String divisao(double numero1, double numero2) {
        if (numero2 == 0) {
            return "ERROR";
        } else {
            return String.valueOf(numero1 / numero2);
        }
        
    }
        
    

    


}
