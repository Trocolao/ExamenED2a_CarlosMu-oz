package examen;
/**
 * 
 * Clase que nos crea un objeto fecha
 * @author daw113
 *@version 1.0
 */

public class Fecha {
	public static boolean fechaValida;//variable booleana fecha valida
	
/**
 * Método que nos indica si una fecha es válida o no
 * @param anio
 * @param mes
 * @param dia
 * @return un booleano que será verdadero o falso según la fecha sea válida
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
	public static int suma(int a,int b) {
		int c=a+b;
		return c;
	}
}