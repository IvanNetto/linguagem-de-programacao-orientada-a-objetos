import java.util.ArrayList;

public class Especialidade {
		
	String sigla;
	String descricao;
	
	ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<Disciplina>(); // Composição. Pois a existência de um objeto Disciplina está ligada à existência de um objeto Especialidade

	public Especialidade(String sigla, String descricao) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
				
	}
	
	@Override
	public String toString() {
		return this.sigla + " - " + this.descricao;
	}
	
	public void exibirDisciplinas() {
		
        for (Disciplina disciplina : listaDeDisciplinas) {        
            System.out.println(disciplina.toString()); 
        }		
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Disciplina> getListaDeDisciplinas() {
		return listaDeDisciplinas;
	}

	public void setListaDeDisciplinas(ArrayList<Disciplina> listaDeDisciplinas) {
		this.listaDeDisciplinas = listaDeDisciplinas;
	}
	
	
}
