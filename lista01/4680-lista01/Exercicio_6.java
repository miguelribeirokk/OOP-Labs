import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro horário: (H M S) ");
        int hora1 = input.nextInt();
        int minuto1 = input.nextInt();
        int segundo1 = input.nextInt();
        System.out.print("Digite o segundo horário: (H M S) ");
        int hora2 = input.nextInt();
        int minuto2 = input.nextInt();
        int segundo2 = input.nextInt();
        //diferença em segundos em modulo
        int diferenca = Math.abs((hora1 * 3600 + minuto1 * 60 + segundo1) - (hora2 * 3600 + minuto2 * 60 + segundo2));
        System.out.println("Diferença: " + diferenca + " segundos");
        input.close(); 
    }
}
