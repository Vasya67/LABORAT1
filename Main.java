public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Шовковськй", 40);


        Player player1 = new Player("Ярмоленко", 7);
        Player player2 = new Player("Буяльський", 10);
        Player player3 = new Player("Шапаренко", 22);


        player1.scoreGoal();
        player2.scoreGoal();
        player2.scoreGoal();
        player3.scoreGoal();
        player3.scoreGoal();
        player3.scoreGoal();


        Team team = new Team("Динамо", 11, coach);

        team.displayTeamInfo();

        System.out.println(player1.getPlayerName() + " забив " + player1.getGoalsScored() + " голів.");
        System.out.println(player2.getPlayerName() + " забив " + player2.getGoalsScored() + " голів.");
        System.out.println(player3.getPlayerName() + " забив " + player3.getGoalsScored() + " голів.");
    }
}

