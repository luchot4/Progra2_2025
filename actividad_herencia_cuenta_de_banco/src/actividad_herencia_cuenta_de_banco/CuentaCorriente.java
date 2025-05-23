package actividad_herencia_cuenta_de_banco;

/**
* Esta clase denominada CuentaCorriente modela una cuenta bancaria
* que es una subclase de Cuenta. Tiene un nuevo atributo: sobregiro.
* @version 1.2/2020
*/
public class CuentaCorriente extends Cuenta{
	/* Atributo que define un sobregiro de la cuenta que surge cuando el
	saldo de la cuenta es negativo */
	float sobregiro;
	/**
	* Constructor de la clase CuentaCorrienta
	* @param saldo Parámetro que define el saldo de la cuenta corriente
	* @param tasa Parámetro que define la tasa anual de interés de la
	* cuenta corriente
	*/
	public CuentaCorriente(float saldo, float tasa) {
		super(saldo,tasa); /*Invoca a constructor de la clase padre*/
		sobregiro=0; /*Inicialmente no hay sobregiro*/
	}
	
	/**
	* Método que recibe una cantidad de dinero a retirar y actualiza el
	* saldo de la cuenta
	* @param cantidad Parámetro que define la cantidad de dinero a
	* retirar de la cuenta corriente
	*/
	public void retirar(float cantidad) {
		float resultado = saldo - cantidad; /*Se calcula un saldo temporal */
		/* Si el valor a retirar supera el saldo de la cuenta, el valor
		excedente se convierte en sobregiro y el saldo es cero */
		if(resultado < 0) {
			sobregiro-= resultado;
			saldo = 0;
		}else {
			super.retirar(cantidad); /*Si no hay sobregiro, se realiza un retiro normal*/
		}
	}
	/**
	* Método que recibe una cantidad de dinero a consignar y actualiza
	* el saldo de la cuenta
	* @param cantidad Parámetro que define la cantidad de dinero a
	* consignar en la cuenta corriente
	*/
	public void consignar(float cantidad) {
		float residuo = sobregiro - cantidad;
		/*Si hay sobregiro, la cantidad consignada se resta al sobregiro*/
		if(sobregiro > 0) {
			if(residuo > 0) { /*Si el residuo es mayor que cero, se libera el sobregiro*/ 
				sobregiro = 0;
				saldo = residuo;
			}else { /*Si el residuo es menor que cero, el saldo es cero y surge un sobregiro*/
				sobregiro = -residuo;
				saldo = 0;
			}
		}else {
			super.consignar(cantidad); /*Si no hay sobregiro, se realiza una consignacion normal*/
		}
	}
	/*Metodo que genera el extracto mensual de la cuenta*/
	public void extractoMensual() {
		super.extractoMensual(); /*Invoca al metodo de la clase padre*/
	}
	/*Metodo que muestra en pantalla los datos de una cuenta corriente*/
	public void imprimir() {
		System.out.println("Saldo = $" + saldo);
		System.out.println("Cargo Mensual = $" + comisionMensual);
		System.out.println("Numero de Transacciones = " + (numeroConsignaciones + numeroRetiros));
		System.out.println();
	}
}
