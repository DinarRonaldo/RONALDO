public class Motorcycle extends Vehicle {
	private double engineCapacity;
	
	public Motorcycle(String brand, int maxSpeed, double engineCapacity) {
		super(brand, maxSpeed);
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public void move() {
		System.out.println("Мотоцикл мчится по шоссе");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Объем двигателя: " + engineCapacity);
	}
	
	public void wheelie() {
		System.out.println("Сделал вилли");
	}
}