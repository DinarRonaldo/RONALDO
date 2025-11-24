public class MenuItem {
	private String itemId;
	private String name;
	private double price;
	private int cookingTime;
	private boolean isAvailable;
	
	private static int totalMenuItems;
	private static final int MAX_COOKING_TIME = 120;
	
	public static int getTotalMenuItems() {
		return totalMenuItems;
	}
	
	public MenuItem() {
		itemId = "Unknown";
		name = "Unknown";
		price = 0.0;
		cookingTime = 1;
		isAvailable = true;
		totalMenuItems++;
	}
	
	public MenuItem(String itemId, String name, double price) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		cookingTime = 1;
		isAvailable = true;
		totalMenuItems++;
	}
	
	public MenuItem(String itemId, String name, double price, int cookingTime, boolean isAvailable) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.cookingTime = cookingTime;
		this.isAvailable = isAvailable;
		totalMenuItems++;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCookingTime() {
		return cookingTime;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setItemId(String itemId) {
		if (itemId != null && itemId.trim().isEmpty() == false) {
			this.itemId = itemId;
		} else {
			System.out.println("ItemId не должен быть пустым");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		}
	}
	
	public void setCookingTime(int cookingTime) {
		if (cookingTime > 0 && cookingTime <= MAX_COOKING_TIME) {
			this.cookingTime = cookingTime;
		} else {
			System.out.println("Время приготовления должно быть от 1 до 120");
		}
	}
	
	public String getItemType() {
		return getClass().getSimpleName();
	}
	
	public void prepare() {
		System.out.println("Готовим " + name);
	}
	
	public void displayInfo() {
		System.out.println("ID: " + itemId);
		System.out.println("Название: " + name);
		System.out.println("Цена: " + price + " руб");
		System.out.println("Время приготовления: " + cookingTime  + " минут");
		System.out.println("Статус: " + (isAvailable ? "Да" : "Нет"));
	}
	
	public void updatePrice(double newPrice) {
		setPrice(newPrice);
		System.out.println("Цена обновлена. Новая цена: " + price);
	}
}