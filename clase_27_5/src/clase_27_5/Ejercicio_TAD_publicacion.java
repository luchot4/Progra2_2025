package clase_27_5;

public class Ejercicio_TAD_publicacion {
	/*
	 * POSIBLES TADS
	 * -ORGANIZACON
	 * -LIBROS
	 * -REVISTAS
	 * -ARTICULO*/
	
	/*TAD ORGANIZACION
	 * --publicaciones : Map<String,Publicacion>
	 * --
	 * --Periodistas : Map<String, Periodista>
	 * -----OPERACIONES-----
	 * +crear()
	 * +listarEdiciones(int): List<String>
	 * +emitirListado() List<String>
	 * +listarArticulo(String dni) 
	 * -----TIENE-----
	 * -PERIODISTA
	 * -PUBLICACION
	 * */
	
	/*TAD PERIODISTA
	 * --String nombre;
	 * --String dni;
	 * -----OPERACIONES-----
	 * +Periodista()
	 * -----TIENE-----
	 * -ARTICULO*/
	
	/*TAD LIBRO
	 * --String titulo;
	 * --String genero
	 * --String codigo
	 * --Date fedicion
	 * --List<String>autores
	 * -----OPERACIONES-----
	 * +Libro()*/
	
	/*TAD REVISTA
	 * --String nombre;
	 * --String genero;
	 * --String formato;
	 * --String codigo;
	 * --String periocidad;
	 * --Map <int,Edicion>ediciones;
	 * -----OPERACIONES-----
	 * +Revista()
	 * +buscarArticulos(Periodista P) List<Articulo>*/
	
	/*TAD EDICION
	 * --Date fecha;
	 * --String tamanio;
	 * --double precio;
	 * --int codigo;
	 * --Map<Date,Aritculo>articulos;
	 * -----OPERACIONES-----
	 * +Edicion();
	 * +buscarArticulos(Preiodista p) : List<Articulo>;
	 * +toString();
	 * -----TIENE-----
	 * -ARTICULO*/
	
	/*TAD ARTICULO
	 * --String titulo;
	 * --String tema;
	 * --String autor;
	 * --Date fecha;
	 * --List<Periodista>periodistas;
	 * -----OPERACIONES-----
	 * +Articulo();
	 * +esParteDe(Periodista P)
	 * +toString();*/

	/*TAD PUBLICACION
	 * --String codigo
	 * --String genero;
	 * -----OPERACIONES-----
	 * +Publicacion()
	 * -----CLASES QUE HEREDAN DE PUBLICACION-----
	 * -LIBRO
	 * -REVISTA*/
}
