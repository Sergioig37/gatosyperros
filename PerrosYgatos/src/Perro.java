
public class Perro extends Animales{

	private int carterosAhuyentados;
	private double depositoDePis;
	
	public Perro (String nombre, int peso, int edad, double depositoDePis) {
		
		
		super(nombre, peso, edad);
		this.depositoDePis = depositoDePis;
		this.carterosAhuyentados = 0;
		
	}
	
public void hablar() {
		
		
		System.out.println("Guau!" +nombre);
		 
	}
	
}	
