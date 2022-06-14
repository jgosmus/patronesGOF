public class ConcreteCommandA implements Command {

    private Account account;
    private double number;

    public ConcreteCommandA(Account account, double number) {
        this.account = account;
        this.number = number;
    }

    @Override
    public void execute() {
        this.account.add(number);
        System.out.println("Añadimos a la cuenta: " + this.number);
        System.out.println("Balance total: " + account.getBalance());
    }

    @Override
    public void undo() {
        this.account.substract(number);
    }

}
