package project;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String args[]) {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do mês: ");
        String mes = input.nextLine();
        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i])) {
                System.out.format("%s = %d", mes, i + 1);
            }
        }
        input.close();
    }
}
