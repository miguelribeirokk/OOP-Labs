import java.util.Scanner;

public class Maquina {
    private Estoque[] estoques;
    private double saldo;
    private double credito;
    private double troco;


    //Construtor

    public Maquina(Estoque[] estoques, double saldo, double credito, double troco) {
        this.estoques = estoques;
        this.saldo = saldo;
        this.credito = credito;
        this.troco = troco;
    }

    //Getters and Setters

    public Estoque[] getEstoques() {
        return estoques;
    }

    public void setEstoques(Estoque[] estoques) {
        this.estoques = estoques;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito += credito;
    }
    
    public void Comprar(int id) {
        for (Estoque estoque : estoques) {
            if (estoque.getRefrigerante().getId() == id) {
                System.out.println("\nVocê escolheu: " + estoque.getRefrigerante().getNome() + " "  + estoque.getRefrigerante().getVolume() + "l" + " " + estoque.getRefrigerante().getMarca());
                System.out.println("O preço é: " + estoque.getPreco() + "R$");
                System.out.println("Possuímos " + estoque.getQuantidade() + " unidades");
                System.out.println("Pressione qualquer tecla para continuar...");
                try (Scanner scanner = new Scanner(System.in)) {
                    scanner.nextLine();
                }
                Menu_Moeada();
                Inserir_Moedas(estoque);
                Efetuar_Compra(estoque);
            }
        }
    }


    public void Menu_Moeada() {
        System.out.println("\n0 - Efetuar compra");
        System.out.println("1 - R$ 0,05");
        System.out.println("2 - R$ 0,10");
        System.out.println("3 - R$ 0,25");
        System.out.println("4 - R$ 0,50");
        System.out.println("5 - R$ 1,00\n");

    }

    public void Inserir_Moedas(Estoque estoque) {
        System.out.println("Insira: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    setCredito(0.05);
                    System.out.println("Credito: " + getCredito());
                    Menu_Moeada();
                    Inserir_Moedas(estoque);
                    break;
                case 2:
                    setCredito(0.10);
                    System.out.println("Credito: " + getCredito());
                    Menu_Moeada();
                    Inserir_Moedas(estoque);
                    break;
                case 3:
                    setCredito(0.25);
                    System.out.println("Credito: " + getCredito());
                    Menu_Moeada();
                    Inserir_Moedas(estoque);
                    break;
                case 4:
                    setCredito(0.50);
                    System.out.println("Credito: " + getCredito());
                    Menu_Moeada();
                    Inserir_Moedas(estoque);
                    break;
                case 5:
                    setCredito(1.00);
                    System.out.println("Credito: " + getCredito());
                    Menu_Moeada();
                    Inserir_Moedas(estoque);
                    break;
                default:
                    if(getCredito() < estoque.getPreco()) {
                        System.out.println("Insira mais moedas, o valor inserido é menor que o valor do refrigerante");
                        System.out.println("Credito: " + getCredito());
                        Menu_Moeada();
                        Inserir_Moedas(estoque);
                    }
                    break;
            }
        }
    }

    private void Efetuar_Compra(Estoque estoque) {
        if (getCredito() >= estoque.getPreco()) {
            if (estoque.getQuantidade() > 0) {
                System.out.println("Compra efetuada com sucesso!");
                setTroco(getCredito() - estoque.getPreco());
                System.out.println("Seu troco é: " + getTroco());
            }}}}

