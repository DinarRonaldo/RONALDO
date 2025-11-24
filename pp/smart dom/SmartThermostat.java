class SmartThermostat extends SmartDevice {
    private double currentTemperature;
    private double targetTemperature;
    private String mode;
	
    public SmartThermostat(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, double currentTemperature, double targetTemperature, String mode) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.mode = mode;
    }
    
	@Override
	public String getDeviceType() {
		return getClass().getSimpleName();
	}
	
    @Override
    public void performAction() {
        if (isPoweredOn()) {
            System.out.println("Термостат регулирует температуру");
        } else {
			System.out.println("Термостат выключен");
    }
    
    public void setTemperature(double temp) {
        targetTemperature = temp;
    }
    
    public void setTemperature(double temp, String mode) {
        targetTemperature = temp;
        this.mode = mode;
    }
    
    public void getEnergyReport() {
        System.out.println("Потребление энергии в ваттах: " + powerConsumption);
    }
    
    public void scheduleTemperature(double temp, int hour) {
        System.out.println("Температура " + temp + " запланирована на " + hour + "часов");
    }
}