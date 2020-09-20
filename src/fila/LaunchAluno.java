package fila;

public class LaunchAluno {

	public static void main(String[] args) {
		Fila<Aluno> fila = new Fila<Aluno>();

		Aluno a = new Aluno();
		fila.inserir(a);

		Aluno excluirAluno = fila.remove();

		if (fila.listaVazia()) {
			System.out.println("A fila está vazia");
		}

		Fila<String> filaString = new Fila<String>();
		filaString.inserir("Maycon");
		filaString.inserir("Santana");

		String maycon = filaString.remove();
		String santana = filaString.remove();

		System.out.println(maycon);
		System.out.println(santana);

	}

}
