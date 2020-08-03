package exemplos;


public class AppEscola {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Itallo", "Rua Emilino", "99393-2020", 910162114, 2014, "Engenharia Alétrica");
        Professor prof = new Professor("Carlos", "Rua x", "66666-2222", "Msc.", "Uninove", 12000);
    

    System.out.println("Estudante: " + estudante.getNome());
    System.out.println("Professor: " + prof.getNome());
    System.out.println("Salario: " + prof.getSalario());

    //testando o exibirDados, que recebe dados tanto da superclasso (Pessoa) quanto das classes filho (estudante  professor)
    System.out.println(estudante.exibirDados());
    System.out.println(prof.exibirDados());

    //imprimir um objeto Estudante sem método ou atributo
    System.out.println(estudante);

    }
}
