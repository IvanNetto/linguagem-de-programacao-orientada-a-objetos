public class Cadastro {

	public static void main(String[] args) {
		
		// Cria��o de um curso do tipo EAGS
		Eags eags = new Eags("EAGS", "Est�gio de Adapta��o � Gradua��o de Sargento", 10, "2020");
		System.out.println("#############################");
		
		Especialidade especialidade = new Especialidade("SIN","SISTEMAS DE INFORMA��O");
		
		// Criando as especialidades para o eags
		eags.listaDeEspecialidade.add(especialidade);
		
		// Criando as disciplinas para as especialidades
		especialidade.listaDeDisciplinas.add(new Disciplina("ALOO","Algoritmos e Orienta��o a Objetos",40));
		especialidade.listaDeDisciplinas.add(new Disciplina("LPOO", "Linguagem de Programa��o Orientada a Objetos", 50));
		especialidade.listaDeDisciplinas.add(new Disciplina("SIGC","Sistema de Gerenciamento de Conte�do",20));
		
		eags.exibirEspecialidades();
		especialidade.exibirDisciplinas();
		 	
		
	}
}
