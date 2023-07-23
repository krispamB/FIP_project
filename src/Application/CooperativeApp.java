package Application;

public class CooperativeApp {
    private String accountName;
    private int pin;
    private double accountBalance;
    private int membershipLength;

    CooperativeApp(String accountName, int pin) {
        this.accountName = accountName;
        this.pin = pin;
        this.accountBalance = 0.0;
        this.membershipLength = 0;
    }


}
