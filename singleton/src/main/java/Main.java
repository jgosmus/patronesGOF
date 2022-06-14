public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        // Aqui se comprueba que la referencia a la memoria es la misma en los 3 casos puesto que es el mismo objeto
        System.out.println(connection);
        System.out.println(connection1);
        System.out.println(connection2);
    }
}
