package sprintModulo4;

public class Cliente extends Usuario {	
	private String apellidos;
	private String telefono;
	private String afp;
	private SistemaSalud sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	public Cliente() {}

	public Cliente(String apellidos, String telefono, String afp, SistemaSalud sistemaSalud, String direccion,
			String comuna, int edad) {		
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public SistemaSalud getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(SistemaSalud sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean validarApellidos(String apellidos) {		
		return ValidadorCamposGenericos.validarLongitudCampo(apellidos, 5, 30);		
	}
	

	public boolean validarAfp(String afp) {
		return ValidadorCamposGenericos.validarLongitudCampo(afp, 4, 30);		
	}
	

	public boolean validarDireccion(String direccion) {
		return ValidadorCamposGenericos.validarLongitudCampo(direccion, 0, 70);
	}
	

	public boolean validarComuna(String comuna) {
		return ValidadorCamposGenericos.validarLongitudCampo(comuna, 0, 50);
	}
	

	public boolean validarEdad(int edad) {
		return (edad >= 0 && edad < 150) ? true : false;		
	}
	
	public String obtenerNombre() {
		return "Nombre completo: " + getNombre() + this.apellidos;
	}
	
	public SistemaSalud obtenerSistemaSalud() {
		return this.sistemaSalud;
	}
	
		@Override
	public void analizarUsuario() {		
		super.analizarUsuario();
		System.out.println("Direccion: " + this.direccion + "\n" + "Comuna: " + this.comuna);
	}

	@Override
	public String toString() {
		return "Cliente [apellidos=" + apellidos + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud="
				+ sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}
	
	

	
}
