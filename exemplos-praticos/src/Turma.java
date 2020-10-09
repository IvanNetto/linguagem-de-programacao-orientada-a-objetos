import java.util.Date;

public class Turma {	
	String nome;
	Date dataDeFormatura;
	Esquadrao esquadrao;	
	
	/* ### CONSTRUTOR PARA EXIBIR A COR DO ESQUADRÃO ###
	 * public Turma (Esquadrao esquadrao) { this.esquadrao = esquadrao; }
	 */
    
	@Override
	public String toString() {
		return this.nome; 
	}

	public String getNome() { 
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Date getDataDeFormatura() {
		return dataDeFormatura;
	}



	public void setDataDeFormatura(Date dataDeFormatura) {
		this.dataDeFormatura = dataDeFormatura;
	}
	
}

