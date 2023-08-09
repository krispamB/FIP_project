package Application;


import java.util.Objects;

public class CooperativeApp implements AppInterface {
    int MIN_AMOUNT_INFLOW = 50_000;
    private final String accountName;
    private final String pin;
    private double accountBalance;
    private boolean collected = false;
    private int membershipLength;
    private boolean membershipLengthSet = false;
    double allowedWithdrawal = 0.0;

    public CooperativeApp(String accountName, String pin) {
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
        if (amount >= MIN_AMOUNT_INFLOW) {
            accountBalance += amount;
            System.out.println("Deposit successful. Your new balance is " + accountBalance);
        } else
            System.out.println("Deposit failed: must be above minimum amount inflow.");
    }


    @Override
    public boolean validatePin(String pin) {
     if(!Objects.equals(pin, this.pin)) {
         System.out.println("Incorrect pin, enter correct pin to complete the request");
         return false;
     }
     return true;
    }
    @Override
    public void withdrawFunds(double amount) {
        if(membershipLengthSet && accountBalance > 0 && !collected)
            allowedWithdrawal = membershipLength * accountBalance;
        System.out.println(this.allowedWithdrawal);

        if(amount <= allowedWithdrawal) {
            accountBalance -= (amount);
            collected = true;
            allowedWithdrawal -= amount;
            System.out.println("Withdrawal successful. You can't withdraw till your cycle is over");
        } else
            System.out.println("Withdrawal amount exceeds allowed limit: Membership has not been set, a deposit has not been made or your cycle isn't over  .");
    }

    @Override
    public void setMembershipLength(int months) {
        if(!membershipLengthSet) {
            this.membershipLength = months;
            membershipLengthSet = true;
            System.out.println("Membership set to " + this.membershipLength + " months");
        } else
            System.out.println("Membership has already been set.");
    }

    @Override
    public void displayAccountOverview() {
        System.out.println("\n--- Account Overview ---");
        System.out.println("Account Holder: " + accountName);
        System.out.println("Membership Length: " + membershipLength + " Years");
        System.out.println("Current Balance: " + accountBalance);
        System.out.println("Amount left to withdraw: " + allowedWithdrawal);
        System.out.println("------------  ----------\n");
    }
}
