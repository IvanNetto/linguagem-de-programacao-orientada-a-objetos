import java.util.ArrayList;

public class Esquadrao {	
	
	private String cor;	
	private ArrayList<Turma> listaDeTurma = new ArrayList<>();
	
	public Esquadrao(String cor) {		
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public ArrayList<Turma> getListaDeTurma() {
		return listaDeTurma;
	}

	public void setListaDeTurma(ArrayList<Turma> listaDeTurma) {
		this.listaDeTurma = listaDeTurma;
	}

	@Override
	public String toString() {
		return this.cor; 
	}
	
	public void exibirTurmas() {
		
        for (Turma turma : listaDeTurma) {        
            System.out.println(turma.toString()); 
        }
		
	}
}

