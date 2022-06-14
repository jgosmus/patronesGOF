public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context.getState());
        context.Handle();
        System.out.println(context.getState());
        context.Handle();
        System.out.println(context.getState());
        context.Handle();
        System.out.println(context.getState());
    }
}
