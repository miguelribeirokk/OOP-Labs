import java.util.*;
public class Exercicio_8{

    public static void main(String args[]){
        
        List <Integer> vetor = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número: ");
            String numero = input.nextLine();
            if (numero.equals("fim")) {
                break;
            }
            vetor.add(Integer.parseInt(numero));
        }
        System.out.println(vetor);
        Collections.sort(vetor);
        System.out.println(vetor);
        input.close();
    }
}

