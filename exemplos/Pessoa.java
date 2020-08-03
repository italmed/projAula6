package exemplos;

/**
 * Pessoa
 */
public class Pessoa { // todas as classes herdam nativamente de Object >> public class Pessoa Extends Object

    private String nome, ender, tel;

    public Pessoa(){

    }

    public Pessoa(String nome, String ender, String tel){
        this.nome = nome;
        this.ender = ender;
        this.tel = tel;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEnder(){
        return ender;
    }

    public void setEnder(String ender){
        this.ender = ender;
    }
    public String getTelefone(){
        return tel;
    }

    public void setTelefone(String tel){
        this.tel = tel;
    }
    
    public String exibirDados(){
        return getNome() +  " - " + getEnder() +  " - " + getTelefone();
    }

        // override abaixo no toString, quando printarmos o objeto direto, os dados dentro deste toString que serão exibidos
        // portanto se alteraos o conteudo dentr dele, aleteramos o que será exibido.
    @Override
    public String toString() {
        return exibirDados();
    }
}