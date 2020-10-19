public class Cadastro {

	public static void main(String[] args) {
		
		// Criação de um curso do tipo EAGS
		Eags eags = new Eags("EAGS", "Estágio de Adaptação à Graduação de Sargento", 10, "2020");
		System.out.println("#############################");
		
		Especialidade especialidade = new Especialidade("SIN","SISTEMAS DE INFORMAÇÃO");
		
		// Criando as especialidades para o eags
		eags.listaDeEspecialidade.add(especialidade);
		
		// Criando as disciplinas para as especialidades
		especialidade.listaDeDisciplinas.add(new Disciplina("ALOO","Algoritmos e Orientação a Objetos",40));
		especialidade.listaDeDisciplinas.add(new Disciplina("LPOO", "Linguagem de Programação Orientada a Objetos", 50));
		especialidade.listaDeDisciplinas.add(new Disciplina("SIGC","Sistema de Gerenciamento de Conteúdo",20));
		
		eags.exibirEspecialidades();
		especialidade.exibirDisciplinas();
		 	
		
	}
}
