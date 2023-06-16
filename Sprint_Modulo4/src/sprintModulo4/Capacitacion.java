package sprintModulo4;

import java.time.LocalTime;

public class Capacitacion {
	private int idCapacitacion;
	private String rutClienteCapacitacion;
	private DiaSemana diaCapacitacion;
	private LocalTime horaCapacitacion;
	private String lugarCapacitacion;
	private int duracionCapacitacion;
	private int asistentesCapacitacion;
	private Cliente clienteCapacitacion;
	
	public Capacitacion() {}

	public Capacitacion(int idCapacitacion, String rutClienteCapacitacion, DiaSemana diaCapacitacion,
			LocalTime horaCapacitacion, String lugarCapacitacion, int duracionCapacitacion, int asistentesCapacitacion,
			Cliente clienteCapacitacion) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutClienteCapacitacion = rutClienteCapacitacion;
		this.diaCapacitacion = diaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.lugarCapacitacion = lugarCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.asistentesCapacitacion = asistentesCapacitacion;
		this.clienteCapacitacion = clienteCapacitacion;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getRutClienteCapacitacion() {
		return rutClienteCapacitacion;
	}

	public void setRutClienteCapacitacion(String rutClienteCapacitacion) {
		this.rutClienteCapacitacion = rutClienteCapacitacion;
	}

	public DiaSemana getDiaCapacitacion() {
		return diaCapacitacion;
	}

	public void setDiaCapacitacion(DiaSemana diaCapacitacion) {
		this.diaCapacitacion = diaCapacitacion;
	}

	public LocalTime getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(LocalTime horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}

	public void setLugarCapacitacion(String lugarCapacitacion) {
		this.lugarCapacitacion = lugarCapacitacion;
	}

	public int getDuracionCapacitacion() {
		return duracionCapacitacion;
	}

	public void setDuracionCapacitacion(int duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion;
	}

	public int getasistentesCapacitacion() {
		return asistentesCapacitacion;
	}

	public void setasistentesCapacitacion(int asistentesCapacitacion) {
		asistentesCapacitacion = asistentesCapacitacion;
	}

	public Cliente getClienteCapacitacion() {
		return clienteCapacitacion;
	}

	public void setClienteCapacitacion(Cliente clienteCapacitacion) {
		this.clienteCapacitacion = clienteCapacitacion;
	}
	
	public boolean validarLugar(String lugar) {
		return ValidadorCamposGenericos.validarLongitudCampo(lugar, 10, 50);
	}
	
	public boolean validarOrigen(String origen) {
		return ValidadorCamposGenericos.validarLongitudCampo(origen, 0, 100);
	}
	
	public boolean validarConsecuencias(String consecuencias) {
		return ValidadorCamposGenericos.validarLongitudCampo(consecuencias, 0, 100);
	}
	
	public String mostrarDetalle() {
		return String.format("La capacitación será en %s a las %s del día %s, y durará %s minutos",
				this.lugarCapacitacion, FormateadorDatos.desplegarHoraFormateada(horaCapacitacion),
				this.diaCapacitacion, this.duracionCapacitacion);
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutClienteCapacitacion=" + rutClienteCapacitacion
				+ ", diaCapacitacion=" + diaCapacitacion + ", horaCapacitacion=" + horaCapacitacion
				+ ", lugarCapacitacion=" + lugarCapacitacion + ", duracionCapacitacion=" + duracionCapacitacion
				+ ", asistentesCapacitacion=" + asistentesCapacitacion + ", clienteCapacitacion=" + clienteCapacitacion
				+ "]";
	}
	
	
}
