package hz;

public class LuxuryCar extends Car {

    // public String brand;
    // public double price;
    public int year;
    public int rank;

    public LuxuryCar(String brand, double price, int year, int rank) {
        super(brand, price);
//        this.brand = brand;
//        this.price = price;
        this.year = year;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public void printCarInfo(){
        System.out.println("brand: " + brand + " price: " + price + " year: " + year + " rank: " + rank);
    }

//    public String brand;
//    public double price;
//    public int year;
//    public int rank;
//
//    public LuxuryCar(String brand, double price, int year, int rank) {
//        this.brand = brand;
//        this.price = price;
//        this.year = year;
//        this.rank = rank;
//    }

}
