public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void funcionAAdaptar() {
        System.out.println("Llamamos a la funcion adaptada");
        this.adaptee.funcionAAdaptar();
    }
}
