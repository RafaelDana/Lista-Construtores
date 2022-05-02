package RDC.appPorta.porta;
/**
 *
 * @author Rafael Dana
 */
public class Porta {
    private String cor;
    private Double tamanho;
    private Boolean aberta;
    
    public Porta(String cor, Double tamanho, Boolean aberta){
        this.cor = cor;
        this.tamanho = tamanho;
        this.aberta = aberta;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }    
    public String getCor() {
        return this.cor;
    }
    public Double getTamanho() {
        return this.tamanho;
    }
    public Boolean getAberta() {
        return this.aberta;
    }   
}
