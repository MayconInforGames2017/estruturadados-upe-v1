package fila;

import java.util.LinkedList;
import java.util.List;

public class Fila <S>{
	
	private List<S> obj = new LinkedList<S>();
	
	public void inserir(S s) {
		this.obj.add(s);
	}
	
	public S remove() {
		return this.obj.remove(0);
	}
	
	public boolean listaVazia() {
		return this.obj.size() == 0;
	}

}
