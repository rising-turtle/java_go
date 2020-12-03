package hz;

public class MortgageCaculator {

    private final static int MONTHS_IN_YEAR = 12;
    private final static float PERCENT = 100f;

    private int principal;
    private float annualInterest;
    private int years;

    public MortgageCaculator(int principal, float annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getAnnualInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return balance;
    }

    public double calculateMortgage() {
        float monthlyInterest = getAnnualInterest();
        float numberOfPayments = getNumberOfPayments();
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double[] getRemainingBalance() {
        var remainingBalance = new double[getNumberOfPayments()];
        for(short month=1; month <= remainingBalance.length; month++){
            remainingBalance[month-1] = calculateBalance(month);
        }
        return remainingBalance;
    }

    private float getAnnualInterest(){
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments(){
        return years * MONTHS_IN_YEAR;
    }
}
