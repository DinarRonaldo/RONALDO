public class Bicycle extends Vehicle {
	private int gearCount;
	
	public Bicycle(String brand, int maxSpeed, int gearCount) {
		super(brand, maxSpeed);
		this.gearCount = gearCount;
	}
	
	@Override
	public void move() {
		System.out.println("Велосипед едет по велодорожке");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Колличество скоростей: " + gearCount);
	}
	
	public void changeGear() {
		System.out.println("Скорость переключена");
	}
}