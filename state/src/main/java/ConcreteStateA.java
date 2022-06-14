public class ConcreteStateA implements State {

    private Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void Handle() {
        this.context.setState(this.context.getStateB());
    }

    @Override
    public String toString() {
        return "ConcreteStateA{" +
                "context=" + context +
                '}';
    }
}
