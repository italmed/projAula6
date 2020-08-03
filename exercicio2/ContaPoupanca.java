package exercicio2;

public class ContaPoupanca extends Conta {
    float saque;
    float taxaSaque;

    public ContaPoupanca(int numConta, float saldo) {
        super(numConta, saldo); 
        this.taxaSaque = 0.20f;
    }

    @Override
    public void sacar(float valorSaque) {
        if (valorSaque <= (saldo - taxaSaque)){
            saldo = saldo - valorSaque - taxaSaque;
            System.out.println("Saque realizado! Cobrada taxa de R$" + taxaSaque + ".");
        }
        else {
            System.err.println("Você não possui saldo suficiente para esta operação.");
        }
    }

    @Override
    public void depositar(float valorDeposito) {
        // TODO Auto-generated method stub
        super.depositar(valorDeposito);
    }

    @Override
    public float getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

}