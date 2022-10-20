package project;


import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Salário: ");
        float salario = input.nextFloat();
        System.out.print("Valor do empréstimo: ");
        float emprestimo = input.nextFloat();
        if (emprestimo <= salario * 0.3) {
            System.out.println("Empréstimo concedido.");
        } else {
            System.out.println("Empréstimo negado.");
        }
        input.close();
    }
}
