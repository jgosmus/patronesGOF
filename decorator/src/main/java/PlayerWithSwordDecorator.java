public class PlayerWithSwordDecorator extends PlayerDecorator {

    public PlayerWithSwordDecorator(Player player) {
        this.player = player;
    }

    @Override
    public void attack(int damage) {
        this.player.attack(damage*5);
    }

}
