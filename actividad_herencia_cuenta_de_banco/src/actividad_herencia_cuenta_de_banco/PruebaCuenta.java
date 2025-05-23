package actividad_herencia_cuenta_de_banco;
import java.util.*;
/**
* Esta clase prueba diferentes acciones realizadas por cuentas bancarias
* de tipo Cuenta de ahorros y Cuenta corriente
* @version 1.2/2020
*/
public class PruebaCuenta {
	/**
	* Método main que crea una cuenta de ahorros con un saldo inicial
	* y una tasa de interés solicitados por teclado, a la cual se realiza una
	* consignación y un retiro, y luego se le genera el extracto mensual
	*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Cuenta de Ahorrors");
		System.out.println("Ingrese su saldo inicial= $");
		float saldoInicialAhorros = input.nextFloat();
		System.out.println("Ingrese tasa de Interes= ");
		float tasaAhorros = input.nextFloat();
		CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
		System.out.println("Ingresar cantidad a consignar");
		float cantidadDepositar = input.nextFloat();
		cuenta1.consignar(cantidadDepositar);
		System.out.println("Ingresar cantidad a retirar");
		float cantidadRetirar = input.nextFloat();
		cuenta1.retirar(cantidadRetirar);
		cuenta1.extractoMensual();
		cuenta1.imprimir();
	}
}
