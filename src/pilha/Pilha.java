package pilha;

public class Pilha {

	int topo;
	int elementos[];

	public Pilha() {
		elementos = new int[10];
		topo = -1; // posi��o inv�lida do vetor
	}

	public void push(int e) {
		if (isFull()) {
			throw new RuntimeException("A pilha est� cheia!");
		}
		topo++;
		elementos[topo] = e;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("A pilha vazia!");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}

	public boolean isEmpty() {
		return (topo == -1);
	}

	public boolean isFull() {
		return (topo == elementos.length-1);
	}

	public int top() {
		if (isEmpty()) {
			throw new RuntimeException("A pilha est� vazia!");
		}
		return elementos[topo];
	}
}
