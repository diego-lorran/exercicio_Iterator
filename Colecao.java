
public class Colecao implements ListaEncadeada{
	
	private Nodo cabeça;
	private Nodo calda;
	
	public void add(Object o) {
		Nodo novo = new Nodo(o);
		if(cabeça == null){
			cabeça = novo;
			calda = cabeça;
		}else{
			calda.setProximo(novo);
			calda = calda.getProximo();
		}
		
	}

	
	public Iterador getIterador() {
		return new ColecaoIterator(cabeça);
	}
	

}
