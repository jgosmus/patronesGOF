public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Player playerWithSwordDecorator = new PlayerWithSwordDecorator(player);
        Player playerWithSwordDecorator1 = new PlayerWithSwordDecorator(playerWithSwordDecorator);
        Player playerTiredDecorator = new PlayerTiredDecorator(playerWithSwordDecorator1);
        playerTiredDecorator.attack(100);
    }
}
