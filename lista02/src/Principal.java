

public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", "01/01/1990");
        funcionario1.Contratar("Horista", 50 , 2, "01/01/2010");
        Pagamento pagamento1 = new Pagamento(funcionario1);
        pagamento1.GerarFolha(160, "Horista");
        pagamento1.GerarArquivo();


        System.out.println("====================================");

        Funcionario funcionario2 = new Funcionario("Maria", "10/05/1984");
        funcionario2.Contratar("Efetivo", 5000 , 0, "01/09/2005");
        Pagamento pagamento2 = new Pagamento(funcionario2);
        pagamento2.GerarFolha(0, "Efetivo");
        pagamento2.GerarArquivo();

        System.out.println("====================================");

        Funcionario funcionario3 = new Funcionario("José", "23/12/1980");
        funcionario3.Contratar("Horista", 20 , 4, "09/12/2010");
        Pagamento pagamento3 = new Pagamento(funcionario3);
        pagamento3.GerarFolha(180, "Horista");
        pagamento3.GerarArquivo();

        System.out.println("====================================");

        Funcionario funcionario4 = new Funcionario("Ana", "31/03/1988");
        funcionario4.Contratar("Efetivo", 3000 , 0, "11/09/2001");
        Pagamento pagamento4 = new Pagamento(funcionario4);
        pagamento4.GerarFolha(30, "Efetivo");
        pagamento4.GerarArquivo();








        


    

    }
    
}
