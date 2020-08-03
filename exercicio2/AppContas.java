package exercicio2;

import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opcao, opcao2 = 1;
        double valordeSaque, valorDeposito;
        float saldoCC = 20000;
        float saldoCP = 20000;
        float saldoCE = 20000;

        opcao = 0;



        while (opcao != 4){
            System.out.println("\nBem vindo à sua conta. Digite a opção desejada: ");
            System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupança\n4 - Sair\n\n");
            opcao = in.nextInt();
            opcao2 = 0;

            //MENU CONTA CORRENTE
            if (opcao == 1){
                ContaCorrente conta1 = new ContaCorrente(0001, saldoCC);

                while (opcao2 != 4){
                    System.out.println("\nMenu Conta Corrente. Digite a opção desejada: ");
                    System.out.println("1 - Saque Conta Corrente\n2 - Saldo Conta Corrente\n3 - Deposito conta corrente\n4 - Voltar\n\n");
                    opcao2 = in.nextInt();

                    if (opcao2 == 1){
                        System.out.print("Digite valor para saque: ");
                        valordeSaque = in.nextDouble();
                        conta1.sacar((float)valordeSaque);
                        saldoCC = conta1.getSaldo();
                        opcao2 = 0;
                    }
                    if (opcao2 == 3){
                        System.out.print("\nDigite valor para depositar: ");
                        valorDeposito = in.nextFloat();
                        conta1.depositar((float)valorDeposito);
                        System.out.println("\nSaldo conta corrente = " + conta1.getSaldo());
                        saldoCC = conta1.getSaldo();
                        opcao2 = 0;
                    }
                    if (opcao2 == 2){
                        System.out.println("\nSaldo conta corrente = " + conta1.getSaldo());
                        opcao2 = 0;
                    }
                }
            }

            //MENU CONTA ESPECIAL
            if (opcao == 2){
                ContaEspecial conta2 = new ContaEspecial(0001, saldoCE, 1000);
                opcao2 = 0;

                while (opcao2 != 3){
                    System.out.println("\nMenu Conta Especial. Digite a opção desejada: ");
                    System.out.println("1 - Saque Conta Especial\n2 - Saldo Conta Especial\n3 - Voltar\n\n");
                    opcao2 = in.nextInt();

                    if (opcao2 == 1){
                        System.out.print("\nDigite valor para saque: ");
                        valordeSaque = in.nextFloat();
                        conta2.sacar((float)valordeSaque);
                        opcao2 = 0;
                        saldoCE = conta2.getSaldo();
                    }
                    if (opcao2 == 2){
                        float valor = conta2.getSaldo()+conta2.getLimite();
                        System.out.println("\nSaldo da conta + limite especial: " + valor);
                        saldoCE = conta2.getSaldo();
                        opcao2 = 0;
                    }
                }
            }

            //MENU CONTA POUPANÇA
            if (opcao == 3){
                ContaPoupanca conta3 = new ContaPoupanca(0001, saldoCP);
                opcao2 = 0;

                

                while (opcao2 != 4){
                    System.out.println("\nMenu Conta Poupança. Digite a opção desejada: ");
                    System.out.println("1 - Saque Conta Poupança\n2 - Saldo Conta Poupança\n3 - Depositar\n4 - Voltar\n\n");
                    opcao2 = in.nextInt();
                    if (opcao2 == 1){
                        System.out.print("\nDigit valor para saque: ");
                        valordeSaque = in.nextFloat();
                        conta3.sacar((float)valordeSaque);
                        opcao2 = 0;
                        saldoCP = conta3.getSaldo();
                    }
                    if (opcao2 == 2){
                        System.out.println("\nSaldo da conta poupança: " + conta3.getSaldo());
                        opcao2 = 0;
                        saldoCP = conta3.getSaldo();
                    }
                    if (opcao2 == 3){
                        System.out.print("\nDigite valor para depositar: ");
                        valorDeposito = in.nextFloat();
                        conta3.depositar((float)valorDeposito);
                        System.out.println("\nSaldo conta corrente = " + conta3.getSaldo());
                        opcao2 = 0;
                        saldoCP = conta3.getSaldo();
                    }
                
                }
            }

        
        }
        System.out.println("\nObrigado por utilizar o Caixa Eletrônico. \nFim!\n______________________");
        in.close();
    }   
}
    