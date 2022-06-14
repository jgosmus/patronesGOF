public class Main {
    public static void main(String[] args) {
        User user = new LuisjeBuilder().name("Luisje").age(999).surname("perro").build();
        User user1 = new AdminBuilder().name("Rafa").build();

        System.out.println(user);
        System.out.println(user1);
    }
}
