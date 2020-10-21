import java.time.LocalDate;

public class Cadastro {

	public static void main(String[] args) {
		
		// Criação de um curso do tipo EAGS
		Eags eags = new Eags("EAGS", "Estágio de Adaptação à Graduação de Sargento", 10, "2020");
		System.out.println("#############################");
		
		Especialidade especialidadeSIN = new Especialidade("SIN","SISTEMAS DE INFORMAÇÃO");
		
		// Criando as especialidades para o eags
		eags.listaDeEspecialidade.add(especialidadeSIN);
		
		// Criando as disciplinas para as especialidades
		especialidadeSIN.listaDeDisciplinas.add(new Disciplina("ALOO","Algoritmos e Orientação a Objetos",40));
		especialidadeSIN.listaDeDisciplinas.add(new Disciplina("LPOO", "Linguagem de Programação Orientada a Objetos", 50));
		especialidadeSIN.listaDeDisciplinas.add(new Disciplina("SIGC","Sistema de Gerenciamento de Conteúdo",20));
		
		eags.exibirEspecialidades();
		especialidadeSIN.exibirDisciplinas();
		
		System.out.println("#############################");
		
		Esquadrao esquadrao = new Esquadrao("Prata");
		Turma turma2018 = new Turma("TurmaDe2018", "25/11/2018");
		Turma turma2019 = new Turma("TurmaDe2019", "27/11/2019");
		Turma turma2020 = new Turma("Chivunk", "26/11/2020");
		
		Aluno aluno = new Aluno(6207669,"Ivan Netto Ferreira", "Netto", "02/06/1990", turma2020, esquadrao);	
		
		System.out.println("#############################");		
		// Criar método de adicionar turma ao Esquadrao		
		esquadrao.getListaDeTurma().add(turma2018);
		esquadrao.getListaDeTurma().add(turma2019);
		esquadrao.getListaDeTurma().add(turma2020);
		esquadrao.exibirTurmas();
		
	}
}
