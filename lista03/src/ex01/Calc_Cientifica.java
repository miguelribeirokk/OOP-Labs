package ex01;

public class Calc_Cientifica extends Calculadora{

    public String potencia(double numero1, double numero2) {
        if (numero1 == 0 && numero2 == 0) {
            return "ERROR";
        } else {
            return String.valueOf(Math.pow(numero1, numero2));
        }
    }

    public String raiz(double numero1) {
        if (numero1 < 0) {
            return "ERROR";
        } else {
            return String.valueOf(Math.sqrt(numero1));
        }
        
    }
}
