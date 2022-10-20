package project;


import java.sql.Date;

public class Funcionario {
    String nome;
    Date dataNascimento;
    String tipoContrato;
    double salario;
    int numFilhos;
    Date dataAdmissao;



    public Funcionario(String nome, String dataNascimento){
        this.nome = nome;
        try{
            this.dataNascimento = Date.valueOf(dataNascimento);
        }catch (Exception e){
            System.out.println("Data de nascimento inválida = " + e);
            System.out.println("A data de nascimento deve ser no formato yyyy-mm-dd");

        }
    }


    public void Contratar(String tipoContrato, float salario, int numFilhos, String dataAdmissao) {
        if (tipoContrato == "Horista" || tipoContrato == "Efetivo"){
            this.tipoContrato = tipoContrato;
        } else {
            System.out.println("Tipo de contrato inválido = " + tipoContrato);
            System.out.println("Tipo de contrato deve ser Horista ou Efetivo");
        }
        this.salario = salario;
        this.numFilhos = numFilhos;
        try{
            this.dataAdmissao = Date.valueOf(dataAdmissao);
        } catch (Exception e) {
            System.out.println("Data inválida = " + e);
            System.out.println("Data deve ser no formato yyyy-mm-dd");
        }

        
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }

    public String getDataAdmissao() {
        return dataAdmissao.toString();


    }

    public void setDataAdmissao(String dataAdmissao) {
        try{
            this.dataAdmissao = Date.valueOf(dataAdmissao);
        } catch (Exception e) {
            System.out.println("Data inválida = " + e);
            System.out.println("Data deve ser no formato yyyy-mm-dd");
        }
    }
}
    