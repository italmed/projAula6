package exercicio6;

public class Funcionario {
    
    String nome;
    int horasTrabalhadas;
    float valorPorHora;

    public Funcionario(){

    }

    public Funcionario(String nome, int horasTrabalhadas, float valorPorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public float getSalario(){
        float salarioFinal = horasTrabalhadas * valorPorHora;
        return salarioFinal;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public String toString() {
        return nome + " - Trabalhou " + horasTrabalhadas + " horas e recebeu o total de " + getSalario();
    }
}