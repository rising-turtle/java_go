package hz;

public class CarBuyer {

    public String name;
    public double downPayment ; // downpay
    public double monthlyInterest; // loan
    public int numberOfPayments ; // 2 years
    private double maxMonthlyPayment;
//    public CarBuyer(String name) {
//        this.name = name;
//    }

    public CarBuyer(String name, double downPayment,
            double monthlyInterest,
            int numberOfPayments,
            double maxMonthlyPayment){
        this.name = name;
        setDownPayment(downPayment);
        setMonthlyInterest(monthlyInterest);
        setNumberOfPayments(numberOfPayments);
        setMaxMonthlyPayment(maxMonthlyPayment);
       // System.out.println(downPayment + " " + monthlyInterest + " " + numberOfPayments + " " + maxMonthlyPayment );
    }

    public void showAffordable(Car[] carList){
        for(Car car: carList){
            if(affordable(car)) {
                car.printCarInfo();
            }
        }
    }

    private boolean affordable(Car car){
        if(calculateMortgage(car.price) <= maxMonthlyPayment)
            return true;
        return false;
    }

    private double calculateMortgage(double carPrice){
        double mortgage = (carPrice - downPayment)
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

    public void setMaxMonthlyPayment(double maxMonthlyPayment){
        if(maxMonthlyPayment < 0)
            throw new IllegalArgumentException("maxMonthlyPayment must be positive");
        this.maxMonthlyPayment = maxMonthlyPayment;
    }

    public void setDownPayment(double downPayment){
        if(downPayment < 0)
            throw new IllegalArgumentException("downPayment must be positive");
        this.downPayment = downPayment;
    }
    public void setMonthlyInterest(double monthlyInterest){
        if(monthlyInterest < 0)
            throw new IllegalArgumentException("monthlyInterest must be positive");
        this.monthlyInterest = monthlyInterest;
    }
    public void setNumberOfPayments(int numberOfPayments){
        if(numberOfPayments <= 0)
            throw new IllegalArgumentException("numberOfPayments must be positive");
        this.numberOfPayments = numberOfPayments;
    }


//    public String name;
//    public CarBuyer(String name) {
//        this.name = name;
//    }
//
//    public double calculateMortgage(double monthlyInterest, int numberOfPayments, double downPayment, double carPrice){
//        double mortgage = (carPrice - downPayment)
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//        return mortgage;
//    }


//    boolean affordable(Car car){
//        return (calculateMortgage(car.price) <= maxMontlyPay);
//    }
//
//    public double monthlyInterest;
//    public int numberOfPayments;
//    public double downPayment;
//    public double maxMontlyPay;
//
//    double calculateMortgage(double carPrice){
//        double mortgage = (carPrice - downPayment)
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//        return mortgage;
//    }

}
