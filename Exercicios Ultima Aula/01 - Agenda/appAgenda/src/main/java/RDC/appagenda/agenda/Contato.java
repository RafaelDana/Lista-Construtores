package RDC.appagenda.agenda;

/**
 *
 * @author Rafael Dana
 */
public class Contato {
    private String nome;
    private String idade;   
    private String telefone;
    
    public Contato(String nome,String idade,String telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    
    public void setNome(String nome) {
         this.nome = nome;
    }
    public void setIdade(String idade) {
         this.idade = idade;
    }
    public void setTelefone(String telefone) {
         this.telefone = telefone;
    }
    public String getNome() {
        return this.nome;
    }
    public String getIdade() {
        return this.idade;
    }
    public String getTelefone() {
        return this.telefone;
    }
}
