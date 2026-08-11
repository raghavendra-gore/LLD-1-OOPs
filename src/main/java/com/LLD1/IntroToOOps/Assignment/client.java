package IntroToOOps.Assignment;

public class client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.balance = 500.25;
        bankAccount.ownerName = "ABC";

        System.out.println(bankAccount.balance);
        System.out.println(bankAccount.ownerName);

        bankAccount.deposit(200.20);
        bankAccount.withdraw(100.30);
    }
}
