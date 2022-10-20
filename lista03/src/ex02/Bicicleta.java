//package
package ex02;
public class Bicicleta extends Veiculo{

    private String tipoCorrente;
    private String tipoGuidao;

    public Bicicleta(String cor, String modelo, String marca, int ano, String tipoCorrente, String tipoGuidao) {
        super(2, cor, modelo, marca, ano);
        this.tipoCorrente = tipoCorrente;
        this.tipoGuidao = tipoGuidao;
    }

    //Getters e Setters

    public String getTipoCorrente() {
        return tipoCorrente;
    }

    public void setTipoCorrente(String tipoCorrente) {
        this.tipoCorrente = tipoCorrente;
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

}
