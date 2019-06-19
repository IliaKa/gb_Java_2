package homework_1;

import homework_1.obstacles.Obstacle;

public class Main {

    Team[]teams = new Team[4];

    teams[0] = {"Adam", "James", "Viktor", "Bob"};
    teams[1] = {"Robert", "Ruslan", "Sergey", "Dina"};
    teams[2] = {"Egor", "David", "Ludmila", "Georg"};
    teams[3] = {"Chip", "Dale", "Tom", "Jerry"};


       for (Team t : teams) {
        for (Obstacle o: obstacles) {
            o.doIt(t);
            if(!t.isOnDistance()){
                break;
            }
        }
    }

        for (Team t : teams) {
        t.info();
    }
}
