public class Aluno {
    private int saram;
    private String nomeCompleto;
    private String nomeDeGuerra;
    private String dataDeNascimento;

    private Turma turma;
    private Esquadrao esquadrao;

    public Aluno(int saram,
                 String nomeCompleto,
                 String nomeDeGuerra,
                 String dataDeNascimento,
                 Turma turma,
                 Esquadrao esquadrao) {
        this.saram = saram;
        this.nomeCompleto = nomeCompleto;
        this.nomeDeGuerra = nomeDeGuerra;
        this.dataDeNascimento = dataDeNascimento;
        this.turma = turma;
        this.esquadrao = esquadrao;

        System.out.println("Oi, eu sou o aluno " + this.nomeDeGuerra
                + " da turma " + this.turma.getNome() + " do esquadrão " + this.esquadrao.getCor());
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getSaram() {
        return saram;
    }

    public void setSaram(int saram) {
        this.saram = saram;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
