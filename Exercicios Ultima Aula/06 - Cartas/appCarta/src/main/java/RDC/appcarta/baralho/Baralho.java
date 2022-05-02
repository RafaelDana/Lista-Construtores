package RDC.appcarta.baralho;

import java.util.*;

/**
 *
 * @author Rafael Dana
 */
public class Baralho {
        private final List<Carta> listaCartas;

    public Baralho() {
        listaCartas = new ArrayList<>();

        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        int cont = 0;
        Carta carta;

        while (cont < 4) {
            carta = new Carta("As", naipes[cont]);
            listaCartas.add(carta);
            
            for (int i = 2; i <= 10; i++) {
                carta = new Carta(i + "", naipes[cont]);
                listaCartas.add(carta);
            }

            carta = new Carta("Valete", naipes[cont]);
            listaCartas.add(carta);
            carta = new Carta("Dama", naipes[cont]);
            listaCartas.add(carta);
            carta = new Carta("Rei", naipes[cont]);
            listaCartas.add(carta);

            cont++;
        }
    }
    
    public void printBaralhoEmOrdem(){
        StringBuilder baralho = new StringBuilder();
        
        listaCartas.forEach((carta) -> {
            baralho.append(carta.getNome()).append(" de ").append(carta.getNaipe()).append("\n");
        });
        
        System.out.println(baralho.toString());
    }
}
