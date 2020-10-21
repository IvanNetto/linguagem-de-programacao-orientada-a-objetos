import java.util.ArrayList;

public class Cadastro {
    public static void main(String[] args) {

        Turma turma = new Turma("CHIVUNK", "27/11/2020");
        Esquadrao esquadrao = new Esquadrao("PRATA");

        Disciplina lpoo = new Disciplina("LPOO", "POO", 40);
        Disciplina siop = new Disciplina("SIOP", "SISTEMAS OPERACIONAIS", 40);
        Disciplina bcds = new Disciplina("BCDS", "BANDO DE DADOS", 40);

        Especialidade sin = new Especialidade("SIN", "SISTEMAS DE INFORMAÇÃO");

        sin.addDisciplina(lpoo);
        sin.addDisciplina(siop);
        sin.addDisciplina(bcds);

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(sin);

        Eags novoCurso = new Eags("EAGS", "Estágio de Adaptação", 10, "2020", especialidades);

        sin.listarDisciplinas();

        Aluno novoAluno = new Aluno(6383416
                , "DIEGO DE SOUZA MOURA",
                "MOURA",
                "212121", turma, esquadrao);
        

    }
}
