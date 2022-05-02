package RDC.appPorta.main;

import RDC.appPorta.porta.Porta;

/**
 *
 * @author Rafael Dana
 */
public class Main {
    
    public static void main(String[] args) {
        Porta porta = new Porta("vermelho", 1.0, true);
        
        porta.setCor("verde");
        porta.setCor("amarelo");
        
        porta.setTamanho(2.0);
        porta.setTamanho(3.0);
        
        porta.setAberta(false);
        porta.setAberta(true);
        
        System.out.println("Cor: "+porta.getCor());
        System.out.println("Tamanho: "+porta.getTamanho()+'m');
        System.out.println("Estado: "+ estaAberta(porta));
    }
    static String estaAberta(Porta porta){
        if (porta.getAberta() == true){
            return ("Esta aberta!!");
        }else{
            return("Esta fechada!!");
        }
    }

}
