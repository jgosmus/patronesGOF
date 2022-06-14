public class ConcreteCommandB implements Command {

    private Account account;
    private double number;

    public ConcreteCommandB(Account account, double number) {
        this.account = account;
        this.number = number;
    }

    @Override
    public void execute() {
        this.account.substract(number);
        System.out.println("Restamos a la cuenta: " + this.number);
        System.out.println("Balance total: " + account.getBalance());
    }

    @Override
    public void undo() {
        this.account.add(number);
    }
}
