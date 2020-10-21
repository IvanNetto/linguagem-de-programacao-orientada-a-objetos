import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Turma {	
	
	private String nome;	
	private String dataDeFormatura = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));// corrigir
	
	
	public Turma(String nome, String dataDeFormatura) {		
		this.nome = nome;
		this.dataDeFormatura = dataDeFormatura;
		
	}

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

	public String getDataDeFormatura() {
		return dataDeFormatura;
	}

	public void setDataDeFormatura(String dataDeFormatura) {
		this.dataDeFormatura = dataDeFormatura;
	}

}

