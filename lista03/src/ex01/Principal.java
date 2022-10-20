package ex01;

public class Principal {
    
        public static void main(String[] args) {

            //Teste da classe Calculadora
            Calculadora calculadora = new Calculadora();
            System.out.println("Calculadora");
            System.out.println("Soma: " + calculadora.soma(10, 20));
            System.out.println("Subtração: " + calculadora.subtracao(20, 10));
            System.out.println("Multiplicação: " + calculadora.multiplicacao(10, 20));
            System.out.println("Divisão: " + calculadora.divisao(10, 5));

            System.out.println("\n################################\n");

            System.out.println("Calculadora Cientifica");
            Calc_Cientifica calc_cientifica = new Calc_Cientifica();
            System.out.println("Soma: " + calc_cientifica.soma(2, 5));
            System.out.println("Subtração: " + calc_cientifica.subtracao(22, 5));
            System.out.println("Multiplicação: " + calc_cientifica.multiplicacao(2, 5));
            System.out.println("Divisão: " + calc_cientifica.divisao(3, 6));
            System.out.println("Potência: " + calc_cientifica.potencia(2, 2));
            System.out.println("Raiz: " + calc_cientifica.raiz(9));

            System.out.println("\n################################\n");
            
            //Testando exceções
            System.out.println("Testando exceções");
            System.out.println("Divisão por zero: " + calculadora.divisao(10, 0));
            System.out.println("Raiz de número negativo: " + calc_cientifica.raiz(-9));
            System.out.println("Potência de zero elevado a zero: " + calc_cientifica.potencia(0, 0));
        }
}
