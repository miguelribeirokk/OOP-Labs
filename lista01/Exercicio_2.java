import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
        //racional para real
        System.out.println("Racional para real:");
        System.out.println("Numerador: ");
        Scanner input = new Scanner(System.in);
        int numerador = input.nextInt();
        System.out.println("Denominador: ");
        int denominador = input.nextInt();
        if (denominador == 0) {
            System.out.println("Denominador não pode ser zero.");
        } else {
            float real = (float) numerador / denominador;
            System.out.println("Real: " + real);
        }
        input.close(); 
    } 
}
