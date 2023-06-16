package sprintModulo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {
	private List<Asesoria> asesorias;
	private List<Capacitacion> capacitaciones;
	
	public Contenedor() {
		asesorias = new ArrayList<>();
		capacitaciones = new ArrayList<>();
	}
	
	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}
	
	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}
	
	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}
	
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}
	
	public void eliminarUsuario(String rutUsuario) {
		Iterator<Asesoria> iterator = asesorias.iterator();
	    while (iterator.hasNext()) {
	        Asesoria asesoria = iterator.next();
	        if (asesoria instanceof Usuario) {
	            Usuario usuario = (Usuario)asesoria;
	            if (usuario.getRun().equals(rutUsuario)) {
	                iterator.remove();
	            }
	        }
	    }
	}
	
	public void listarUsuarios() {
		for (Asesoria asesoria: asesorias) {
			Usuario usuario = (Usuario)asesoria;
			System.out.println("===================");			
			System.out.println("Nombre: " + usuario.getNombre());
			System.out.println("Fecha Nacimiento: " + usuario.getFechaNacimiento());
			System.out.println("Rut: " + usuario.getRun());
		}
	}
	
	public void listarUsuariosPorTipo(Usuario usuario) {
		usuario.analizarUsuario();		
	}
	
	
}
