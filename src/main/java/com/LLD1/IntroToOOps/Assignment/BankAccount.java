package IntroToOOps.Assignment;

public class BankAccount {
    double balance;
    String ownerName;

    public void deposit(double amount){
        balance += amount;
        System.out.println("updated balance after deposit: "+balance);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("updated balance after withdraw: "+balance);
    }
}
