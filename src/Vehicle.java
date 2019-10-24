
public abstract class Vehicle {
	
	//attributs
	private String brand;
	private int kilometers;
	
	
	
    // constructeurs  
    public Vehicle(String brand , int kilometers) {  
        this.brand = brand;
        this.kilometers = 0;  
    }
    
    
    public Vehicle(String brand) {  
        this.brand = brand;  
     
    }
    
    
    // implémentation du corps de la méthode
    
    public abstract String doStuff();
    
    	
    // getter

	public String getBrand() {
		return brand;
	}
	
	public int getKilometers() {
		return kilometers;
	}
	

	//setters

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}  

}
