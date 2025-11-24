public class Car extends Vehicle {
	private String fuelType;
	
	public Car(String brand, int maxSpeed, String fuelType) {
		super(brand, maxSpeed);
		this.fuelType = fuelType;
	}
	
	@Override
	public void move() {
		System.out.println("Машина едет по дороге");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Тип топлива: " + fuelType);
	}
	
	public void refuel() {
		System.out.println(brand + " заправлен топливом: " + fuelType);
	}
}