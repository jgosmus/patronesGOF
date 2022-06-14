public class Main {
    public static void main(String[] args) {

        Account account = new Account(1000);

        Command commandAdd = new ConcreteCommandA(account, 100);
        Command commandSubstract = new ConcreteCommandB(account, 500);

        Invoker invoker = new Invoker();
        invoker.addCommand(commandAdd);
        invoker.addCommand(commandSubstract);

        invoker.execute();
    }
}
