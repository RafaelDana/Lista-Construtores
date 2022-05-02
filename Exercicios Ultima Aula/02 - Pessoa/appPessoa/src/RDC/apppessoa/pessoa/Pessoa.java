package RDC.apppessoa.pessoa;

/**
 *
 * @author Rafael Dana
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public static void aniversario(Pessoa pessoa){
        pessoa.idade += 1;
    }
}
