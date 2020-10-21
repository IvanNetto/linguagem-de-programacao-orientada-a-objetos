import java.util.ArrayList;

public class Cfs extends Curso implements Estagio{
	
	private String ano;
	private int semestre;
	private ArrayList<Especialidade> listaDeEspecialidade = new ArrayList<Especialidade>(); // Composição. Pois a existência de um objeto Especialidade está ligada à existência de um objeto Cfs
	
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
		System.out.println("Estágio de " + duracao + " meses " + "é necessário");
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
