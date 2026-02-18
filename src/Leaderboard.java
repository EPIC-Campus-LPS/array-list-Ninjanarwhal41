import java.util.ArrayList;

public class Leaderboard {
    private int capacity;
    private ArrayList<Score> scoreboard;

    public Leaderboard(int c){
        capacity = c;
        scoreboard = new ArrayList<Score>(capacity);
    }

    public void addScore(String name, int score){
        Score e = new Score(name, score);
        scoreboard.add(e);
    }

    public int getHighScore(){
        return 0;
    }

    public int getAverageScore(){
        return 0;
    }

    public boolean break1000(){
        return false;
    }

    public void printLeaderboard(){
        System.out.println("Placeholder");
    }
}
