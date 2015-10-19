
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



// la  class fille 

public class AfficheTemperature extends Temperature {
	//constructeur 
	AfficheTemperature(double nombre,char echelle){
		super(nombre, echelle);
	}
	
	public static void afficheEchelle(){
		switch(echelle) {
		  case 'c':
			  System.out.println(+Temperature.getNombre()+"  Celsius");
		    break;
		  case 'f':
			  System.out.println(+Temperature.getNombre()+"  Fahrenheit");
		    break;
		  case 'k':
			  System.out.println(+Temperature.getNombre()+"  kelvin");
		    break;
			
		
			
		
		
		
		
	}


// le main qui les exploites

public class EssayTemperature {

	public static void main(String[] args) {
		
		
		Temperature a=new Temperature(22,'c');
		 System.out.println(+a.getNombre()+"  "+a.getEchelle());
		 System.out.println(+a.conversion(+Temperature.getNombre())+"  Fahrenheit");
 
		 AfficheTemperature b=new AfficheTemperature(22,'c');
		
		 b.afficheEchelle();
	
		 
	}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
