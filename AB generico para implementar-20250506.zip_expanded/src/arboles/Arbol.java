package arb;

public class Arbol <T extends Comparable<T>> extends AB<T> {
	
//	private Nodo raiz;
	
	//Hola lucho, soy emojin. AS:D:ASD:AD:SA

	//-----------------------------------------
	
	@Override
	public void agregar(T elem) {      // 4to
		if(elem == null) {
			throw new IllegalArgumentException("elemento nulo");
		}
		
		if(this.raiz == null) {
			this.raiz = crearNodo(elem);}
		
		raiz = agregarRecursivo(raiz, elem);
	}
	
	//Agregar recursivo
	private Nodo agregarRecursivo(Nodo raiz , T elemento) {
		if(raiz == null) {
			raiz = crearNodo(elemento);
			return raiz;
		}
		
		System.out.print("\n FUNCION AGREGAR raiz : " + raiz.elem + " Elemento : " + elemento);
		
		
		if(elemento.compareTo(raiz.elem) == 0) {
			System.out.print(" | Son iguales.");
			raiz.elem = elemento;
		}
		
		if(elemento.compareTo(raiz.elem) < 0 ) {
			System.out.print(" | raiz es mayor a elemento.");
			raiz.izq = agregarRecursivo(raiz.izq, elemento);
		}
		
		if(elemento.compareTo(raiz.elem) > 0 ) {
			System.out.print(" | raiz es menor a elemento.");
			raiz.der = agregarRecursivo(raiz.der, elemento);
		}
		
		return raiz;
	}
	
	//-----------------------------------------
	
	@Override
	public boolean pertenece(T elem) {
		
		if(perteneceRecursivo(raiz, elem) == true) {
			System.out.println("\n \n  SI ENCONTRASTE EL COSO");
			return true;
		}else {System.out.println("\n \n NO :( ENCONTRASTE EL COSO");
		return true;}
		
	}
	
	private boolean perteneceRecursivo(Nodo raiz , T elemento) {
		if(raiz == null) {
			return false;
		}
		
		System.out.print("\n \n FUNCION PERTENECE raiz : " + raiz.elem + " Elemento : " + elemento);
		
		
		if(elemento.compareTo(raiz.elem) == 0) {
			System.out.print(" | Son iguales.");
			return true;
		}
		
		if(elemento.compareTo(raiz.elem) < 0 ) {
			System.out.print(" | raiz es mayor a elemento.");
			return perteneceRecursivo(raiz.izq, elemento);
		}
		
		if(elemento.compareTo(raiz.elem) > 0 ) {
			System.out.print(" | raiz es menor a elemento.");
			return perteneceRecursivo(raiz.der, elemento);
		}
		
		return false;
	}
	

//	@Override
//	public String toString() {
//		StringBuilder datos = new StringBuilder();		
//	}
	
		
		
		
	
	
}
