package RDC.apppessoa.main;

import RDC.apppessoa.pessoa.Pessoa;

/**
 *
 * @author Rafael Dana
 */
public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Rafael",19);

        Pessoa.aniversario(pessoa);
        Pessoa.aniversario(pessoa);
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());   
    }
    
}
