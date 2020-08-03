package exemplos;

import java.util.Scanner;

import exercicio2.ContaCorrente;

/**
 * ExemploMenuSwitch
 */
public class ExemploMenuSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaCorrente cc1;
        int opcao;
        int numeroConta;
        cc1 = null;
        do {       
        System.out.println("\nDigite a Opção: \n");
        System.out.println("1 - Criar nova conta corrente");
        System.out.println("2 - Mostra dados conta");
        System.out.println("3 - Menu 3");
        System.out.println("4 - Menu Sair");
        opcao = in.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o numero da Conta Corrente: ");
                numeroConta = in.nextInt();
                cc1 = new ContaCorrente(numeroConta, 0);
                break;
            case 2:
                if (cc1 != null){
                    System.out.println(cc1.exibirDados());
                } else {
                    System.out.println("Não existe conta criada.");
                }
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            case 4:
                break;
            default: 
                System.err.println("Opção Inválida");
        }


        } while (opcao != 7);

        
        in.close();
        }

        
    }
    