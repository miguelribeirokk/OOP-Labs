package ex01;

public class Principal {
    
        public static void main(String[] args) {

            //Teste da classe Calculadora
            Calculator calculator = new Calculator();
            System.out.println("Calculadora");
            System.out.println("Soma: " + calculator.soma(10, 20));
            System.out.println("Subtração: " + calculator.subtracao(20, 10));
            System.out.println("Multiplicação: " + calculator.multiplicacao(10, 20));
            System.out.println("Divisão: " + calculator.divisao(10, 5));

            System.out.println("\n################################\n");

            System.out.println("Calculadora Cientifica");
            Scientific_Calculator scientificCalculator = new Scientific_Calculator();
            System.out.println("Soma: " + scientificCalculator.soma(2, 5));
            System.out.println("Subtração: " + scientificCalculator.subtracao(22, 5));
            System.out.println("Multiplicação: " + scientificCalculator.multiplicacao(2, 5));
            System.out.println("Divisão: " + scientificCalculator.divisao(3, 6));
            System.out.println("Potência: " + scientificCalculator.pow(2, 2));
            System.out.println("Raiz: " + scientificCalculator.sqrt(9));

            System.out.println("\n################################\n");
            
            //Testando exceções
            System.out.println("Testando exceções");
            System.out.println("Divisão por zero: " + calculator.divisao(10, 0));
            System.out.println("Raiz de número negativo: " + scientificCalculator.sqrt(-9));
            System.out.println("Potência de zero elevado a zero: " + scientificCalculator.pow(0, 0));
        }
}
