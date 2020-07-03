
public class SavingsAccountBalance {
    public double balance(double openingSum, double interestRate, double taxFreeLimit, double taxRate, int numMonths) {
        double balance = openingSum;
        for (int i = 0; i < numMonths; ++i) {
            double interest = (balance * interestRate) / 100 ;
            double monthlyTax = 0;
            if(balance > taxFreeLimit) {
                monthlyTax = (balance - taxFreeLimit) / 100;
            }
            balance += interest - monthlyTax;
        }
        return balance;
    }
}
