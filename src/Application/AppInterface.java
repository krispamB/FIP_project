package Application;

public interface AppInterface {
    void checkBalance();
    void depositFunds(double amount);
    void withdrawFunds(double amount);
    void setMembershipLength(int years);
    void displayAccountOverview();
}
