package hz;

public class RacingCar extends Car {
    private double maxSpeed;
    public int year;

    public RacingCar(String brand, double price, int year, double maxSpeed) {
        super(brand, price);
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

//    @Override
//    public void printCarInfo() {
//        System.out.println("brand: " + brand + "price: " + price + " maxSpeed: " + maxSpeed + " year: "+year);
//    }
}
