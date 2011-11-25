
public class Colecao implements ListaEncadeada{
	
	private Nodo cabe�a;
	private Nodo calda;
	
	public void add(Object o) {
		Nodo novo = new Nodo(o);
		if(cabe�a == null){
			cabe�a = novo;
			calda = cabe�a;
		}else{
			calda.setProximo(novo);
			calda = calda.getProximo();
		}
		
	}

	
	public Iterador getIterador() {
		return new ColecaoIterator(cabe�a);
	}
	

}
