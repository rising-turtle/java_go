package hz;

public class Buyer {

    private String name;

//    public double downPayment ; // downpay
//    public double loanInterestRate; // loan
//    public int loanTerm ; // 2 years
//    public double budget;
    public Buyer(String name) {
        //  public Buyer(String name,double downPayment, double interestRate, int loanTerm, double budget) {
        this.name = name;
//        setBudget(budget);
//        setDownPayment(downPayment);
//        setInterestRate(interestRate);
//        setLoanTerm(loanTerm);
    }

    public double calculateMonthlyPayment(double loanInterestRate, int loanTerm, double downPayment, double carPrice) {
        double monthlyPayment = (carPrice - downPayment)
                * (loanInterestRate * Math.pow(1 + loanInterestRate, loanTerm))
                / (Math.pow(1 + loanInterestRate, loanTerm) - 1);
        return monthlyPayment;
    }

    public String getName() {
        return name;
    }

//    public void setDownPayment(double downPayment){
//        if(downPayment < 0)
//            throw new IllegalArgumentException("downPayment must be positive");
//        this.downPayment = downPayment;
//    }
//
//    public void setBudget(double budget){
//        if(budget < 0)
//            throw new IllegalArgumentException("Budget must be positive");
//        this.budget = budget;
//    }
//    public void setInterestRate(double loanInterestRate){
//        if(loanInterestRate < 0)
//            throw new IllegalArgumentException("loanInterestRate must be positive");
//        this.loanInterestRate = loanInterestRate;
//    }
//    public void setLoanTerm(int loanTerm){
//        if(loanTerm <= 0)
//            throw new IllegalArgumentException("loanTerm must be positive");
//        this.loanTerm = loanTerm;
//    }


    //    public void showAffordable(Car[] carList){
//        System.out.println("Buyer: " + getName() + " can buy: ");
//        for(Car car: carList){
//            if((calculateMonthlyPayment(car.price) <= budget)) {
//                car.printCarInfo();
//            }
//        }
//    }

}






