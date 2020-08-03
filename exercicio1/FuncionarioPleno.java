package exercicio1;

public class FuncionarioPleno extends Funcionario{
    
    float bonus, bonusTotal;

    public FuncionarioPleno(){
    }

    public FuncionarioPleno(String nome, int horasTrabalhadas, float valorPorHora, float bonus){
        super(nome, horasTrabalhadas, valorPorHora);
        this.bonus = bonus;
    }

    public float calculoBonus(){
        if (super.getHorasTrabalhadas()/20 > 0){
            bonusTotal = (super.getHorasTrabalhadas()/20) * bonus;
        }
        else{
            bonusTotal = 0;
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
    public String toString() {
        return super.toString() + " mais " + calculoBonus() + " de bonus, totalizando o salario de " + salarioMaisBonus();
    }
}