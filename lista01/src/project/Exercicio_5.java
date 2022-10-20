package project;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String args[]) {
        String[] meses_nome = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] meses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do dia e do mês: ");
        int dia = input.nextInt();
        int mes = input.nextInt();
        if (mes > 12) {
            System.out.println("Mês inválido (1 a 12).");
            input.close();
            return;
        }
        for (int i = 0; i < meses.length; i++) {
            if (mes == meses[i]) {
                if (dia > dias[i] || dia < 1) {
                    System.out.format("O mês %s não tem %d dias, data inválida.", meses_nome[i], dia);
                
                }
                else {
                    System.out.format("Data %d de %s, válida.", dia, meses_nome[i]);
                }
            }
        }
        input.close();
    }
}
