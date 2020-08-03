package exemplos;

public class Professor extends Pessoa {
    String titulo, instituicao;
    float salario;

    public Professor(){

    }

    public Professor(String nome, String ender, String tel, String titulo, String instituicao, float salario){
        super(nome, ender, tel);
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.salario = salario;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getInstituicao(){
        return instituicao;

    }public float getSalario(){
        return salario;
    }

}