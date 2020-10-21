import java.util.ArrayList;

public class Esquadrao {
    private String cor;
    private ArrayList<Turma> turma;

    public Esquadrao(String cor) {
        this.cor = cor;
    }

    public ArrayList<Turma> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
