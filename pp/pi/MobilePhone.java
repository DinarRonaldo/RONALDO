public class MobilePhone {
	
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;
	
	private static int totalPhones;
	private static final int MAX_BATTERY = 100;
	
	public static void displayTechSupport() {
		System.out.println("Номер тех поддержки: +79047161190");
		System.out.println("Адрес тех центра: ул. Сибгата Хакима 5А");
		System.out.println("Часы работы: 10-00/20-00");
	}
	
	public MobilePhone() {
		setBrand("Unknown");
		setModel("Unknown");
		setStorageGB(0);
		setBatteryLevel(0);
		setIsPoweredOn(false);
		totalPhones++;
	}

	public MobilePhone(String brand, String model, int storageGB) {
		setBrand(brand);
		setModel(model);
		setStorageGB(storageGB);
		setBatteryLevel(0);
		setIsPoweredOn(false);
		totalPhones++;
	}

	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		setBrand(brand);
		setModel(model);
		setStorageGB(storageGB);
		setBatteryLevel(batteryLevel);
		setIsPoweredOn(isPoweredOn);
		totalPhones++;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getStorageGB() {
		return storageGB;
	}
	
	public int getBatteryLevel() {
		return batteryLevel;
	}
	
	public boolean getIsPoweredOn() {
		return isPoweredOn;
	}
	
	public static int getTotalPhones() {
		return totalPhones;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setStorageGB(int storageGB) {
		if (storageGB >= 0) {
			this.storageGB = storageGB;
		} else {
			System.out.println("Память не может быть отрицательной");
			return;
		}
	}
	
	public void setBatteryLevel(int batteryLevel) {
		if (batteryLevel >= 0 && batteryLevel <= 100) {
			this.batteryLevel = batteryLevel;
		} else {
			System.out.println("Заряд должен быть от 0 до 100");
			return;
		}
	}
	
	public void setIsPoweredOn(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}
	
	public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Память(GB): " + storageGB);
        System.out.println("Заряд батареи: " + batteryLevel + "%");
        
        if (isPoweredOn) {
            System.out.println("Включен");
        } else {
            System.out.println("Выключен");
        }
    }
	
	public void displayInfo(boolean showPowerStatus) {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Память(GB): " + storageGB);
        System.out.println("Заряд батареи: " + batteryLevel + "%");
        
        if (showPowerStatus == true) {
			if (isPoweredOn) {
				System.out.println("Включен");
			} else {
				System.out.println("Выключен");
			}
		}
	}
	
	public void powerOn() {
		if (isPoweredOn == false) {
			System.out.println("Телефон включен");
			isPoweredOn = true;
		} else {
			System.out.println("Телефон уже включен");
		}
	}
	
	public void powerOff() {
		if (isPoweredOn == true) {
			System.out.println("Телефон выключен");
			isPoweredOn = false;
		} else {
			System.out.println("Телефон уже выключен");
		}
	}
	
	public void chargeBattery(int percent) {
		batteryLevel += percent;
		if (batteryLevel > 100) {
			System.out.println("Телефон полностью заряжен");
			batteryLevel = 100;
		} else {
			System.out.println("Телефон зарядился на " + percent + " процентов. Текущий уровень батареи: " + batteryLevel);
		}
	}
	
	public void chargeBattery(int percent, int minutes) {
		batteryLevel += percent;
		if (batteryLevel > 100) {
			System.out.println("Телефон полностью заряжен. Время зарядки: " + minutes);
			batteryLevel = 100;
		} else {
			System.out.println("Телефон зарядился на " + percent + " процентов. Текущий уровень батареи: " + batteryLevel + "Время зарядки: " + minutes);
		}
	}
	
	public void useBattery(int percent) {
		batteryLevel -= percent;
		if (batteryLevel <= 0) {
			System.out.println("Телефон разрядился");
			isPoweredOn = false;
		} else {
			System.out.println("Телефон разрядился на " + percent + " процентов. Текущий уровень батареи: " + batteryLevel);
		}
	}
	
	public void useBattery(int percent, String appName) {
		batteryLevel -= percent;
		if (batteryLevel <= 0) {
			System.out.println("Телефон разрядился. Зарядка была потрачена в приложении " + appName);
			isPoweredOn = false;
		} else {
			System.out.println("Телефон разрядился на " + percent + " процентов. Текущий уровень батареи: " + batteryLevel + ". Зарядка была потрачена в приложении " + appName);
		}
	}
}