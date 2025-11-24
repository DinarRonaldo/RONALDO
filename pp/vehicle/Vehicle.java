public class Vehicle {
	protected String brand;
	protected int maxSpeed;
	
	public Vehicle(String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	public void move() {
		System.out.println("Транспорт движется");
	}
	
	public void stop() {
		System.out.println("Транспорт остановился");
	}
	
	public void displayInfo() {
		System.out.println("Марка транспорта: " + brand);
		System.out.println("Максимальная скорость транспорта: " + maxSpeed);
	}
}