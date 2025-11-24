public class Product {
	
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;
	
	private static int totalProducts;
	private static final String STORE_NAME = "Супермаркет 'У дома'";
	
	public static void calculateTotalValue(Product[] products) {
        double res = 0.0;
        for (Product product : products) {
            res += product.getPrice() * product.getQuantity();
        }
        System.out.println("Общая стоимость всех товаров: " + res);
    }
    
    public Product() {
        setName("Unknown");
        setPrice(0.0);
        setCategory("Unknown");
        setInStock(true);
        setQuantity(0);
		totalProducts++;
    }
    
    public Product(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
        setInStock(true);
        setQuantity(0);
		totalProducts++;
    }
    
    public Product(String name, double price, String category, boolean inStock, int quantity) {
        setName(name);
        setPrice(price);
        setCategory(category);
        setInStock(inStock);
        setQuantity(quantity);
		totalProducts++;
    }
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public boolean getInStock() {
		return inStock;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public static int getTotalProducts() {
		return totalProducts;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("Баланс должен быть в промежутке от 0 до 1.000.000");
			return;
		}
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Количество не может быть отрицательным");
			return;
		}
	}
    
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Категория: " + category);
        System.out.println("Количество на складе: " + quantity);
        
        if (inStock) {
            System.out.println("В наличии");
        } else {
            System.out.println("Нет в наличии");
        }
    }
	
	public void displayInfo(boolean showStockStatus) {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Категория: " + category);
        System.out.println("Количество на складе: " + quantity);
        
        if (showStockStatus == true) {
			if (inStock) {
				System.out.println("В наличии");
			} else {
				System.out.println("Нет в наличии");
			}
		}
    }
    
    public void applyDiscount(double percent) {
        double discountAmount = price * (percent / 100);
        price = price - discountAmount;
        System.out.println("Новая цена: " + price);
    }
	
	public void applyDiscount(double percent, String promoCode) {
        double discountAmount = price * (percent / 100);
        price = price - discountAmount;
        System.out.println("Новая цена: " + price + ", по промокоду: " + promoCode);
    }
    
    public void restock(int amount) {
        quantity += amount;
        inStock = true;
        System.out.println("Текущее количество: " + quantity);
    }
	
	public void restock(int amount, String supplier) {
        quantity += amount;
        inStock = true;
        System.out.println("Текущее количество: " + quantity + ". Поставщик: " + supplier);
    }
    
    public void sell(int amount) {
        if (amount > quantity) {
            System.out.println("Недостаточно товара на складе. Доступно: " + quantity);
            return;
        } else {
			quantity -= amount;
			System.out.println("Продано " + amount + " единиц товара");
			System.out.println("Остаток на складе: " + quantity);
		}
		if (quantity == 0) {
			inStock = false;
		}
    }
	
	public void sell(int amount, String customer) {
        if (amount > quantity) {
            System.out.println("Недостаточно товара на складе. Доступно: " + quantity);
            return;
        } else {
			quantity -= amount;
			System.out.println("Продано " + amount + " единиц товара. Покупатель: " + customer);
			System.out.println("Остаток на складе: " + quantity);
		}
		if (quantity == 0) {
			inStock = false;
		}
    }
}