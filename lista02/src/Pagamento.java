import java.io.FileWriter;
import java.io.IOException;

public class Pagamento {

    Funcionario funcionario;
    private double salarioBruto;
    private double descontoINSS;
    private double descontoIR;
    private double salarioLiquido;

    public Pagamento(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public void GerarFolha(int horasTrabalhadas, String tipoContrato) {
        calcSalarioBruto(horasTrabalhadas, tipoContrato);
        calcINSS();
        calcIR();
        calcSalarioLiquido();
        ImprimirFolha();
    }

    private void calcSalarioBruto(int horasTrabalhadas, String tipoContrato) {
        if (tipoContrato == "Horista"){
            this.salarioBruto = funcionario.getSalario() * horasTrabalhadas;
        } 
        else if (tipoContrato == "Efetivo") {
            this.salarioBruto = funcionario.getSalario();
        }
    }

    private void calcINSS() {    
        if (this.salarioBruto <= 1659.38) {
            this.descontoINSS = this.salarioBruto * 0.08f;
        } else if (this.salarioBruto > 1659.38 && this.salarioBruto <= 2765.66) {
            this.descontoINSS = this.salarioBruto * 0.09f;
        } else if (this.salarioBruto > 2765.66 && this.salarioBruto <= 5531.31) {
            this.descontoINSS = this.salarioBruto * 0.11f;
        } else if (this.salarioBruto > 5531.31) {
            this.descontoINSS = 608.44f;
        }
    }

    private void calcIR(){
        if(this.salarioBruto <= 1903.98){
            this.descontoIR = 0;
        } else if (this.salarioBruto > 1903.98 && this.salarioBruto <= 2826.65){
            this.descontoIR = this.salarioBruto * 0.075f - 142.80f;
        } else if (this.salarioBruto > 2826.65 && this.salarioBruto <= 3751.05){
            this.descontoIR = this.salarioBruto * 0.15f - 354.80f;
        } else if (this.salarioBruto > 3751.05 && this.salarioBruto <= 4664.68){
            this.descontoIR = this.salarioBruto * 0.225f - 636.13f;
        } else if (this.salarioBruto > 4664.68){
            this.descontoIR = this.salarioBruto * 0.275f - 869.36f;
        }
    }
    private void calcSalarioLiquido(){
        this.salarioLiquido = this.salarioBruto - this.descontoINSS - this.descontoIR;
    }

    public void ImprimirFolha(){
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Data de Nascimento: " + funcionario.dataNascimento);
        System.out.println("Tipo de Contrato: " + funcionario.getTipoContrato());

        if (funcionario.getTipoContrato() == "Horista"){
            System.out.println("Salário por hora: " + funcionario.getSalario());
        } else if (funcionario.getTipoContrato() == "Efetivo"){
            System.out.println("Salário: " + funcionario.getSalario());
        }

        System.out.println("Numero de Filhos: " + funcionario.getNumFilhos());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
        System.out.println("Salário Bruto: " + String.format("%.2f", this.salarioBruto));
        System.out.println("Desconto INSS: " + String.format("%.2f", this.descontoINSS));
        System.out.println("Desconto IR: " + String.format("%.2f", this.descontoIR));
        System.out.println("Salário Líquido: " + String.format("%.2f", this.salarioLiquido));


    }
    
    public void GerarArquivo(){
        
        try {
            FileWriter arquivo = new FileWriter(funcionario.nome + ".txt");
            arquivo.write("Nome: " + funcionario.nome + "\n");
            arquivo.write("Data de Nascimento: " + funcionario.dataNascimento + "\n");
            arquivo.write("Tipo de Contrato: " + funcionario.getTipoContrato() + "\n");

            if (funcionario.getTipoContrato() == "Horista"){
                arquivo.write("Salário por hora: " + funcionario.getSalario() + "\n");
            } else if (funcionario.getTipoContrato() == "Efetivo"){
                arquivo.write("Salário: " + funcionario.getSalario() + "\n");
            }

            arquivo.write("Numero de Filhos: " + funcionario.getNumFilhos() + "\n");
            arquivo.write("Data de Admissão: " + funcionario.getDataAdmissao() + "\n");
            arquivo.write("Salário Bruto: " + String.format("%.2f", this.salarioBruto) + "\n");
            arquivo.write("Desconto INSS: " + String.format("%.2f", this.descontoINSS) + "\n");
            arquivo.write("Desconto IR: " + String.format("%.2f", this.descontoIR) + "\n");
            arquivo.write("Salário Líquido: " + String.format("%.2f", this.salarioLiquido) + "\n");
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo");
            e.printStackTrace();
        }
    }



    }
    




    
        
    
