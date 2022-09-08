/*Autor: Miguel Ribeiro - 4680 */

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int ano = input.nextInt();
        System.out.println("Ano atual: ");
        int ano_atual = input.nextInt();
        int idade = ano_atual - ano;
        System.out.println("Idade: " + idade);
        input.close();
    }
}