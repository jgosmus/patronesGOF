public class Main {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.funcionAAdaptar();
    }
}
