package homework_1.obstacles;


import homework_1.competitors.Competitor;

public class Cross extends Obstacle{
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
