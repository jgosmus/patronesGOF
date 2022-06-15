public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();

        Subject proxy = new Proxy(subject);

        proxy.show();

    }
}
