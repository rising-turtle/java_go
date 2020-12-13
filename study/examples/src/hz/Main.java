package hz;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // cars to be bought
        var car1 = new Car("Camry", 24000);
        var car2 = new Car("Ford", 20000);
        var car3 = new Car("Honda", 30000);

        // var car4 = new LuxuryCar("LandRover", 90000, 2020);
        // var car5 = new RacingCar("Bugatti", 150000, 200 );

        var carList = new Car[]{car1, car2, car3};

        // create a buyer
        double downPayment = 5000; // downpay
        double loanInterestRate = 0.02; // loan rate
        int loanTerm = 12 * 2; // 2 years
        double budget = 1200; // affordable monthly payment

        var buyer = new Buyer("Tom");

        // find out which car the buyer can afford
        System.out.println("Buyer: " + buyer.getName() + " can buy: ");
        for(Car car: carList){
            // calculate monthly payment for each car
            double monthly_payment = buyer.calculateMonthlyPayment(loanInterestRate,
                    loanTerm, downPayment, car.price);

            if(monthly_payment < budget) {
                printCarInfo(car);
            }
        }
        // buyer.showAffordable(carList);
        // var buyer = new Buyer("Tom", downPayment, loanInterestRate, loanTerm, budget);
    }

    static void printCarInfo(Car car){
        System.out.println("brand " + car.brand + " " + car.price);
    }
}

//	buyer.downPayment = downPayment;
//	buyer.loanInterestRate = loanInterestRate;
//	buyer.loanTerm = loanTerm;
//	buyer.budget = budget;

//        buyer.setDownPayment(downPayment);
//        buyer.setInterestRate(loanInterestRate);
//        buyer.setLoanTerm(loanTerm);
//        buyer.setBudget(budget);






