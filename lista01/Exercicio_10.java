import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String args[]) {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int numeroTentativas = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Você acertou!");
                break;
            } else if (numero > numeroAleatorio) {
                System.out.println("O número é menor");
            } else {
                System.out.println("O número é maior");
            }
            numeroTentativas++;
        }
        System.out.println("Número de tentativas: " + numeroTentativas);
        input.close();
    }
}
        