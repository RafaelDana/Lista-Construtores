package RDC.appagenda.main;

import RDC.appagenda.agenda.Agenda;

/**
 *
 * @author Rafael Dana
 */
public class Main {
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        agenda.newContato();
        agenda.exibir();
    }
}