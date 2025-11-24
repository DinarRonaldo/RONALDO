import java.util.Scanner;

public class Car {
	
	Scanner scan = new Scanner();
	
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private double mileage;
    
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
        this.price = 0.0;
        this.isRunning = false;
        this.mileage = 0.0;
    }
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = "Unknown";
        this.price = 0.0;
        this.isRunning = false;
        this.mileage = 0.0;
    }
    
    public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }  
	
    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Цвет: " + color);
        System.out.println("Цена(RUB): " + price);
        System.out.println("Пробег(km): " + mileage);
        
        if (isRunning) {
            System.out.println("Двигатель заведен");
        } else {
            System.out.println("Двигатель заглушен");
        }
    }
    
    public void startEngine() {
        if (isRunning == false) {
            System.out.println("Двигатель заведен");
			isRunning = true;
        } else {
            System.out.println("Двигатель уже заведен");
        }
    }
    
    public void stopEngine() {
        if (isRunning == true) {
            isRunning = false;
            System.out.println("Двигатель заглушен");
        } else {
            System.out.println("Двигатель уже заглушен");
        }
    }
    
    public void drive(double distance) {
        mileage += distance;
        System.out.println("Машина проехала: " + distance);
        System.out.println("Общий пробег(km): " + mileage);
    }
    
    public void repaint(String newColor) {
        System.out.println("Машина перекрашена. Новый цвет машины: " + newColor);
        color = newColor;
    }
    
    public void updatePrice(double newPrice) {
        System.out.println("Новая цена машины: " + newPrice);
        price = newPrice;
    }
}