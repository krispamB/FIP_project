
# Cooperative Application

The Cooperative Application is a Java-based console application designed to simulate basic cooperative banking operations. It allows users to open and manage accounts, perform transactions, and review their account status. This README provides an overview of the application's features, how to set it up, and how to use it effectively.

## Objective

You are expected to create a simple cooperative application with simple operations to perform the following functions:
- Open/Register Account.
- Check Balance of account holder
- Deposit funds
- Withdrawal based on length of membership of account holder (Current Balance or Less than Current Balance or Overdraft)
- Account Overview.
- Exit, etc.

Furthermore, there should be a validation to allow only a particular amount of cash inflows (high amounts of cash is not allowed) and withdrawals at any time.

## Features

- Opening and managing cooperative accounts.
- Checking account balances.
- Depositing funds into accounts.
- Withdrawing funds based on membership length.
- Setting the membership length.
- Displaying a detailed account overview.

## Prerequisites

- Java Development Kit (JDK) installed.

## Setup

1. Clone this repository to your local machine.
2. Compile the Java source files using the command: `javac *.java`
3. Run the application using the command: `java CooperativeApp`

## Usage Example

1. Create an instance of `CooperativeApp` by running the application.
2. Follow the console prompts to perform account operations:
    - Deposit funds.
    - Set membership length.
    - Withdraw funds.
    - Check balance.
    - Display account overview.

## Considerations and Future Enhancements

- Data Persistence: Currently, the application does not database for data storage. You might consider using a database for storing users, transactions and accounts for production applications.
- Security: For real-world usage, implement proper user authentication and authorization mechanisms.
- Error Handling: Enhance error handling to provide better feedback to users and handle edge cases gracefully.
- UI Improvement: Consider developing a graphical user interface (GUI) for a more user-friendly experience.

## Conclusion

The Cooperative Application demonstrates fundamental cooperative banking operations using Java. Refer to this README for setting up the application, using its features, and potential improvements. This project serves as a foundation for building more advanced banking systems with extended functionalities and enhanced security measures.
