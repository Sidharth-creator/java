package NEW;
public class Vehicle {
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
		
	}
	public void displayInfo() {
		System.out.println("brand"+brand);
		System.out.println("model"+model);
		
	}

}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model){
		super(brand,model);
		
	}
}
