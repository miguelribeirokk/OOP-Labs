package project;

import java.util.Scanner;

public class Exercicio_9{
    public static void main(String args[]) {
        System.out.println("Opções:\nMULTIPLICA A POR B\nDIVIDE A POR B\nSOMA A E B\nSUBTRAI A DE B\n");
        System.out.print("Digite uma operação: (apenas letras maiúsculas) ");
        Scanner input = new Scanner(System.in);
        String operacao = input.nextLine();
        String[] operacaoSeparada = operacao.split(" ");
        try{
            int a = Integer.parseInt(operacaoSeparada[1]);
            int b = Integer.parseInt(operacaoSeparada[3]);
            if(operacaoSeparada[0].equals("MULTIPLICA") && operacaoSeparada[2].equals("POR")){
                System.out.println("RESPOSTA: "+ a*b);
            }else if(operacaoSeparada[0].equals("DIVIDE") && operacaoSeparada[2].equals("POR")){
                System.out.println("RESPOSTA: "+ a/b);
            }else if(operacaoSeparada[0].equals("SOMA") && operacaoSeparada[2].equals("E")){
                System.out.println("RESPOSTA: "+ (a+b));
            }else if(operacaoSeparada[0].equals("SUBTRAI") && operacaoSeparada[2].equals("DE")){
                System.out.println("RESPOSTA: "+ (b-a));
            }else{
                System.out.println("Operação inválida, erro de sintaxe");
            }
        }catch(Exception e){
            System.out.println("Operação inválida, erro: "+e);
        }
        input.close();
    }
}