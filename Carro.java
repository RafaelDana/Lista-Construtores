Sistema Locadora
public class Carro{

private String modelo;
private String placa;
private Double valorAluguel;

public String Alugar(String modelo){/*o carro(placa) é definida nesse metodo pensando na disponibilidade do modelo */}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

Sistema Revendedora
public class Carro{

private String modelo;
private String cor;
private String placa;
private Double preco;

public String Comprar(String modelo, String cor){}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

Sistema Oficina
public class Carro{
private String placa;
private String[] peças;

public void Verificar(String placa){}
public void Consertar(String placa){}
public void Limpar(String placa){}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

Sistema DETRAN
public class Carro{
private String placa;
private String modelo;
private String cor;
private String[] peças;
private String[] multas;


public void Checkup(String placa){}
public void verificarMultas(String placa){}
public void apreender(String placa){}
public void liberar(String placa){}
public void modificarRegistro(String placa){}

/*Getters e Setters */

}
