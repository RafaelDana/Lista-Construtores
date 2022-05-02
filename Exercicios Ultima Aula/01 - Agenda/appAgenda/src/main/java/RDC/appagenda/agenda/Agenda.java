package RDC.appagenda.agenda;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Rafael Dana
 */
public class Agenda {
    Scanner teclado = new Scanner(System.in);
    public ArrayList<Contato> contatos;
    Contato contato = new Contato("nome", "idade", "telefone");

   
    public void newContato(){
        contatos = new ArrayList<>();
        for (int i = 0; !"-".equals(contato.getNome()); i++){ 
            Contato contato = new Contato("nome", "idade", "telefone");
            System.out.println("Nome: ");
            contato.setNome(teclado.next());
            if ("-".equals(contato.getNome())){
                break;
            }
            System.out.println("Idade: ");
            contato.setIdade(teclado.next());
            System.out.println("Telefone: ");
            contato.setTelefone(teclado.next());
            contatos.add(contato);

        }
    }

    public void exibir(){
        for(int i = 0; i < contatos.size(); i++) {
            System.out.println("\nNome: "+contatos.get(i).getNome()+" Idade: "+contatos.get(i).getIdade()+" Telefone: "+contatos.get(i).getTelefone()+"\n");
        }
    }
}

