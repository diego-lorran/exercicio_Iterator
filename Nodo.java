
public class Nodo {
	
	private Object ob;
	private Nodo proximo;
	
	public Nodo(Object o) {
		this.ob = o;
		this.proximo = null;
	}

	public void setProximo(Nodo novo) {
		this.proximo = novo;
		
	}

	public Nodo getProximo() {
		return this.proximo;
	}
	
	public void setObjeto(Object o){
		this.ob = o;
	}
	
	public Object getObjeto(){
		return this.ob;
	}

}
