package matrices;

public class Main {
	public static void main(String[] args) {
		Integer [] lista1 = {9,10,11};
		Integer [] lista2 = {90,100,110};
		int [] lista3 = {24,11,30};
		int [] lista4 = {105,400,190};
		Integer[] ArregloA = {3,8,1,9,11};
		Integer[] ArregloB = {9,5,1,7,3};
		int[][] matriz = {
			    {9, 10,5},
			    {11, 1,9},
			    {3, 4,8}
			};
		int[][] matrizParcialTrue = {
				{5,9,6},
				{8,4,3},
				{2,2,6}
				};
		int[][] matrizParcialFalse={
				{4,1,7},
				{10,2,3},
				{1,5,3}
			};
		int[] arreglo= {2,4};
		int[] elemento= {};
		int[] arregloVacio= {};
		int[] ejSubconjunto = {1,2,3,4};
		int[] ejSubconjunto2 = {1,2,3,4};
		
		System.out.println(todosMayora8(lista1) && algunoMenora23(lista2));
		RecorridoMatrices.recorridoPorFilas(matriz);
		RecorridoMatrices.recorridoPorColumnas(matriz);
		System.out.println("Diagonal Superior");
		recorridoDiagonalSuperior(matriz);
		System.out.println("Diagonal Inferior");
		recorridoDiagonalInferior(matriz);
		System.out.println("Ejercicio: 1");
		System.out.println(algunoMayora10(lista3));
		System.out.println("Ejercicio: 2");
		System.out.println(multiplo5AlgunoMayor10(lista4));
		System.out.println("Ejercicio 3 de Algoritmos recursivos");
		System.out.println("ArregloA: " + Ejercicios_matrices.algunoPar(ArregloA));
		System.out.println("ArregloB: " + Ejercicios_matrices.algunoPar(ArregloB));
		System.out.println("Ej 3 obligatorio:");
		System.out.println(pertenecenTodos(elemento, arregloVacio));
		System.out.println(pertenecenTodos(ejSubconjunto, ejSubconjunto2));
		System.out.println("Ej 4 obligatorio");
		RecorridoMatrices.sumaElemMatriz(matriz);
		System.out.println("Punto 1 del parcial 2024-2do semestre: ");
		Ejercicios_matrices.arregloEnMatriz(matrizParcialTrue, arreglo);
		Ejercicios_matrices.arregloEnMatriz(matrizParcialFalse, arreglo);
	}

//	public static void recorridoPorColumnas(int[][] mat) {
//		for(int c = 0; c < mat[0].length; c++) {
//			System.out.println("|");
//			for(int f = 0; f < mat.length; f++) {
//				System.out.println(mat[f][c] + " | ");
//			}
//		}
//		System.out.println();
//	}
	public static void recorridoDiagonalSuperior(int[][] mat){
		for(int i = 0; i< mat.length; i++) {
			System.out.println(mat[i][i]);
		}
	}
	public static void recorridoDiagonalInferior(int[][] mat) {
	
	for (int i = 0; i < mat.length; i++) {
		int j = mat.length - 1 - i;
		System.out.println(mat[i][j]);
	}
}
	static public boolean todosMayora8(Integer [] lista) {
		boolean ret = true;
		for(int i = 0; i < lista.length; i++) {
			ret = ret && lista[i] > 8;
		}
		return ret;
	}
	
	static public boolean algunoMenora23(Integer [] lista) {
		boolean ret = false;
		for(int i = 0; i < lista.length; i++) {
			ret = ret || lista[i] < 23;
		}
		return ret;
	}
	/*EJERCICIOS OBLIGATORIOS*/
	/*1) Implementar con acumuladores booleanos una función booleana “mayor10” que recibe una
	lista de números enteros, y devuelve True si todos los elementos son mayores a 10.*/
	static public boolean algunoMayora10(int[] lista) {
		boolean ret= true;
		for(int i = 0; i < lista.length;i++) {
			ret=ret && lista[i]>10; 
		}
		return ret;
	}
	/*2) Implementar con acumuladores booleanos una función booleana “multiplo5AlgunoMayor100”
	que recibe una lista de números enteros, y devuelve True si todos los elementos son múltiplo
	de 5 y alguno de ellos es mayor a 100.
	*/
	static public boolean multiplo5AlgunoMayor10(int [] lista) {
		boolean todosMultiplo5= true;
		boolean algunoMayor100 = false;
		for(int i = 0; i < lista.length;i++) {
			if(lista[i] % 5 != 0) {
				todosMultiplo5 = false;
			}
			if(lista[i] > 100) {
				algunoMayor100 = true;
			}
			todosMultiplo5 &= algunoMayor100;

		}
		return todosMultiplo5;
	}
	/*3) Implementar una función que determine si un arreglo es subconjunto de otro:*/
	static public boolean pertenecenTodos(int[]elems, int[]arreglo){
		   if (elems.length == 0){
	            return true;
	        }
	        if(arreglo.length == 0){
	            return false;
	        }

		boolean pertenecenTodos = true; 
		for(int i = 0; i < elems.length; i++) {
			boolean pertenece = false;
			for(int j = 0; j<arreglo.length; j++) {
				pertenece = pertenece || elems[i] == arreglo[j];
			}
			pertenecenTodos = pertenece;
		}
		return pertenecenTodos;
	}
	
}

