package sprintModulo4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
		LocalDate fechaDate = LocalDate.of(1990, 6, 21);
		
		FormateadorDatos.desplegarFechaFormateada(fechaDate);
		
		Capacitacion capacitacion = new Capacitacion();
		capacitacion.setDiaCapacitacion(DiaSemana.LUNES);
		capacitacion.setHoraCapacitacion(LocalTime.of(18, 20));
		capacitacion.setLugarCapacitacion("coquimbo");
		capacitacion.setDuracionCapacitacion(30);
		
		System.out.println(capacitacion.mostrarDetalle());
		
		Profesional profesional = new Profesional();
		profesional.setFechaIngreso(LocalDate.of(1990, 2, 5));	
		profesional.setFechaNacimiento(LocalDate.of(1990, 2, 5));
		
		Contenedor contenedor = new Contenedor();
		contenedor.almacenarProfesional(profesional);
		contenedor.almacenarAdministrativo(new Administrativo());
		contenedor.listarUsuarios();
		
		contenedor.listarUsuariosPorTipo(profesional);
		
	}

}
