package hz;

public class Buyer {

    private String name;

    //    private double downPayment ; // downpay
//    private double monthlyInterest; // loan
//    private int loanTerm ; // 2 years
//    private double budget;
    public Buyer(String name) {
        //  public Buyer(String name,double downPayment, double interestRate, int loanTerm, double budget) {
        this.name = name;
//        setBudget(budget);
//        setDownPayment(downPayment);
//        setInterestRate(interestRate);
//        setLoanTerm(loanTerm);
    }

    public double calculateMonthlyPayment(double monthlyInterest, int loanTerm, double downPayment, double carPrice) {
        double monthlyPayment = (carPrice - downPayment)
                * (monthlyInterest * Math.pow(1 + monthlyInterest, loanTerm))
                / (Math.pow(1 + monthlyInterest, loanTerm) - 1);
        return monthlyPayment;
    }

    public String getName(){
        return name;
    }
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
//    public void setInterestRate(double monthlyInterest){
//        if(monthlyInterest < 0)
//            throw new IllegalArgumentException("monthlyInterest must be positive");
//        this.monthlyInterest = monthlyInterest;
//    }
//    public void setLoanTerm(int loanTerm){
//        if(loanTerm <= 0)
//            throw new IllegalArgumentException("loanTerm must be positive");
//        this.loanTerm = loanTerm;
//    }

//    public void showAffordable(Car[] carList){
//        for(Car car: carList){
//            if((calculateMonthlyPayment(car.price) <= budget) {
//                car.printCarInfo();
//            }
//        }
//    }




