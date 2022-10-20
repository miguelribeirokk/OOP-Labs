package project;


public class Principal {

    public static void main(String[] args) {


        Funcionario funcionario1 = new Funcionario("João", "1990-08-01");
        funcionario1.Contratar("Horista", 50 , 2, "2015-02-24");
        Pagamento pagamento1 = new Pagamento(funcionario1);
        pagamento1.GerarFolha(160, "Horista");
        


        System.out.println("====================================");

        Funcionario funcionario2 = new Funcionario("Maria", "1993-02-15");
        funcionario2.Contratar("Efetivo", 5000 , 0, "2019-11-02");
        Pagamento pagamento2 = new Pagamento(funcionario2);
        pagamento2.GerarFolha(0, "Efetivo");
        

        System.out.println("====================================");
    }
}
