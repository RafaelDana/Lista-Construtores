package RDC.appcasa.main;

import RDC.appcasa.casa.Casa;

/**
 *
 * @author Rafael Dana
 */
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Vermelho", true, true, true);
        

        casa.setCor("Verde");
        
        casa.setPorta1(false);
        casa.setPorta2(false);
        
        quantasPortasEstaoAbertas(casa);
    }
    static void quantasPortasEstaoAbertas(Casa casa){
        int portasAbertas = 0;
        if(casa.getPorta1() == true){
            portasAbertas += 1;
        } 
        if(casa.getPorta2() == true){
                portasAbertas += 1;
        }
        if(casa.getPorta3() == true){
                portasAbertas += 1;
        }
        System.out.println(portasAbertas + " porta(s)");
    }
    
}
