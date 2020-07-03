import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SavingsAccountBalanceTest {
    SavingsAccountBalance savingsAccountBalance;

    @BeforeEach
    public void init() {
        savingsAccountBalance = new SavingsAccountBalance();
    }

    @Test
    public void setBalance_sumLowerThanTaxFreeLimit() {
        double balance = savingsAccountBalance.balance(10000, 1, 20000, 1, 2);
        Assertions.assertEquals(10201, balance);
    }

    @Test
    public void setBalance_sumHigherThanTaxFreeLimit() {
        double balance = savingsAccountBalance.balance(25000, 2, 20000, 1, 2);
        Assertions.assertEquals(25904.5, balance);
    }

    @Test
    public void setBalance_sumChangesHigherThanTaxFreeLimit() {
        double balance = savingsAccountBalance.balance(19800, 2, 20000, 1, 2);
        Assertions.assertEquals(20597.96, balance);
    }
}
