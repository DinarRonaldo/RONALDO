class SmartHome {
    private String homeName;
    private SmartDevice[] devices;
    private int deviceCount;
    
    public SmartHome(String homeName, int maxDevices) {
        this.homeName = homeName;
        this.devices = new SmartDevice[maxDevices];
        this.deviceCount = 0;
    }
    
    public void addDevice(SmartDevice device) {
        if (deviceCount < devices.length) {
            devices[deviceCount] = device;
            deviceCount++;
            System.out.println("Устройство " + device.getDeviceName() + " добавлено в дом");
        } else {
            System.out.println("Дом заполнен. Нельзя добавить.");
        }
    }
    
    public void removeDevice(String deviceId) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceId().equals(deviceId)) {
                String deviceName = devices[i].getDeviceName();
                for (int j = i; j < deviceCount - 1; j++) {
                    devices[j] = devices[j + 1];
                }
                deviceCount--;
                System.out.println("Устройство " + deviceName + " удалено из дома");
                return;
            }
        }
        System.out.println("Устройство с ID " + deviceId + " не найдено в доме " + homeName);
    }
    
    public void turnOnAllDevices() {
        System.out.println("Включение всех устройств в доме " + homeName);
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOn();
        }
    }
    
    public void turnOffAllDevices() {
        System.out.println("Выключение всех устройств в доме " + homeName);
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOff();
        }
    }
    
    public SmartDevice[] getDevicesByType(String type) {
        SmartDevice[] result = new SmartDevice[deviceCount];
        int found = 0;
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceType().equals(type)) {
                result[found] = devices[i];
                found++;
            }
        }
        SmartDevice[] finalResult = new SmartDevice[found];
        for (int i = 0; i < found; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
    
    public double calculateTotalPowerConsumption() {
        double total = 0;
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].isPoweredOn()) {
                total += devices[i].getPowerConsumption();
            }
        }
        return total;
    }
    
    public String getDeviceStatus(String deviceId) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceId().equals(deviceId)) {
                return devices[i].getDeviceName() + " - " + (devices[i].isPoweredOn() ? "Включено" : "Выключено");
            }
        }
        return "Устройство с ID " + deviceId + " не найдено";
    }
}