public class ConcreteStateB implements State {

    private Context context;

    public ConcreteStateB(Context context) {
        this.context = context;
    }

    @Override
    public void Handle() {
        this.context.setState(this.context.getStateA());
    }

    @Override
    public String toString() {
        return "ConcreteStateB{" +
                "context=" + context +
                '}';
    }
}
