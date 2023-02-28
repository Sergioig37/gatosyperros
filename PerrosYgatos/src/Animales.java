
public abstract class Animales {

	protected String nombre;
	protected int peso;
	protected int edad;
	
	public Animales (String nombre, int peso, int edad) {
		
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getPeso() {
		return peso;
	}

	public int getEdad() {
		return edad;
	}

}
