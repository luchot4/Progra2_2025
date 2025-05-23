package arboles;

public class Principal {

	public static void main(String[] args) {
		AB<String> abs = crearABS();
		System.out.println("  cantElems (7): " + abs.cantElementos());
		System.out.println("     Altura (4): " + abs.altura());
		System.out.println("pertenece D (T): " + abs.pertenece("D"));
		System.out.println("balanceado? (F): " + abs.estaBalanceado());
		System.out.println("      toString : " + abs);
		abs.quitar("A");
		abs.quitar("G");
		System.out.println("      toString : " + abs);
	}

	private static AB<String> crearABS() {
		AB<String> ab = new AB<>();
		AB<String>.Nodo nA = ab.crearNodo("A");
		AB<String>.Nodo nB = ab.crearNodo("B");
		AB<String>.Nodo nC = ab.crearNodo("C");
		AB<String>.Nodo nD = ab.crearNodo("D");
		AB<String>.Nodo nE = ab.crearNodo("E");
		AB<String>.Nodo nF = ab.crearNodo("F");
		AB<String>.Nodo nG = ab.crearNodo("G");
		nA.izq = nB;
		nA.der = nC;
		nB.izq = nD;
		nB.der = nE;
		nC.der = nF;
		nF.izq = nG;
		
		ab.raiz = nA;
		
		//      A
		//    /   \
		//   B     C
		//  / \     \
		// D   E     F    
		//          /
		//         G
		//
		return ab;
	}

}
