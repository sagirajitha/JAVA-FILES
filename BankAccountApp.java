import java.util.Scanner;

class BankAccount {

    private long accountNumber;
    private String customerName;
    private double balance;

    // Method to create account
    void createAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        if (balance < 0) {
            balance = 0;
            System.out.println("Initial balance cannot be negative.");
        }

        System.out.println("Account created successfully!");
    }

    // Method to add money
    void addMoney(Scanner sc) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to remove money
    void takeMoney(Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    // Method to display balance
    void showBalance() {
        System.out.println("--------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("--------------------------------");
    }

    // Method to display menu
    void displayMenu(Scanner sc) {
        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMoney(sc);
                    break;

                case 2:
                    takeMoney(sc);
                    break;

                case 3:
                    showBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our banking service!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}

public class BankAccountApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.println("====================================");
        System.out.println("       BANK ACCOUNT MANAGEMENT");
        System.out.println("====================================");

        account.createAccount(input);

        account.displayMenu(input);

        input.close();
    }
}