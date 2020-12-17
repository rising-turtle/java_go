package hz;

public class RacingCar extends Car {
    private double maxSpeed;

    public RacingCar(String brand, double price,  double maxSpeed) {
        super(brand, price);
        this.maxSpeed = maxSpeed;
    }

//    @Override
//    public void printCarInfo() {
//        System.out.println("brand: " + brand + " price: " + price + " maxSpeed: " + maxSpeed );
//    }
}
