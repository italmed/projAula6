package exemplos;

public class Estudante extends Pessoa {
    
    private int ra, anoGraduacao;
    private String curso;

    public Estudante(){

    }
    public Estudante(String nome, String ender, String tel, int ra, int anoGraduacao, String curso){
        super(nome, ender, tel); //chama o construtor da classe base, ou super-classe
        this.ra = ra;
        this.anoGraduacao = anoGraduacao;
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }

    public int getAnoGraduacao(){
        return anoGraduacao;
    }

    public int getRa(){
        return ra;
    }
}