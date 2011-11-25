
public class ColecaoIterator implements Iterador{

	private Nodo aux;
	private Nodo cabe�a;
	
	public ColecaoIterator(Nodo o){
		this.cabe�a = o;
		aux = cabe�a;
	}
	
	
	public boolean temProximo() {
		return !(aux.getProximo() == null);
		
	}

	
	public Object proximo() {
		aux = aux.getProximo();
		return aux.getObjeto();
		
	}
	
	

}
