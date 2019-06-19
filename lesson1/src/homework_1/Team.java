package homework_1;

import homework_1.competitors.Competitor;
import homework_1.obstacles.Cross;
import homework_1.obstacles.Obstacle;
import homework_1.obstacles.Wall;

public class Team {

    String teamName;
    String name1;
    String name2;
    String name3;
    String name4;


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Team(String name1, String name2, String name3, String name4) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }

    ;


    public void competitionInfo() {
        for (Team t : teams) {
            for (Obstacle o : obstacles) {
                o.doIt(t);
                if (!t.isOnDistance()) {
                    break;
                }
            }
        }
    }


    public void teamInfo() {
        for (Team t : teams) {
            t.info();
        }
    }

    private void info() {
    }

    ;


}
