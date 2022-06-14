public class Context {

    State stateA;
    State stateB;

    State state;

    public Context() {
        this.stateA = new ConcreteStateA(this);
        this.stateB = new ConcreteStateB(this);

        this.state = this.stateA;
    }

    public void Handle() {
        this.state.Handle();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getStateA() {
        return stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public State getState() {
        return state;
    }


}
