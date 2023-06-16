package sprintModulo4;

import java.util.ArrayList;

public class Revision {
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalleRevision;
	private EstadoRevision estadoRevision;
	private VisitaTerreno visitaTerreno;
	
	public Revision() {}

	public Revision(int idRevision, int idVisita, String nombreRevision, String detalleRevision,
			EstadoRevision estadoRevision, VisitaTerreno visitaTerreno) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estadoRevision = estadoRevision;
		this.visitaTerreno = visitaTerreno;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public EstadoRevision getEstadoRevision() {
		return estadoRevision;
	}

	public void setEstadoRevision(EstadoRevision estadoRevision) {
		this.estadoRevision = estadoRevision;
	}

	public VisitaTerreno getVisitaTerreno() {
		return visitaTerreno;
	}

	public void setVisitaTerreno(VisitaTerreno visitaTerreno) {
		this.visitaTerreno = visitaTerreno;
	}
	
	public boolean validarNombreRevision(String nombreRevision) {
		return ValidadorCamposGenericos.validarLongitudCampo(nombreRevision, 10, 50);
	}
	
	public boolean validarDetalle(String detalle) {
		return ValidadorCamposGenericos.validarLongitudCampo(detalle, 0, 100);
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalleRevision=" + detalleRevision + ", estadoRevision=" + estadoRevision + ", visitaTerreno="
				+ visitaTerreno + "]";
	}
	
	
	
}
