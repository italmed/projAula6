package exercicio2;

public class ContaEspecial extends Conta {
    float saque;
    float limite;

    public ContaEspecial(int numConta, float saldo, float limite){
        super(numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valorSaque) {
        if (valorSaque <= (saldo + limite)){
            saldo = saldo - valorSaque;
            System.out.printf("Saque realizado! Saldo atual: %.2f\n", saldo);
        }
        else {
            System.err.println("Você não possui limite suficiente para esta operação.");
        }
    }
    @Override
    public float getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();

    }
    public float getLimite(){
        return limite;
    }
}