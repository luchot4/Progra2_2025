package matrices;

public class RecorridoMatrices {
	//4) Implementar una clase en Java que tenga métodos estáticos que reciban una matriz por
	//	parámetro y muestre los elementos de la matriz por filas y otro que los muestre por columnas,
	//	y un tercer método que sume todos sus elementos.
	static public void recorridoPorFilas(int[][] matriz) {
		for(int f = 0; f < matriz.length; f++) {
			System.out.println(" | ");
			for(int c = 0; c < matriz[0].length; c++) {
				System.out.println(matriz[f][c] + " | ");
			}
		}
		System.out.println();
	}
	static public void recorridoPorColumnas(int[][] matriz) {
		for(int c = 0; c < matriz[0].length; c++) {
			System.out.println(" | ");
			for(int f = 0; f < matriz.length; f++) {
				System.out.println(matriz[f][c] + " | ");
			}
		}
		System.out.println();
	}
	static int sumaElemMatriz(int[][] matriz) {
		int suma = 0;
		for(int f = 0; f < matriz.length; f++) {
			for(int c = 0; c < matriz[0].length; c++) {
				suma += matriz[f][c];
			}
		}
		return suma;
	}
}
