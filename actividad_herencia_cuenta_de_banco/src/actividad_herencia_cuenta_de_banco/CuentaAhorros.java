package actividad_herencia_cuenta_de_banco;
/**
* Esta clase denominada CuentaAhorros modela una cuenta de ahorros
* que es una subclase de Cuenta. Tiene un nuevo atributo: activa.
*/
public class CuentaAhorros extends Cuenta{
	/*Atributo que identifica si una cuenta esta activa; si lo está su saldo es superior a 1000 */
	private boolean activa;
	
	/**
	* Constructor de la clase CuentaAhorros
	* @param saldo Parámetro que define el saldo de la cuenta de ahorros
	* @param tasa Parámetro que define la tasa anual de interés de la
	* cuenta de ahorros
	*/
	public CuentaAhorros(float saldo, float tasa) {
		super(saldo,tasa);
		if(saldo < 1000) { /*Si el saldo es menor a 1000, la cuenta no se activa*/
			activa = false;
		}else {
			activa=true;
		}
	}
	
	/**
	* Método que recibe una cantidad de dinero a retirar y actualiza el
	* saldo de la cuenta
	* @param saldo Parámetro que define la cantidad a retirar de una
	* cuenta de ahorros
	*/
	
	public void retirar(float cantidad) {
		if(activa) {  /*Si la cuenta esta activa se puede retirar dinero*/
			super.retirar(cantidad); /*Invoca al metodo retirar de la clase padre*/
		}
	}
	/**
	* Método que recibe una cantidad de dinero a consignar y actualiza
	* el saldo de la cuenta
	* @param saldo Parámetro que define la cantidad a consignar en
	* una cuenta de ahorros
	*/
	public void consignar(float cantidad) {
		if(activa) { /*Si la cuenta esta activa, se puede consignar dinero*/
			super.consignar(cantidad); /*Invoca al metodo consignar de la clase padre */
		}
	}
	
	/*Metodo que genera el extracto mensual de una cuenta de ahorros*/
	public void extractoMensual() {
		/*Si la cantidad de retiros es superior a cuatro, se genera una comision mensual*/
		if(numeroRetiros > 4) {
			comisionMensual += (numeroRetiros - 4) * 1000; 
		}
		super.extractoMensual(); /*Invoca al metodo de la clase padre*/
		/*Si el saldo actualizado de la cuenta es menor a 1000, la cuenta no se activa*/
		if(saldo < 1000) {
			activa = false;
		}
	}
	
	/*Metodo que imprime en pantalla los datos de una cuenta de ahorros*/
	public void imprimir() {
		System.out.println("Saldo = $" + saldo);
		System.out.println("Comision Mensual = $" + comisionMensual);
		System.out.println("Numero de Transacciones = " + (numeroConsignaciones + numeroRetiros));
		System.out.println();
	}
}
