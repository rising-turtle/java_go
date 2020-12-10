package hz;

public class CarDealer {

    void displayAffordable(Car car, double pay){
        if(pay >= car.price){
            System.out.println("brand + " + car.brand + " " + car.price);
        }
    }
}
