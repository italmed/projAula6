package exercicio1;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Jr", 200, 45);
        FuncionarioPleno func2 = new FuncionarioPleno("Pleno", 200, 45, 60);
        FuncionarioSenior func3 = new FuncionarioSenior("Serio", 200, 45, 60);

        System.out.println(func1);
        System.out.println(func2);
        System.out.println(func3);


    }
}