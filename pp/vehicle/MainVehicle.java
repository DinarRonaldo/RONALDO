public class MainVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", 180, "бензин"),
            new Bicycle("Stels", 30, 21),
            new Motorcycle("Harley-Davidson", 220, 1.8),
            new Car("Tesla", 250, "электричество"),
            new Bicycle("Forward", 25, 7)
        };
        
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            vehicle.stop();
        }
        
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.refuel();
            } else if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                bicycle.changeGear();
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.wheelie();
            }
        }
        
        Car myCar = new Car("BMW", 240, "дизель");
        myCar.displayInfo();
        myCar.move();
        myCar.refuel();
        
        Bicycle myBike = new Bicycle("Merida", 35, 24);
        myBike.displayInfo();
        myBike.move();
        myBike.changeGear();
        
        Motorcycle myMoto = new Motorcycle("Yamaha", 280, 1.0);
        myMoto.displayInfo();
        myMoto.move();
        myMoto.wheelie();
    }
}