package RDC.appcasa.casa;
/**
 *
 * @author Rafael Dana
 */
public class Casa {
    private String cor;
    private Boolean porta1;
    private Boolean porta2;
    private Boolean porta3;
    
    public Casa(String cor, Boolean porta1, Boolean porta2, Boolean porta3){
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }    
    public String getCor() {
        return this.cor;
    }
    public void setPorta1(Boolean porta1) {
        this.porta1 = porta1;
    }    
    public Boolean getPorta1(){
        return this.porta1;
    }
    public void setPorta2(Boolean porta2) {
        this.porta2 = porta2;
    }    
    public Boolean getPorta2(){
        return this.porta2;
    }
    public void setPorta3(Boolean porta3) {
        this.porta3 = porta3;
    }    
    public Boolean getPorta3(){
        return this.porta3;
    }
}
