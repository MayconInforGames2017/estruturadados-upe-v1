package lista;

public class No {

	private Aluno aluno;
	private No proximo;

	public No(Aluno alunos) {
		this.aluno = alunos;
		this.proximo = null;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

}
