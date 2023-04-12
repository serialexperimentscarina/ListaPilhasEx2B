package br.com.serialexperimentscarina.pilhastrings;

public class PilhaStrings {
	
	No topo;
	
	public PilhaStrings() {
		topo = null;
	}
	
	public boolean isEmpty() {
		return (topo == null);
	}
	
	public void push(String string) {
		No elemento = new No();
		elemento.string = string;
		elemento.proximo = null;
		if (!isEmpty()) {
			elemento.proximo = topo;
		}
		topo = elemento;
	}
	
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia!");
		}
		String string = topo.string;
		topo = topo.proximo;
		return string;
	}
	
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia!");
		}
		String string = topo.string;
		return string;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

}
