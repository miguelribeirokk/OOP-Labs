package ex02;

public class Veiculo {
    private int numeroRodas;
    private String cor;
    private String modelo;
    private String marca;
    private int ano;
    private double velocidadeAtual;

    public Veiculo(int numeroRodas, String cor, String modelo, String marca, int ano) {
        this.numeroRodas = numeroRodas;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    //Functions
    public void acelerar(double velocidade) {
        /*
        * This method is used to accelerate the vehicle
         */

        this.velocidadeAtual += velocidade;
    }

    public void parar() {
        /*
        * This method is used to stop the vehicle
         */
        this.velocidadeAtual = 0;
    }


    //Getters e Setters

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


}
