package maquina_refri.src;

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

    private Estoque[] getEstoques() {
        return estoques;
    }

    private void setEstoques(Estoque[] estoques) {
        this.estoques = estoques;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getTroco() {
        return troco;
    }

    private void setTroco(double troco) {
        this.troco = troco;
    }

    private double getCredito() {
        return credito;
    }

    private void setCredito(double credito) {
        this.credito = credito;
    }

    //Métodos para o usuário
    public void Comprar() {
        System.out.println("Digite o ID do refrigerante que deseja comprar ou 0 para encerrar: ");
        int id_refri = Menu_Refri();
        if (id_refri == 0) return;
        for (Estoque estoque : estoques) {
            if (estoque.getRefrigerante().getId() == id_refri) {
                System.out.println("\nVocê escolheu: " + estoque.getRefrigerante().getNome() + " "  + estoque.getRefrigerante().getVolume() + "ml" + " " + estoque.getRefrigerante().getMarca());
                System.out.println("O preço é: " + estoque.getPreco() + "R$");
                System.out.println("Possuímos " + estoque.getQuantidade() + " unidades");
                System.out.println("Pressione enter para continuar");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                Menu_Moeda();
                Inserir_Moedas(estoque);
                Efetuar_Compra(estoque);
            }
        }
    }

    private int Menu_Refri() {
        for (Estoque estoque : estoques) {
            System.out.println(estoque.getRefrigerante().getId() + " - " + estoque.getRefrigerante().getNome() + " " + estoque.getRefrigerante().getVolume() + "ml" + " " + estoque.getRefrigerante().getMarca());
        }
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (id == 0) {
            System.out.println("Obrigado por utilizar a máquina!");
            System.exit(0);
        }

        else if (id < 0 || id > estoques.length) {
            System.out.println("ID inválido, tente novamente");
            Menu_Refri();
            
        }
        return id;
    }


    private void Menu_Moeda() {
        System.out.println("\n0 - Efetuar compra");
        System.out.println("1 - R$ 0,05");
        System.out.println("2 - R$ 0,10");
        System.out.println("3 - R$ 0,25");
        System.out.println("4 - R$ 0,50");
        System.out.println("5 - R$ 1,00");
    }

    private void Inserir_Moedas(Estoque estoque) {
        System.out.println("Insira: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    setCredito(this.credito + 0.05);
                    break;
                case 2:
                    setCredito(this.credito + 0.10);
                    break;
                case 3:
                    setCredito(this.credito + 0.25);
                    break;
                case 4:
                    setCredito( this.credito + 0.50);
                    break;
                case 5:
                    setCredito(this.credito + 1.00);
                    break;
                default:
                    if(getCredito() < estoque.getPreco()) {
                        System.out.println("Insira mais moedas, o valor inserido é menor que o valor do refrigerante");
                        break;
                    }
                    Efetuar_Compra(estoque);

            }
            System.out.println("\nCredito: " + getCredito() + "R$");
            System.out.println("Preço: " + estoque.getPreco() + "R$");
            if(getCredito() < estoque.getPreco()) {
                System.out.println("Necessário inserir mais: " + (estoque.getPreco() - getCredito()) + "R$");
            }
            Menu_Moeda();
            Inserir_Moedas(estoque);
        }
    }

    private void Efetuar_Compra(Estoque estoque) {
        if (estoque.getQuantidade() > 0) {
            System.out.println("Compra efetuada com sucesso!");
            setTroco(getCredito() - estoque.getPreco());
            System.out.println("Seu troco é: " + getTroco());
            setSaldo(getSaldo() + estoque.getPreco());
            estoque.setQuantidade(estoque.getQuantidade() - 1);
            setCredito(0);
        } else {
             System.out.println("Não há mais unidades deste refrigerante");
        }
        System.out.println("Pressione enter para continuar");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Comprar();
    }

    //Funções para o administrador da máquina
    private void Menu_Admin() {
        System.out.println("1 - Adicionar refrigerante");
        System.out.println("2 - Remover refrigerante");
        System.out.println("3 - Alterar preço");
        System.out.println("4 - Alterar quantidade");
        System.out.println("5 - Ver estoque");
        System.out.println("6 - Ver saldo");
        System.out.println("7 - Sair");
    }

    //Ainda não implementado
    private void Administrador(){
        System.out.println("Digite a senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        if (senha.equals("1234")) {
            Menu_Admin();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    //Adicionar_Refri();
                    break;
                case 2:
                    //Remover_Refri();
                    break;
                case 3:
                    //Alterar_Preco();
                    break;
                case 4:
                    //Alterar_Quantidade();
                    break;
                case 5:
                    //Ver_Estoque();
                    break;
                case 6:
                    //Ver_Saldo();
                    break;
                case 7:
                    System.out.println("Obrigado por utilizar a máquina!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    Administrador();
            }
        } else {
            System.out.println("Senha incorreta, tente novamente");
            Administrador();
        }
    } 
}
        

        

