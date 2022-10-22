package ex02;

import java.sql.Date;

public class Automovel extends Veiculo{

    /*
    * This class is used to create a car object
    * This class extends the Veiculo class
     */

    // Attributes
    Date dataTrocaOleo;
    Date dataTrocaPneu;
    Date dataRevisao;
    String tipoBateria;
    String tipoMotor;

    // Constructor
    public Automovel(int numeroRodas, String cor, String modelo, String marca, 
                    int ano, String dataTrocaOleo, String  dataTrocaPneu, String dataRevisao, 
                    String tipoBateria, String tipoMotor) {

        super(numeroRodas, cor, modelo, marca, ano);
        
        try{
            this.dataTrocaOleo = Date.valueOf(dataTrocaOleo);
        }
        catch(Exception e){
            System.out.println("Data de troca de oleo invalida");
        }

        try{
            this.dataTrocaPneu = Date.valueOf(dataTrocaPneu);
        }
        catch(Exception e){
            System.out.println("Data de troca de pneu invalida");
        }

        try{
            this.dataRevisao = Date.valueOf(dataRevisao);
        }
        catch(Exception e){
            System.out.println("Data de revisao invalida");
        }

        this.tipoBateria = tipoBateria;
        this.tipoMotor = tipoMotor;
    }

    //Getters and Setters

    public Date getDataTrocaOleo() {
        return dataTrocaOleo;
    }

    public void setDataTrocaOleo(String dataTrocaOleo) {
        try{
            this.dataTrocaOleo = Date.valueOf(dataTrocaOleo);
        }
        catch(Exception e){
            System.out.println("Data inválida!");
        }
    }

    public Date getDataTrocaPneu() {
        return dataTrocaPneu;
    }

    public void setDataTrocaPneu(String dataTrocaPneu) {
        try{
            this.dataTrocaPneu = Date.valueOf(dataTrocaPneu);
        }
        catch(Exception e){
            System.out.println("Data inválida!");
        }
    }

    public Date getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        try{
            this.dataRevisao = Date.valueOf(dataRevisao);
        }
        catch(Exception e){
            System.out.println("Data inválida!");
        }
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

}

