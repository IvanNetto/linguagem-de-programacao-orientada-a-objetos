import java.util.ArrayList;

public class Cfs extends Curso implements Estagio{
	
	private String ano;
	private int semestre;
	private ArrayList<Especialidade> listaDeEspecialidade = new ArrayList<Especialidade>(); // Composi��o. Pois a exist�ncia de um objeto Especialidade est� ligada � exist�ncia de um objeto Cfs
	
	public Cfs(String sigla, String descricao, int duracao, String ano, int semestre) {
		super(sigla, descricao, duracao);
		this.ano = ano;
		this.semestre = semestre;
		System.out.println("Ano: " + ano);
		System.out.println("Semestre: " + semestre);
		this.estagiar(3);
	}

	@Override
	public void estagiar(int duracao) {		
		System.out.println("Est�gio de " + duracao + " meses " + "� necess�rio");
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public ArrayList<Especialidade> getListaDeEspecialidade() {
		return listaDeEspecialidade;
	}

	public void setListaDeEspecialidade(ArrayList<Especialidade> listaDeEspecialidade) {
		this.listaDeEspecialidade = listaDeEspecialidade;
	}
	
	
}
