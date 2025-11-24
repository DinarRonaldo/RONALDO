public class Appetizer extends MenuItem {
	private String servingTemperature;
	private boolean isVegetarian;
	private int spiceLevel;
	
	public Appetizer(String itemId, String name, double price, int cookingTime, boolean isAvailable, String servingTemperature, boolean isVegetarian, int spiceLevel) {
		super(itemId, name, price, cookingTime, isAvailable);
		this.servingTemperature = servingTemperature;
		this.isVegetarian = isVegetarian;
		this.spiceLevel = spiceLevel;
	}
	
	@Override
	public String getItemType() {
		return getClass().getSimpleName();
	}
	
	@Override
	public void prepare() {
		System.out.println("Закуска готовится");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Температура подачи: " + servingTemperature);
		System.out.println("Вегетарианское: " + (isVegetarian ? "Да" : "Нет"));
		System.out.println("Уровень остроты: " + spiceLevel);
	}
	
	public void displayInfo(boolean showDetails) {
		if (showDetails) {
			displayInfo();
		} else {
			System.out.println("ID: " + getItemId());
			System.out.println("Название: " + getName());
			System.out.println("Цена: " + getPrice() + " руб");
		}
	}
	
	public void changeSpiceLevel(int newSpiceLevel) {
		spiceLevel = newSpiceLevel;
	}
	
	public String getNutritionInfo() {
		return "откуда я возьму информацию о питательности зная только поля выше";
	}
}