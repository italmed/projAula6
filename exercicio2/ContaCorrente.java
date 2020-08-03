package exercicio2;

public class ContaCorrente extends Conta {
    float saque;

    public ContaCorrente(int numConta, float saldo){
        super(numConta, saldo);
    }

    public String exibirDados(){
        return "Conta " + numConta + ": " + saldo;
    }

    @Override
    public void sacar(float valorSaque) {
        if (valorSaque > saldo){
            System.out.println("Saldo insuficiente para saque!");
        }
        else {
            saldo = saldo - valorSaque;
            System.out.printf("Saque realizado. Saldo atual: %.2f\n", saldo);
        }
    }

    @Override
    public void depositar(float valorDeposito) {
        saldo = (saldo + valorDeposito) - 0.10f;
    }

    @Override
    public float getSaldo() {
        return super.getSaldo();
    }
}