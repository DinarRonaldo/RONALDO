class SmartSecurityCamera extends SmartDevice {
    private boolean isRecording;
    private boolean motionDetection;
    private String videoQuality;
	
    public SmartSecurityCamera(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, boolean isRecording, boolean motionDetection, String videoQuality) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.isRecording = isRecording;
        this.motionDetection = motionDetection;
        this.videoQuality = videoQuality;
    }
	
	@Override
	public String getDeviceType() {
		return getClass().getSimpleName();
	}
    
    @Override
    public void performAction() {
        if (isRecording) {
			isRecording = false;
            System.out.println("Камера остановила запись");
        } else {
			isRecording = true;
            System.out.println("Камера начала запись");
        }
    }
    
    public void startRecording() {
        isRecording = true;
    }
    
    public void startRecording(boolean motionDetection) {
        isRecording = true;
        this.motionDetection = motionDetection;
    }
    
    public void detectMotion() {
        if (motionDetection) {
            System.out.println("Обнаружено движение");
        } else {
			System.out.println("Обнаружение движений выключено");
    }
    
    public void getLiveFeed() {
        System.out.println("Прямая трансляция с камеры");
    }
}