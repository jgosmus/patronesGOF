public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void add(double number) {
        this.balance = this.balance + number;
    }

    public void substract(double number) {
        this.balance = this.balance - number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
