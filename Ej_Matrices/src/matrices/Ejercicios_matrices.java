package matrices;

public class Ejercicios_matrices {
	
//	public static void recorridoPorFilas(int [][] matriz) {
//		for(int f = 0; f < matriz.length; f++) {
//			System.out.println("| ");
//			for(int c = 0; c < matriz[0].length; c++) {
//				System.out.println(matriz[f][c] + " | ");
//			}
//			System.out.println();
//		}
//	}
	//Ahora, además de decir si la lista es par o no lo es, también queremos dejar siempre la lista con
	//todos sus elementos multiplicados por 2.

	public static boolean esPar(int[] datos) {
		boolean ret = true; // Notar que el acumulador inicia en true
		for (int i=0; i < datos.length; i++){
		ret = ret && par(datos[i]);
		datos[i] = datos[i] * 2;}
		return ret;
	}
	
private static boolean par(int i) {
		return i % 2 == 0;
		
	}
//	Queremos ver si algún número de una lista es par.
//	- Arreglo A: [3 8 1 9 11] retorna true
//	- Arreglo B: [9 5 1 7 3] retorna false
	public static boolean algunoPar(Integer[] lista) {
		boolean posiblePar = false;
		for(int i = 0; i < lista.length; i++) {
			posiblePar = posiblePar || lista[i] % 2 == 0;
		}
		return posiblePar;
	}
	//Resolucion Parcial 2024 2do semestre
	static boolean arregloEnMatriz(int[][] matriz, int[] arreglo) {
		boolean arregloEnColumna = false;
		if(matriz.length == 0 || arreglo.length== 0 || matriz.length!= matriz[0].length) {
			return false;
		}
		//Saber si el array estra en alguna columna
		for(int c = 0; c < matriz[0].length; c++) {
			boolean estanTodosEnCol = true;
			for(int i = 0; i < arreglo.length; i++) {
				boolean elemEsta = false;
				for(int f = 0; f < matriz.length; f++) {
					elemEsta |= matriz[f][c] == arreglo[i];
				}
				estanTodosEnCol &= elemEsta;
			}
			arregloEnColumna |= estanTodosEnCol;
		}
		// Saber promedio de diagonal
		int[] diagonal = matDiagonalPrincipal(matriz);
		int promedio = promedio(diagonal);
		
		//Saber la suma de las filas para calcular el modulo de promedio
		boolean sumFilaMultDeN = sumaFilaMultDeN(matriz,promedio);
		
		arregloEnColumna&=sumFilaMultDeN;
		
		return arregloEnColumna;
	}
	//Funciones auxiliares
	public static int promedio(int[] arr) {
		int suma = 0;
		int cont = 0;
		for(int i = 0; i < arr.length; i++) {
			suma += arr[i];
			cont++;
		}
		return suma/cont;
	}
	public static boolean sumaFilaMultDeN(int[][] mat, int n) {
		int suma = 0;
		boolean seCumple = true;
		for(int f = 0; f < mat.length; f++) {
			for(int c = 0; c < mat[f].length; c++) {
				suma+=mat[f][c];
			}
			seCumple &= esMultiplo(suma,n) ;
		}
		return seCumple;
	}
	public static boolean esMultiplo(int n, int m) {
		return n%m==0;
	}
	public static int[] matDiagonalPrincipal(int[][] mat) {
		int[] diagonal = new int[mat.length];
		for(int f = 0; f < mat.length; f++) {
			diagonal[f] =  mat[f][f];
		}
		return diagonal;
	}
	
	public void recorrerDiagonalPrincipal(int[][] mat) {
		for(int i = 0; i< mat.length;i++) {
			System.out.println(mat[i][i]);
		}
	}
}	
