public class Team { private String teamName;
    private int numberOfPlayers;
    private Coach coach;

    public Team(String teamName, int numberOfPlayers, Coach coach) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
    }

    public void displayTeamInfo() {
        System.out.println("Команда: " + teamName);
        System.out.println("Кількість гравців: " + numberOfPlayers);
        System.out.println("Тренер: " + coach.getName());
    }
}

