
public class Temperature {

	protected static double nombre;
	protected static char echelle;
	 // constructeur
	Temperature(double nombre,char echelle){
		this.nombre=nombre;
		this.echelle=echelle;
	}
	
	// getters and setters
	
	static public double getNombre() {
		return nombre;
	}
	public void setNombre(double nombre) {
		this.nombre = nombre;
	}
	 static public char getEchelle() {
		return echelle;
	}
	public void setEchelle(char echelle) {
		this.echelle = echelle;
	}
	
	// methode
	double conversion(double nombre ){
		return 9/5*nombre+32;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
