public class SmartLight extends SmartDevice {
	private int brightness;
	private String color;
	private boolean isColorChanging;
	
	public SmartLight(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, int brightness, String color, boolean isColorChanging) {
		super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
		this.brightness = brightness;
		this.color = color;
		this.isColorChanging = isColorChanging;
	}
	
	@Override
	public String getDeviceType() {
		return getClass().getSimpleName();
	}
	
	@Override
	public void performAction() {
		if (isPoweredOn) {
			isPoweredOn = false;
			System.out.println("Лампа выключена");
		} else {
			isPoweredOn = true;
			System.out.println("Лампа включена");
		}
	}
	
	public void setBrightness(int level) {
		if (level >= 0 && level <= 100) {
			brightness = level;
		}
	}
	
	 public void setBrightness(int level, String color) {
        setBrightness(level);
        this.color = color;
    }
	
	public void changeColor(String newColor) {
		if (isColorChanging) {
			color = newColor;
		}
	}
	
	public void dimLights() {
		if (brightness - 20 > 0) {
			brightness = brightness - 20;
		} else {
			brightness = 0;
		}
	}
}