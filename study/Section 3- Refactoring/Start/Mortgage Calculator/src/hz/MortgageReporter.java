package hz;

import java.text.NumberFormat;

public class MortgageReporter {

    private MortgageCaculator calculator;
    private final NumberFormat currency = NumberFormat.getCurrencyInstance();

    public MortgageReporter(MortgageCaculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for(var balance : calculator.getRemainingBalance())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }

}
