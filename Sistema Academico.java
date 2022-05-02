public class Aluno{

private String nome;
private String[] turmasInscrito;
private String[] Historico;
private int cr;


public String[] HistoricoAluno(String nome){}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

public class Professor{

private String nome;
private String[] turmas;
private Double salario;

public String MediaAlunoTurma (String nomeAluno, String turma){}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

public class Disciplina{

private String nome;
private String[] conteudo;
private Double cargaHoraria;

public String DescriçãoDisciplina(String nome){}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

public class Turma {

private String id;
private String materia;
private String[] Cronograma;
private String[] alunosInscritos;
private String horarios;

public String HorarioAula(String id){}

/*Getters e Setters */

}

/*____________________________________________________________________________________________________________________________*/

public class Inscrição {

private String nomeAluno;
private String[] disciplinas;
private int quantidadeInscritos;
private String[] prioridade;
private String[] turmasDisponiveis;


public String CalculoCR(String aluno){}

/*Getters e Setters */

}