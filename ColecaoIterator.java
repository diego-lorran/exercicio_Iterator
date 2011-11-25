
public class ColecaoIterator implements Iterador{

	private Nodo aux;
	private Nodo cabeça;
	
	public ColecaoIterator(Nodo o){
		this.cabeça = o;
		aux = cabeça;
	}
	
	
	public boolean temProximo() {
		return !(aux.getProximo() == null);
		
	}

	
	public Object proximo() {
		aux = aux.getProximo();
		return aux.getObjeto();
		
	}
	
	

}
