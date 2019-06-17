package homework_1;


public class Course {
    int height;
    int length;


    public void doIt(Team team) {
        team.run(length);
        team.jump(height);
        team.swim(length);
    }


}
