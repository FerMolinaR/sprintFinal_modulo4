package sprintModulo4;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Usuario implements Asesoria{
	private String nombre;
	private LocalDate fechaNacimiento;
	private String run;
	
	public Usuario() {}

	public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}
	
	
	
	public void mostrarEdad() {		
		Period edadUsuario = Period.between(fechaNacimiento, LocalDate.now());			
		System.out.println((fechaNacimiento != null) ? "El usuario tiene " + edadUsuario.getYears() + " años"
				: "No se ha registrado una fecha de nacimiento valida");		
	}
	
		
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre: " + this.nombre + "\n" + "Rut: " + this.run);
	}	

		
	
	public boolean validarNombre(String nombre) {
		return ValidadorCamposGenericos.validarLongitudCampo(nombre, 5, 50);
	}	
	

	public boolean validarRut(String run) {
		boolean esValido = false;
		if (!ValidadorCamposGenericos.estaVacio(run)) {
			Pattern patron = Pattern.compile("^\\d{7,8}-[0-9Kk]$");
			Matcher matcher = patron.matcher(run);
			if (matcher.matches()) {
				String[] rutDividido = run.split("-");
				int rutNumerico = Integer.parseInt(rutDividido[0]);
				esValido = (rutNumerico > 999999) ? true : false;
			}
		}
		return esValido;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	
	
	
}
