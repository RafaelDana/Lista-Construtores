package RDC.apptelevisao.main;

import RDC.apptelevisao.televisao.Televisao;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Main { 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Boolean ligada;
        Boolean silenciada;
        System.out.println("Estado Inicial: ");
        System.out.println("Esta Ligada? (s/n): ");
        String lig = teclado.next();
        if(lig == "s"){ligada = true;}else{ligada = false;}
        System.out.println("Volume: ");
        int vol = teclado.nextInt();
        verificar:
        if (vol >9 || vol<0){
            System.out.println("Ovolume so vai de 0 a 9 escolha outro: "); 
            vol = (teclado.nextInt());
            if (vol <=9 && vol>=0){break verificar;}
        }
        System.out.println("Canal: ");
        int can = teclado.nextInt();
        verificar:
        if (can >99 || can<0){
            System.out.println("Os canais so vao de 0 a 99 escolha outro: "); 
            can = (teclado.nextInt());
            if (can <=99 && can>=0){break verificar;}
        }
        System.out.println("Esta Silenciada? (s/n): ");
        String sil = teclado.next();
        if(sil == "s"){silenciada = true;}else{silenciada = false;}
        
        Televisao tv = new Televisao(ligada,vol,can,silenciada);
        
        Televisao.botaoligarDesligar(tv);
        Televisao.botaoligarDesligar(tv);
        
        Televisao.mudarCanal(tv);
        Televisao.proximoCanal(tv);
        Televisao.canalAnterior(tv);
        
        Televisao.botaoSilenciarDesilenciar(tv);
        Televisao.botaoSilenciarDesilenciar(tv);
        
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\nEstado: ");
        if (tv.getLigada() == true){System.out.println("ligada");}else{System.out.println("desligada");}
        System.out.println("Canal:\n"+ tv.getCanal());
        System.out.println("Silenciada/Desilenciada: ");
        if (tv.getSilencioso() == true){System.out.println("silenciada");}else{System.out.println("com som!!");}
    }  
}
