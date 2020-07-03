public class Main {
    public static void main(String[] args) {
        Time time = new Time(1, 30, 59);
        System.out.println(time.timeString());

        LongestSequence longestSequence = new LongestSequence();
        System.out.println(longestSequence.longestSequence("dghhhmhmx").toString());

        SecondLowestFrequency secondLowestFrequency = new SecondLowestFrequency();
        System.out.println(secondLowestFrequency.secondLowest(new int[]{4, 3, 1, 1, 2}));

        SavingsAccountBalance savingsAccountBalance = new SavingsAccountBalance();
        savingsAccountBalance.balance(10000, 1, 20000, 1, 2);
    }
}
