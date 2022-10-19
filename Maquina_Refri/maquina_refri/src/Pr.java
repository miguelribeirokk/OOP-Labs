package Maquina_Refri.maquina_refri.src;

public class Pr {

    public static void main(String[] args) {

        //Inicializando os refrigerantes
        Refrigerante refrigerante1 = new Refrigerante(Nome_Refri.COCA_COLA, 350 ,"Coca-Cola", 1);
        Refrigerante refrigerante2 = new Refrigerante(Nome_Refri.SPRITE, 350 ,"Coca-Cola", 2);
        Refrigerante refrigerante3 = new Refrigerante(Nome_Refri.PEPSI, 350 ,"PepsiCo", 3);
        Refrigerante refrigerante4 = new Refrigerante(Nome_Refri.FANTA, 350 ,"Coca-Cola", 4);
        Refrigerante refrigerante5 = new Refrigerante(Nome_Refri.GUARANA, 350 ,"Ambev", 5);

        //Inicializando os estoques
        Estoque estoque1 = new Estoque(refrigerante1, 0, 4.50);
        Estoque estoque2 = new Estoque(refrigerante2, 0, 4.00);
        Estoque estoque3 = new Estoque(refrigerante3, 0, 4.50);
        Estoque estoque4 = new Estoque(refrigerante4, 0, 4.00);
        Estoque estoque5 = new Estoque(refrigerante5, 0, 4.50);

        //Adicionar quantidade de refrigerantes
        estoque1.Adicionar(20);
        estoque2.Adicionar(20);
        estoque3.Adicionar(20);
        estoque4.Adicionar(20);
        estoque5.Adicionar(20);

        //Inicializando a máquina
        Estoque[] estoques = {estoque1, estoque2, estoque3, estoque4, estoque5};
        Maquina maquina = new Maquina(estoques, 10.00, 0,0);

        //Comprar refrigerante
        maquina.Comprar();
    }
}

    

