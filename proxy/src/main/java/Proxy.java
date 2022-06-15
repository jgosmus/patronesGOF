public class Proxy implements Subject {

    private Subject subject;
    private int counter;

    public Proxy(Subject subject) {
        this.subject = subject;
        this.counter = 0;
    }

    @Override
    public void show() {
        counter++;
        System.out.println("I'm the proxy calling the real subject...");
        this.subject.show();
    }

    public void showCounter() {
        System.out.println(this.counter);
    }
}
