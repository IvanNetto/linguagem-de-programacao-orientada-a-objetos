
public class Aluno {

	String nome;
	int idade;
	String esquadrao;
	int nrSaram;
	
	
	public static void main(String[] args) {

		String nome;
		int idade;
		String esquadrao;
		int nrSaram;
		
		nome = "João das frutas"; 
		idade = 20;
		esquadrao = "Prata";
		nrSaram = 6547886;
		
        Aluno magalhaes = new Aluno();
        magalhaes.nome = "João das coves";
        magalhaes.idade = 20;
        magalhaes.esquadrao = "Prata";
        magalhaes.nrSaram = 6547886;
		
		
	}	
	
	public String entoarGritoDeGuerra() {
		return "Esquadrao Prata Brasil !!!";
	}

}
