package exercicio6;

public class FuncionarioSenior extends Funcionario{
    
    float bonus, bonusTotal;

    public FuncionarioSenior(){

    }

    public FuncionarioSenior(String nome, int horasTrabalhadas, float valorPorHora, float bonus){
        super(nome, horasTrabalhadas, valorPorHora);
        this.bonus = bonus;
    }

    public float calculoBonus(){
        if (getHorasTrabalhadas()/10 > 0){
            bonusTotal = (getHorasTrabalhadas()/10) * bonus;
        }
        return bonusTotal;
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }

    private float salarioMaisBonus(){
        return getSalario() + calculoBonus();
    }

    @Override
    public int getHorasTrabalhadas() {
        return super.getHorasTrabalhadas();
    }

    @Override
    public String toString() {
        return super.toString() + " mais " + calculoBonus() + " de bonus, totalizando o salario de " + salarioMaisBonus();
    }
}