package beans;

public class Empleado {
	
	private int empleadoId;
	private String nombre;
	private String apellido;
	private int horasTrabajadas;
	private float precioHora;
	
	
	
	public Empleado(int empleadoId, String nombre, String apellido, int horasTrabajadas, float precioHora) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public float getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
}
