package exercicio2;

public class Conta {
    int numConta;
    float saldo;


    public Conta(int numConta, float saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String toString() {
        return "Conta nº" + numConta + " | Saldo total: " + saldo;
    }

    public void depositar(float valorDeposito){
        saldo = saldo + valorDeposito;
    }
    public void sacar(float valorSaque){
        saldo = saldo - valorSaque;
    }

    public float getSaldo(){
        return saldo;
    }
}