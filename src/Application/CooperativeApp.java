package Application;


public class CooperativeApp implements AppInterface {
    int MAX_AMOUNT_INFLOW = 100_000;
    double TRANSACTION_CHARGE = 4.50;
    private String accountName;
    private int pin;
    private double accountBalance;
    private int membershipLength;
    private double withdrawalLimit = 0.1;

    CooperativeApp(String accountName, int pin) {
        this.accountName = accountName;
        this.pin = pin;
        this.accountBalance = 0.0;
        this.membershipLength = 0;
    }


    @Override
    public void checkBalance() {
        System.out.println("Account holder: " + accountName);
        System.out.println("Account balance: " + accountBalance);
    }

    @Override
    public void depositFunds(double amount) {
        if (amount <= MAX_AMOUNT_INFLOW) {
            accountBalance += amount;
            System.out.println("Deposit successful. Your new balance is " + accountBalance);
        } else
            System.out.println("Deposit failed. Cash inflow amount exceeds limit.");
    }

    @Override
    public void withdrawFunds(double amount) {
        double allowedWithdrawal = withdrawalLimit * accountBalance;
        if(amount <= allowedWithdrawal) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Your new balance is " + accountBalance);
        } else
            System.out.println("Withdrawal amount exceeds allowed limit.");
    }

    @Override
    public void setMembershipLength(int years) {
        this.membershipLength = years;
        withdrawalLimit = withdrawalLimit + (withdrawalLimit * membershipLength);
    }

    @Override
    public void displayAccountOverview() {
        System.out.println("\n--- Account Overview ---");
        System.out.println("Account Holder: " + accountName);
        System.out.println("Membership Length: " + membershipLength + " Years");
        System.out.println("Current Balance: " + accountBalance);
        System.out.println("------------------------\n");
    }
}
