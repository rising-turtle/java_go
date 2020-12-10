package hz;

import java.text.NumberFormat;
import java.util.Scanner;

import static hz.Console.readNumber;

public class Main {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        readNumber("", 1000, 500 );
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        var morgageCalculator = new MortgageCaculator( principal, annualInterest, years);
        var morgageReporter = new MortgageRep orter(morgageCalculator);

        morgageReporter.printMortgage();
        morgageReporter.printPaymentSchedule();
    }

}

