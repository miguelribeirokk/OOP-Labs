

public class Funcionario {
    String nome;
    String dataNascimento;
    String tipoContrato;
    double salario;
    int numFilhos;
    String dataAdmissao;

    public Funcionario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void Contratar(String tipoContrato, float salario, int numFilhos, String dataAdmissao) {
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.numFilhos = numFilhos;
        this.dataAdmissao = dataAdmissao;
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
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


}
    
