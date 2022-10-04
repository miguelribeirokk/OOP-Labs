

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;


public class Exercicio_11 {
    public static void main(String args[]){
        try{
            FileInputStream arquivo = new FileInputStream("Exercicio_11/pacientes.txt" );
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader leitorBuffer = new BufferedReader(input);
            String linha;
            String[][] pacientes = new String[30][5];
            int numero = 0;

            do{
                linha = leitorBuffer.readLine();
                if (linha != null){
                    String [] paciente = linha.split(" ");
                    for(int i = 0; i < paciente.length; i++){
                        pacientes[numero][i] = paciente[i];
                    }
                    numero++;
                }
                
            }while(linha != null);

            

            //numero de pacientes
            System.out.println("Número de pacientes: "+numero);
        
            //media de idade dos homens
            int somaIdadeHomens = 0;
            int numeroHomens = 0;
            float mediaIdadeHomens = 0;
            for(int i = 0; i < numero; i++){
                if(pacientes[i][1].equals("M")){
                    somaIdadeHomens += Integer.parseInt(pacientes[i][3]);
                    numeroHomens++;
                }
            }
            mediaIdadeHomens = (float)somaIdadeHomens/numeroHomens;
            System.out.println("Média de idade dos homens: "+mediaIdadeHomens);

            //número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
            int numeroMulheres = 0;
            for(int i = 0; i < numero; i++){
                if(pacientes[i][1].equals("F") && Float.parseFloat(pacientes[i][4]) >= 1.59 && Float.parseFloat(pacientes[i][4]) <= 1.71 && Float.parseFloat(pacientes[i][2]) > 70){
                    numeroMulheres++;
                }
            }
            System.out.println("Número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+numeroMulheres);

            //A quantidade de pessoas com idade entre 18 e 25.
            int numeroPessoas = 0;
            for(int i = 0; i < numero; i++){
                if(Integer.parseInt(pacientes[i][3]) > 17 && Integer.parseInt(pacientes[i][3]) < 25){
                    numeroPessoas++;
                }
            }
            System.out.println("Número de pessoas com idade entre 18 e 25: "+numeroPessoas);

            //O nome do homem mais velho e o nome da mulher mais baixa.
            int idadeMaisVelho = 0;
            String nomeMaisVelho = "";
            float alturaMaisBaixa = 3;
            String nomeMaisBaixa = "";
            for(int i = 0; i < numero; i++){
                if(pacientes[i][1].equals("M") && Integer.parseInt(pacientes[i][3]) > idadeMaisVelho){
                    idadeMaisVelho = Integer.parseInt(pacientes[i][3]);
                    nomeMaisVelho = pacientes[i][0];
                }
                if(pacientes[i][1].equals("F") && Float.parseFloat(pacientes[i][4]) < alturaMaisBaixa){
                    alturaMaisBaixa = Float.parseFloat(pacientes[i][4]);
                    nomeMaisBaixa = pacientes[i][0];
                }
            }
            System.out.println("Nome do paciente mais velho: "+nomeMaisVelho);
            System.out.println("Nome da mulher mais baixa: "+nomeMaisBaixa);



            leitorBuffer.close();
            input.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }

    }
    
}


