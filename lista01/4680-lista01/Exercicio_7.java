import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 1000: ");
        int numero = input.nextInt();
        int[] vetor = new int[numero];
        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um número inteiro: ");
            vetor[i] = input.nextInt();
            }
        
        //menor valor
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Menor valor: " + menor);

        //maior valor
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maior);

        //media
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        float media = soma / vetor.length;
        System.out.println("Média: " + media);

        //quantitade de numeros pares
        int pares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);

        //quantidade de numeros impares
        int impares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                impares++;
            }
        }
        System.out.println("Quantidade de números ímpares: " + impares);

        input.close();

        
    }
}
        
    

