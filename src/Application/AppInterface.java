package Application;

public interface AppInterface {
    boolean validatePin(String pin);
    void checkBalance();
    void depositFunds(double amount);
    void withdrawFunds(double amount);
    void setMembershipLength(int months);
    void displayAccountOverview();
}
