package sprintModulo4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Accidente {
	private int idAccidente;
	private ArrayList<String> rutClienteAccidente;
	private LocalDate fechaAccidente;
	private LocalTime horaAccidente;
	private String lugarAccidente;
	private String origenAccidente;
	private String consecuenciasAccidente;
	private ArrayList<Cliente> clienteAccidente;
	
	public Accidente() {}

	public Accidente(int idAccidente, ArrayList<String> rutClienteAccidente, LocalDate fechaAccidente,
			LocalTime horaAccidente, String lugarAccidente, String origenAccidente, String consecuenciasAccidente,
			ArrayList<Cliente> clienteAccidente) {
		super();
		this.idAccidente = idAccidente;
		this.rutClienteAccidente = rutClienteAccidente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciasAccidente = consecuenciasAccidente;
		this.clienteAccidente = clienteAccidente;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public ArrayList<String> getRutClienteAccidente() {
		return rutClienteAccidente;
	}

	public void setRutClienteAccidente(ArrayList<String> rutClienteAccidente) {
		this.rutClienteAccidente = rutClienteAccidente;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public LocalTime getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(LocalTime horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public String getOrigenAccidente() {
		return origenAccidente;
	}

	public void setOrigenAccidente(String origenAccidente) {
		this.origenAccidente = origenAccidente;
	}

	public String getConsecuenciasAccidente() {
		return consecuenciasAccidente;
	}

	public void setConsecuenciasAccidente(String consecuenciasAccidente) {
		this.consecuenciasAccidente = consecuenciasAccidente;
	}

	public ArrayList<Cliente> getClienteAccidente() {
		return clienteAccidente;
	}

	public void setClienteAccidente(ArrayList<Cliente> clienteAccidente) {
		this.clienteAccidente = clienteAccidente;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutClienteAccidente=" + rutClienteAccidente
				+ ", fechaAccidente=" + fechaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente="
				+ lugarAccidente + ", origenAccidente=" + origenAccidente + ", consecuenciasAccidente="
				+ consecuenciasAccidente + ", clienteAccidente=" + clienteAccidente + "]";
	}
	
	
	
}
