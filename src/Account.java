public class Account {
    private double balance;
    private int id;
    private double annualInterestRate;

    public Account() {
        this.balance = 0.0;
        this.id = 0;
        this.annualInterestRate = 0.0;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.balance = balance;
        this.id = id;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        } else
            System.out.print("Insufficient amount");
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
}
