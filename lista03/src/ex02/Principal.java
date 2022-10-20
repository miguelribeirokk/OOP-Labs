//add package
package ex02;

public class Principal {

    

    public static void main(String[] args) {   

        //Instanciando alguns objetos da classe Bicicleta
        Bicicleta[] listaBicicletas = new Bicicleta[5];
        listaBicicletas[0] = new Bicicleta("Azul", "Modelo 1", "Marca 1", 2010, "Corrente 1", "Guidão 1");
        listaBicicletas[1] = new Bicicleta("Vermelha", "Modelo 2", "Marca 2", 2011, "Corrente 2", "Guidão 2");
        listaBicicletas[2] = new Bicicleta("Verde", "Modelo 3", "Marca 3", 2012, "Corrente 3", "Guidão 3");
        listaBicicletas[3] = new Bicicleta("Amarela", "Modelo 4", "Marca 4", 2013, "Corrente 4", "Guidão 4");
        listaBicicletas[4] = new Bicicleta("Roxa", "Modelo 5", "Marca 5", 2014, "Corrente 5", "Guidão 5");
     
        //Imprimindo os objetos da classe Bicicleta 
        for (int i = 0; i < listaBicicletas.length; i++) {
            System.out.println("___________________________________________________________________________");
            System.out.println("Bicicleta " + (i+1));
            System.out.println("Numero de rodas: " + listaBicicletas[i].getNumeroRodas());
            System.out.println("Cor: " + listaBicicletas[i].getCor());
            System.out.println("Modelo: " + listaBicicletas[i].getModelo());
            System.out.println("Marca: " + listaBicicletas[i].getMarca());
            System.out.println("Ano: " + listaBicicletas[i].getAno());
            System.out.println("Tipo de corrente: " + listaBicicletas[i].getTipoCorrente());
            System.out.println("Tipo de guidão: " + listaBicicletas[i].getTipoGuidao());
        }

        System.out.println("\n################################\n");


        //Instanciando alguns objetos da classe Automovel

        Automovel[] listaAutomoveis = new Automovel[5];
        listaAutomoveis[0] = new Automovel(4, "Azul", "Modelo 1", "Marca 1", 2010,
                                "2023-01-01", "2023-01-02", "2023-01-03", "Bateria 1", "Motor 1");


        listaAutomoveis[1] = new Automovel(4, "Vermelha", "Modelo 2", "Marca 2", 2011,
                                "2023-11-09", "2023-12-22", "2023-10-03", "Bateria 2", "Motor 2");

        listaAutomoveis[2] = new Automovel(4, "Verde", "Modelo 3", "Marca 3", 2012,
                                "2023-01-25", "2023-09-02", "2023-09-11", "Bateria 3", "Motor 3");

        listaAutomoveis[3] = new Automovel(4, "Amarela", "Modelo 4", "Marca 4", 2013,
                                "2023-07-15", "2023-12-12", "2023-01-03", "Bateria 4", "Motor 4");

        listaAutomoveis[4] = new Automovel(4, "Roxa", "Modelo 5", "Marca 5", 2014,
                                "2023-05-10", "2023-05-11", "2023-11-04", "Bateria 5", "Motor 5");
            


        

        

        //Imprimindo os objetos da classe Automovel

        for (int i = 0; i < listaAutomoveis.length; i++) {
            System.out.println("___________________________________________________________________________");
            System.out.println("Automovel " + (i+1));
            System.out.println("Numero de rodas: " + listaAutomoveis[i].getNumeroRodas());
            System.out.println("Cor: " + listaAutomoveis[i].getCor());
            System.out.println("Modelo: " + listaAutomoveis[i].getModelo());
            System.out.println("Marca: " + listaAutomoveis[i].getMarca());
            System.out.println("Ano: " + listaAutomoveis[i].getAno());
            System.out.println("Data da troca de óleo: " + listaAutomoveis[i].getDataTrocaOleo());
            System.out.println("Data da troca de pneus: " + listaAutomoveis[i].getDataTrocaPneu());
            System.out.println("Data da revisão: " + listaAutomoveis[i].getDataRevisao());
            System.out.println("Tipo de bateria: " + listaAutomoveis[i].getTipoBateria());
            System.out.println("Tipo de motor: " + listaAutomoveis[i].getTipoMotor());
        }


 
    }


}
