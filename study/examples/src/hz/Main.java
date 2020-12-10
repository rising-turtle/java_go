package hz;

public class Main {
    public static void main(String[] args) {

        // cars to be bought
        var car1 = new Car("Camry", 24000);
        var car2 = new Car("Ford", 20000);
        var car3 = new Car("Tesla",60000);

        var carList = new Car[]{car1, car2, car3};

        // create a buyer
        double downPayment = 5000; // downpay
        double monthlyInterest = 0.02; // loan
        int numberOfPayments = 12 * 2; // 2 years
        double maxMonthlyPayment = 22200; // affordable monthly payment

        var carBuyer = new CarBuyer("Tom", downPayment, monthlyInterest, numberOfPayments, maxMonthlyPayment);
        carBuyer.showAffordable(carList);

        // var carBuyer = new CarBuyer("Tom");
//        carBuyer.setDownPayment(downPayment);
//        carBuyer.setMonthlyInterest(monthlyInterest);
//        carBuyer.setNumberOfPayments(numberOfPayments);
//        carBuyer.setMaxMonthlyPayment(maxMonthlyPayment);


        var car4 = new LuxuryCar("LandRover", 90000, 2020, 3);
        var car5 = new RacingCar("Bugatti", 150000, 200 );


//        // calculate mortgage for each car
//        if(carBuyer.affordable(car1))
//            car1.printCarInfo();
//
//        if(carBuyer.affordable(car2))
//            car2.printCarInfo();
//
//        if(carBuyer.affordable(car3))
//            car3.printCarInfo();


//        double mortgage_for_ca1 = carBuyer.calculateMortgage(car1.price);
//        double mortgage_for_car2 = carBuyer.calculateMortgage(car2.price);
//        double mortgage_for_car3 = carBuyer.calculateMortgage(car3.price);
//
//        // find out which car the buyer can afford
//        System.out.println("Buyer: " + carBuyer.name + " can buy: ");
//        if(mortgage_for_ca1 <= maxMonthlyPayment)
//            car1.printCarInfo();
//
//        if(mortgage_for_car2 <= maxMonthlyPayment)
//            car2.printCarInfo();
//
//        if(mortgage_for_car3 <= maxMonthlyPayment)
//            car3.printCarInfo();
    }



    /*
    public static void main(String[] args) {
        // create a buyer
        double downPayment = 5000; // downpay
        double monthlyInterest = 0.02; // loan
        int numberOfPayments = 12 * 2; // 2 years
        double maxMonthlyPayment = 1200; // affordable monthly payment

        var carBuyer = new CarBuyer("Tom");

        // cars to be bought
        var car1 = new Car("Camry", 24000);
        var car2 = new Car("Ford", 20000);
        var car3 = new Car("Tesla",60000);

        // calculate mortgage for each car
        double mortgage_for_ca1 = carBuyer.calculateMortgage(monthlyInterest,
                numberOfPayments, downPayment, car1.price );

        double mortgage_for_car2 = carBuyer.calculateMortgage(monthlyInterest,
                numberOfPayments, downPayment, car2.price);

        double mortgage_for_car3 = carBuyer.calculateMortgage(monthlyInterest,
                numberOfPayments, downPayment, car3.price);

        // find out which car the buyer can afford
        System.out.println("Buyer: " + carBuyer.name + " can buy: ");
        if(mortgage_for_ca1 <= maxMonthlyPayment)
            printCarInfo(car1);

        if(mortgage_for_car2 <= maxMonthlyPayment)
            printCarInfo(car2);

        if(mortgage_for_car3 <= maxMonthlyPayment)
            printCarInfo(car3);
    }
    static void printCarInfo(Car car){
        System.out.println("brand " + car.brand + " " + car.price);
    }*/
}


// print affordable cars
//        var carList = new Car[]{car1, car2, car3};
//        for(Car car : carList){
//            if(carBuyer.affordable(car)){
//                System.out.println("brand + " + car.brand + " " + car.price);
//            }
//        }


// var carDealer = new CarDealer();

//        System.out.println("Car: " + car1.brand + " mortgage: " + mortgage_for_ca1);
//        System.out.println("Car: " + car2.brand + " mortgage: " + mortgage_for_car2);
//        System.out.println("Car: " + car3.brand + " mortgage: " + mortgage_for_car3);
