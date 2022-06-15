import java.util.concurrent.TimeUnit;

public class RealSubject implements Subject {

    @Override
    public void show() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm the real subject");
    }
}
