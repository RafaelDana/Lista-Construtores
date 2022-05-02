package RDC.appcarta.baralho;
/**
 *
 * @author Rafael Dana
 */
public class Carta {
    private String nome;
    private String naipe;
    
    public Carta(String nome, String naipe){
        this.nome = nome;
        this.naipe = naipe;
    }    
    public String getNome() {
        return nome;
    }
    public String getNaipe() {
        return naipe;
    }    
}
