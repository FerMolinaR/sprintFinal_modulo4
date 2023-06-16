package sprintModulo4;

public class Administrativo extends Usuario{
	private String area;
	private String expPrevia;
	
	public Administrativo() {}

	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpPrevia() {
		return expPrevia;
	}

	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}
		
	public boolean validarArea(String area) {
		return ValidadorCamposGenericos.validarLongitudCampo(area, 5, 20);		
	}
	
	
	public boolean validarExperiencia(String experiencia) {
		return ValidadorCamposGenericos.validarLongitudCampo(experiencia, 0, 100);
	}
	
	

	@Override
	public void analizarUsuario() {		
		super.analizarUsuario();
		System.out.println("Area: " + this.area + "\n" + "Experiencia: " + this.expPrevia);
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}
	
	
	
}
