package lista;

public class ListaSimples {

	private No primeiro;
	private No ultimo;
	private int quantidade;

	public ListaSimples() {
		this.primeiro = null;
		this.ultimo = null;
		this.quantidade = 0;
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void inserirPrimeiro(Aluno aluno) {
		No novoNo = new No(aluno);
		if (this.vazio()) {
			this.ultimo = novoNo;
		}
		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidade++;
	}

	public boolean vazio() {
		return (this.primeiro == null);
	}

	public void inserirUltimo(Aluno aluno) {
		No novoNo = new No(aluno);
		if (this.vazio()) {
			this.primeiro = novoNo;
		} else {
			this.ultimo.setProximo(novoNo);
		}
		this.ultimo = novoNo;
		this.quantidade++;
	}

	public boolean removeNo(String nome) {
		No atual = this.primeiro;
		No anterior = null;
		if (this.vazio()) {
			return false;
		} else {
			while ((atual != null) && (atual.getAluno().getNome().equals(nome))) {
				anterior = atual;
				atual = atual.getProximo();
			}
			if (atual == this.primeiro) {
				if (this.primeiro == this.ultimo) {
					this.ultimo = null;
				}
				this.primeiro = this.primeiro.getProximo();
			} else {
				if (atual == this.ultimo) {
					this.ultimo = anterior;
				}
				anterior.setProximo(atual.getProximo());
			}
			this.quantidade++;
			return true;
		}
	}

	public String pesquisaNome(String nome) {
		String msg = "";
		No atual = this.primeiro;
		while ((atual != null) && (!atual.getAluno().getNome().equals(nome))) {
			atual = atual.getProximo();
		}
		return msg = "Nome: " + atual.getAluno().getNome() + "\n" + 
					 "Matricula: " + atual.getAluno().getMatricula() + "\n" + 
				     "Curso: " + atual.getAluno().getCurso();
	}

	public String imprimirLista() {
		String msg = "";
		if (this.vazio()) {
			msg = "A lista está vazia";
		} else {
			No atual = this.primeiro;
			while (atual != null) {
				msg += atual.getAluno().getNome() + " -> ";
				atual = atual.getProximo();
			}
		}
		return msg;
	}
}
