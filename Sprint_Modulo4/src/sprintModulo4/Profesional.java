package sprintModulo4;

import java.time.LocalDate;

public class Profesional extends Usuario{
	private String titulo;
	private LocalDate fechaIngreso;
	
	public Profesional() {}

	public Profesional(String titulo, LocalDate fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	

	public boolean validarTitulo(String titulo) {
		return ValidadorCamposGenericos.validarLongitudCampo(titulo, 10, 50);		
	}
	
	

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Fecha ingreso: " + FormateadorDatos.desplegarFechaFormateada(this.fechaIngreso));
		
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
}
