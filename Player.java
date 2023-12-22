public class Player {private String playerName;
    private int playerNumber;
    private int goalsScored;

    public Player(String playerName, int playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.goalsScored = 6;
    }

    public void scoreGoal() {
        goalsScored++;
        System.out.println(playerName + " забив гол! Всього голів: " + goalsScored);
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public String getPlayerName() {
        return playerName;
    }



}
