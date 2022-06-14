public class Connection {

    private static Connection connection;


    private String state;

    // Ponemos el constructor privado para que no se pueda crear una instancia con new
    private Connection() {
        this.state = "Connected";
    }

    public static Connection getInstance() {
        if(connection == null) {
            connection = new Connection();
        }

        return connection;
    }

    public String getState() {
        return state;
    }
}
