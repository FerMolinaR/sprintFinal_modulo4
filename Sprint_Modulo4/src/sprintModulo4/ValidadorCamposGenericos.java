package sprintModulo4;

public class ValidadorCamposGenericos {
	public static boolean estaVacio(String campo) {		
		boolean estaVacio = true;
		if (campo != null) {
			estaVacio = campo.isBlank();		
		}
		return estaVacio;		
	}
	
	public static boolean validarLongitudCampo(String campo, int min, int max) {
		boolean esValido = false;
		if(!estaVacio(campo)) {
			campo = campo.trim();
			esValido = (campo.length() > max || campo.length() < min) ? false : true;				
		}				
		return esValido;
	}

	



}
