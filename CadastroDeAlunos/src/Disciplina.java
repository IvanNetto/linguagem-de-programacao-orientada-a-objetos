public class Disciplina {
	
	String sigla;
	String descricao;
	int CargaHoraria;
	
	public Disciplina(String sigla, String descricao, int cargaHoraria) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
		CargaHoraria = cargaHoraria;
		//System.out.println("Disciplina " + this.nome + " com sucesso!");
	}
	
	@Override
	public String toString() {
		return this.sigla + " - " + this.descricao;
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

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	
	
}
