package lista;

import java.util.Scanner;

public class Launch {

	public static char menu() {
		String msg;
		System.out.println("----------------------------------");
		System.out.println("          Escolha uma opção       ");
		System.out.println("----------------------------------");
		System.out.println("= 1. Inserir no ínicio           =");
		System.out.println("= 2. Inserir no final            =");
		System.out.println("= 3. Localizar aluno             =");
		System.out.println("= 4. Excluir aluno               =");
		System.out.println("= 5. Imprimir lista de alunos    =");
		System.out.println("= 6. Quantidade de alunos        =");
		System.out.println("= 7. Sair do programa            =");
		System.out.println("----------------------------------");
		msg = new Scanner(System.in).next();
		return msg.charAt(0);

	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ListaSimples lista = new ListaSimples();
		Aluno aluno;
		char opcao;

		do {

			opcao = menu();
			switch (opcao) {

			case '1':
				System.out.println("Inserindo no ínicio");
				aluno = new Aluno();
				System.out.println("Nome: ");
				aluno.setNome(ler.next());
				System.out.println("Matricula: ");
				aluno.setMatricula(ler.next());
				System.out.println("Curso: ");
				aluno.setCurso(ler.next());
				lista.inserirPrimeiro(aluno);
				break;

			case '2':
				System.out.println("Inserindo no final");
				aluno = new Aluno();
				System.out.println("Nome: ");
				aluno.setNome(ler.next());
				System.out.println("Matricula: ");
				aluno.setMatricula(ler.next());
				System.out.println("Curso: ");
				aluno.setCurso(ler.next());
				lista.inserirUltimo(aluno);
				break;

			case '3':
				if (lista.vazio()) {
					System.out.println("A lista está vazia");
				} else {
					System.out.println("Localizar aluno\nDigite o nome: ");
					String nome = ler.next();
					if (lista.pesquisaNome(nome) == null) {
						System.out.println("O aluno procurado não foi localizado!");
					} else {
						System.out.println("::::  Encontrado  ::::");
						System.out.println(lista.pesquisaNome(nome));
						System.out.println("::::::::::::::::::::::");
					}
				}
				break;

			case '4':
				if (lista.vazio()) {
					System.out.println("A lista está vazia");
				} else {
					System.out.println("Exclui aluno\nDigite o nome: ");
					String nome = ler.next();
					if (lista.removeNo(nome)) {
						System.out.println(nome + " foi removido com sucesso!");
					} else {
						System.out.println(nome + " não encontrado!");
					}
				}

				break;

			case '5':
				System.out.println("-------------------------------");
				System.out.println("Lista de alunos " + lista.imprimirLista());
				System.out.println("-------------------------------");
				break;

			case '6':
				System.out.println("A lista contém: " + lista.getQuantidade() + " aluno(s)");
				break;

			case '7':
				System.out.println("Encerrando o programa ");
				break;

			default:
				System.out.println("Opção inválida, tente novamente!");
			}
		} while (opcao != '7');
		System.exit(0);

	}

}
