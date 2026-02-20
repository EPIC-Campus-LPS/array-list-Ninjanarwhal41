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
        for (int i = 0; i < capacity; i++){
            if (){

            }
        }
    }

    public int getHighScore(){
        return scoreboard.getLast().getScore();
    }

    public int getAverageScore(){
        int average = 0;
        for (Score s : scoreboard){
            average += s.getScore();
        }
        return average / capacity;
    }

    public boolean break1000(){
        return scoreboard.getLast().getScore() > 1000;
        //since the last element will always be the highest
    }

    public void printLeaderboard(){
        for (int i = capacity; i > 0; i--){
            System.out.println(scoreboard);
        }
    }

    public String toString(){
        for ( int i = 0; i < capacity; i++){
            System.out.println("next time!!");
        }
        return null;
    }

    public static void main(String[] args) {
        Leaderboard board = new Leaderboard(5);

        board.addScore("ABC", 100);
        board.addScore("DEF", 200);
        board.addScore("GHI", 250);
        board.addScore("JKL", 300);
        board.addScore("MNO", 205);

        System.out.println("High Score: " + board.getHighScore());
        System.out.println("Average Score: " + board.getAverageScore());
        System.out.println("Did a player break 1000 points?: " + board.break1000());

        System.out.println("\nLeaderboard: ");
        board.printLeaderboard();

        System.out.println("\nLeaderboard: ");
        board.addScore("PQR", 150);

        board.printLeaderboard();

    }
}
