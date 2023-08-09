import Application.CooperativeApp;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello do you want to create an account?");
        System.out.print("Enter account holder's name: ");
        String accountName = scanner.nextLine();
        System.out.print("Enter new pin: ");
        String pin = scanner.nextLine();

        CooperativeApp account = new CooperativeApp(accountName, pin);

        int choice;
        do {
            System.out.println("Hello " + accountName);
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Account Overview");
            System.out.println("5. Set Membership");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter pin: ");
                    String insertedPin = scanner.next();
                    if (account.validatePin(insertedPin))
                        account.checkBalance();
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit(Min 50,000): ");
                    double depositAmount = scanner.nextDouble();
                    account.depositFunds(depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawFunds(withdrawAmount);
                }
                case 4 -> account.displayAccountOverview();
                case 5 -> {
                    int membershipChoice;
                    do {
                        System.out.println("1. 3 months");
                        System.out.println("2. 6 months");
                        System.out.println("3. 12 months");
                        System.out.println("0. exit");
                        System.out.print("Enter membership length(Years): ");

                        membershipChoice = scanner.nextInt();

                        switch (membershipChoice) {
                            case 1 -> membershipChoice = 3;
                            case 2 -> membershipChoice = 6;
                            case 3 -> membershipChoice = 12;
                            default -> System.out.println("Invalid choice");
                        }
                        account.setMembershipLength(membershipChoice);
                    } while (membershipChoice <= 0);
                }
                case 0 -> System.out.println("Exiting the application. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
            scanner.close();
    }
}