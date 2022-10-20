package project;

public class Refrigerante {
    private Nome_Refri nome;
    private int id;
    private double volume;
    private String marca;

    //Construtor

    public Refrigerante(Nome_Refri nome, double volume, String marca, int id) {
        this.nome = nome;
        this.volume = volume;
        this.marca = marca;
        this.id = id;
    }
    
    //Getters and Setters
    public Nome_Refri getNome() {
        return nome;
    }

    public void setNome(Nome_Refri nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 

}
