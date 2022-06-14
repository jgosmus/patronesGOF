public class Main {

    public static void main(String[] args) {

        AbstractClass algoritmo1 = new ConcreteClass1();
        algoritmo1.TemplateMethod();

        AbstractClass algoritmo2 = new ConcreteClass2();
        algoritmo2.TemplateMethod();
    }
}
