import java.util.ArrayList;

public class Cfs
        extends Curso implements Estagio {

    public Cfs(String sigla, String descricao, int duracao, String ano, ArrayList<Especialidade> especialidades) {
        super(sigla, descricao, duracao, ano, especialidades);
    }

    @Override
    public void estagiar(int duracao) {
        System.out.println("ESTAGIANDO: " + duracao);
    }
}
