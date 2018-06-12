public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000.00, 4.5);
        acc.withdraw(2500.00);
        acc.deposit(3000.00);
        System.out.println("Balance = " + acc.getBalance());
        System.out.println("Monthly Interest = " + acc.getBalance() * (acc.getAnnualInterestRate() / 100 / 12));
    }
}
