package clase_27_5;

public class ABB <T extends Comparable<T>> extends AB<T>{
	/*- internosMenorIgual(17) debería retornar “{ 3 11 15 }”
	  - internosMenorIgual(11) debería retornar “{ 3 11 }”
	  - internosMenorIgual(2) debería retornar “{ }”*/


	String internosMenorIgual(T elem) {
		return "{" + internosMI(raiz,elem) + "}";
	}

	String internosMI(Nodo<T> nodo, T elem) {
		if(nodo == null ) {
			return " ";
		}
		if(nodo.izq == null && nodo.der == null) {
			return "";
		}
		if(nodo.elem.compareTo(elem) > 0) {
			return internosMI(nodo.der,elem);
		}
		return internosMI(nodo.izq, elem) + nodo.elem + " " + 
		internosMI(nodo.der, elem);
	}
	public void insertar(T dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return;
        }
        insertarRecursivo(raiz, dato);
    }

    private void insertarRecursivo(Nodo actual, T dato) {
        if (dato.compareTo(actual.dato) < 0) { // Dato es menor, ir a la izquierda
            if (actual.izq == null) {
                actual.izq = new Nodo(dato);
                return;
            }
            insertarRecursivo(actual.izq, dato);
        } else if (dato.compareTo(actual.dato) > 0) { // Dato es mayor, ir a la derecha
            if (actual.der == null) {
                actual.der = new Nodo(dato);
                return;
            }
            insertarRecursivo(actual.der, dato);
        } else {
            // Dato ya existe, no insertamos (opcional, puede que quieras manejar el caso)
        }
    }
}
