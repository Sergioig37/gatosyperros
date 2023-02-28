
public class Gato extends Animales{
	
	private int vidas;
	private int ratonesCazados;
	private String nombre;
	
public Gato (String nombre, int peso, int edad) {
		
	
		super(nombre, peso, edad);
		this.ratonesCazados = 0;
		this.vidas = 7;
	}
	
public void hablar() {
		
		
		System.out.println("Miau!" +nombre);
		 
	}
}
