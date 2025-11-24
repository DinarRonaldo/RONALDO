public class SmartDevice {
	private String deviceId;
	private String deviceName;
	private String location;
	private boolean isPoweredOn;
	private double powerConsumption;
	
	private static int totalDevices;
	private static final int MAX_POWER_CONSUMPTION = 5000;
	
	public static int getTotalDevices() {
		return totalDevices;
	}
	
	public SmartDevice() {
		deviceId = "Unknown";
		deviceName = "Unknown";
		location = "Unknown";
		isPoweredOn = true;
		powerConsumption = 0.0;
		totalDevices++;
	}
	
	public SmartDevice(String deviceId, String deviceName, String location) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.location = location;
		isPoweredOn = true;
		powerConsumption = 0.0;
		totalDevices++;
	}
	
	public SmartDevice(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.location = location;
		this.isPoweredOn = isPoweredOn;
		this.powerConsumption = powerConsumption;
		totalDevices++;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		if (deviceId != null && deviceId.trim().isEmpty() == false) {
			this.deviceId = deviceId;
		}
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isPoweredOn() {
		return isPoweredOn;
	}
	
	public void setIsPoweredOn(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}
	
	public double getPowerConsumption() {
		return powerConsumption;
	}
	
	public void setPowerConsumption(double powerConsumption) {
		if (powerConsumption < 0) {
			this.powerConsumption = 0;
		} 
		else if (powerConsumption > MAX_POWER_CONSUMPTION) {
			this.powerConsumption = MAX_POWER_CONSUMPTION;
		}
		else if (powerConsumption >= 0 && powerConsumption <= MAX_POWER_CONSUMPTION) {
			this.powerConsumption = powerConsumption;
		}
	}
	
	public String getDeviceType() {
		return getClass().getSimpleName();
	}
	
	public void performAction() {
		System.out.println("Устройство выполняет действие");
	}
	
	public void turnOn() {
		if (isPoweredOn == true) {
			System.out.println("Устройство уже включено");
		} else {
			isPoweredOn = true;
			System.out.println("Устройство включено");
		}
	}
	
	public void turnOff() {
		if (isPoweredOn == false) {
			System.out.println("Устройство уже выключено");
		} else {
			isPoweredOn = false;
			System.out.println("Устройство выключено");
		}
	}
	
	public void getStatus() {
		if (isPoweredOn == true) {
			System.out.println("Устройство включено");
		} else {
			System.out.println("Устройство выключено");
		}
	}
}