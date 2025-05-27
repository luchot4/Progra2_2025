package clase_27_5;

public class AB<T> { // Arbol binario Genérico

	protected Nodo raiz;
	
	class Nodo { // Clase iterna
		T elem;
		Nodo izq, der;
		
		Nodo(T elem) {
			this.elem = elem;
		}
	}
	
	public void agregar(T elem) {      // 4to
		raiz = agregar(raiz, elem);
	}
	private Nodo agregar(Nodo nodo, T elem) {
		if(nodo == null) 
			return  new Nodo(elem);
		
		if(nodo.izq==null)
			nodo.izq = agregar(nodo.izq, elem);
		else
			nodo.der = agregar(nodo.der, elem);
		return nodo;
	}
	
	public boolean pertenece(T elem) { // 2do
		return pertenece(raiz,elem);
	}
	
	private boolean pertenece(Nodo nodo, T elem) {
		if(nodo==null)  /*Caso base 1: no lo encontre*/ 
			return false;
		
		if(nodo.elem==elem)  /*Caso base 2: si lo encontre*/
			return true;
		
		return pertenece(nodo.izq, elem) ||	
				pertenece(nodo.der, elem);
	}
	public void quitar(T elem) {       // 5to
		throw new RuntimeException("Implementame Ultimo !!!");
	}
	
	public int cantElementos() {       // 1ro
		return cantElementos(raiz);
	}
	private int cantElementos(Nodo nodo) {
		if(nodo == null) 	/*Caso base: no tengo elementos*/
			return 0;
		
		return 1 
				+ cantElementos(nodo.izq)
				+ cantElementos(nodo.der);
	}
	
	public int altura() {              // 3ro
		return altura(raiz);
	}
	private int altura(Nodo nodo) {
		if(nodo==null)
			return 0;
		return 1 + max(altura(nodo.izq), altura(nodo.der));
//		int alturaDer = altura(nodo.der);
//		itn alturaIzq = altura(nodo.izq);
//		
//		if(alturaDer > alturaIzq)
//			return 1 + alturaDer;
//		
//		return 1 + alturaIzq;
	}
	private int max( int a, int b) {
		if(a>b)
			return a;
		return b;
	}
	
	public boolean estaBalanceado() {
		throw new RuntimeException("Implementame Bonus track!!!");
	}
	
	public boolean estaCompleto() {
		throw new RuntimeException("Implementame modo hardcore!!!");
	}
	
	// suponiendo que es árbol de enteros. max y min
	public int minimo() {              // EASY
		throw new RuntimeException("Implementame modo easy!!!");
	}
	public int maximo() {              // EASY
		throw new RuntimeException("Implementame modo easy!!!");
	}
	
	@Override
	public String toString() {
		return "IMPLEMENTAME CON SABIDURIA!!!";
	}
	
	/**
	 * Este metodo existe solo para poder crear estructuras de 
	 * arbol a medida y así poder probar algunas acciones
	 * 
	 * @param elem
	 * @return
	 */
	Nodo crearNodo(T elem) {
		return new Nodo(elem);
	}
}
