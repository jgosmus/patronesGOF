public class PlayerTiredDecorator extends PlayerDecorator {

    public PlayerTiredDecorator(Player player) {
        this.player = player;
    }

    @Override
    public void attack(int damage) {
        this.player.attack(damage/2);
    }

}
