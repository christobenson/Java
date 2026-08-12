package module1;
import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        BankAccount account = new BankAccount(accNo, holder, bal);
        System.out.println("Initial Account Details:");
        account.displayDetails();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Updated Account Details:");
        account.displayDetails();
        sc.close();
    }
}
