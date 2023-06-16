package sprintModulo4;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {
	private int idVisita;
	private String rutClienteVisita;
	private LocalDate fechaVisita;
	private LocalTime horaVisita;
	private String lugarVisita;
	private String comentariosVisita;
	private Cliente clienteVisita;
	
	public VisitaTerreno() {}

	public VisitaTerreno(int idVisita, String rutClienteVisita, LocalDate fechaVisita, LocalTime horaVisita,
			String lugarVisita, String comentariosVisita, Cliente clienteVisita) {
		super();
		this.idVisita = idVisita;
		this.rutClienteVisita = rutClienteVisita;
		this.fechaVisita = fechaVisita;
		this.horaVisita = horaVisita;
		this.lugarVisita = lugarVisita;
		this.comentariosVisita = comentariosVisita;
		this.clienteVisita = clienteVisita;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getRutClienteVisita() {
		return rutClienteVisita;
	}

	public void setRutClienteVisita(String rutClienteVisita) {
		this.rutClienteVisita = rutClienteVisita;
	}

	public LocalDate getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public LocalTime getHoraVisita() {
		return horaVisita;
	}

	public void setHoraVisita(LocalTime horaVisita) {
		this.horaVisita = horaVisita;
	}

	public String getLugarVisita() {
		return lugarVisita;
	}

	public void setLugarVisita(String lugarVisita) {
		this.lugarVisita = lugarVisita;
	}

	public String getComentariosVisita() {
		return comentariosVisita;
	}

	public void setComentariosVisita(String comentariosVisita) {
		this.comentariosVisita = comentariosVisita;
	}

	public Cliente getClienteVisita() {
		return clienteVisita;
	}

	public void setClienteVisita(Cliente clienteVisita) {
		this.clienteVisita = clienteVisita;
	}
	
	public boolean validarLugar(String lugar) {
		return ValidadorCamposGenericos.validarLongitudCampo(lugar, 10, 50);
	}
	
	public boolean validarComentarios(String comentarios) {
		return ValidadorCamposGenericos.validarLongitudCampo(comentarios, 0, 100);
	}

	@Override
	public String toString() {
		return "VisitaTerreno [idVisita=" + idVisita + ", rutClienteVisita=" + rutClienteVisita + ", fechaVisita="
				+ fechaVisita + ", horaVisita=" + horaVisita + ", lugarVisita=" + lugarVisita + ", comentariosVisita="
				+ comentariosVisita + ", clienteVisita=" + clienteVisita + "]";
	}
	
	
	
}
