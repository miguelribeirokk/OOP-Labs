package maquina_refri.src;

public class Estoque {
    private Refrigerante refrigerante;
    private int quantidade;
    private double preco;

    //Construtor

    public Estoque(Refrigerante refrigerante, int quantidade, double preco) {
        this.refrigerante = refrigerante;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Getters and Setters

    public Refrigerante getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(Refrigerante refrigerante) {
        this.refrigerante = refrigerante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //Métodos

    public void Adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void Remover(int quantidade) {
        this.quantidade -= quantidade;
    }

}




