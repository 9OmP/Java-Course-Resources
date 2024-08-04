public class Player_Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        Enhanced_Player enhancedPlayer1 = new Enhanced_Player("Om", 200, "Belt");
        System.out.println("Initial health is "+ enhancedPlayer1.healthRemaining());

        Enhanced_Player enhancedPlayer2 = new Enhanced_Player("Tim");

    }

}
