public class MethodChallenge {
    public static void main(String[] args) {
        byte position = highScorePosition(1500);
        displayHighScorePosition("Om", position);

        position = highScorePosition(999);
        displayHighScorePosition("Amey", position);

        position = highScorePosition(499);
        displayHighScorePosition("Raj", position);

        position = highScorePosition(99);
        displayHighScorePosition("Rahul", position);

        position = highScorePosition(-1000);
        displayHighScorePosition("Omkar", position);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.print(playerName + " managed to get into position " + highScorePosition + " on the highscore list.\n");
    }

    public static byte highScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;   
    }
}

