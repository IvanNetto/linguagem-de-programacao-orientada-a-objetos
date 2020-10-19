import java.util.ArrayList;

public class Eags extends Curso {
	
	String ano;	
	ArrayList<Especialidade> listaDeEspecialidade = new ArrayList<Especialidade>(); // Composi��o. Pois a exist�ncia de um objeto Especialidade est� ligada � exist�ncia de um objeto Eags
	
	

	public Eags(String sigla, String descricao, int duracao, String ano) {
		super(sigla, descricao, duracao);
		this.ano = ano;
		System.out.println("Ano: " + ano);
		
	}


	public void exibirEspecialidades() {
		
        for (Especialidade especialidade : listaDeEspecialidade) {        
            System.out.println(especialidade.toString()); 
        }
		
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public ArrayList<Especialidade> getListaDeEspecialidade() {
		return listaDeEspecialidade;
	}

	public void setListaDeEspecialidade(ArrayList<Especialidade> listaDeEspecialidade) {
		this.listaDeEspecialidade = listaDeEspecialidade;
	}	

}
