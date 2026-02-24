import java.util.ArrayList;

public class Leaderboard {
    private int capacity;
    private ArrayList<Score> scoreboard;

    public Leaderboard(int c){
        capacity = c;
        scoreboard = new ArrayList<Score>(capacity);
    }

    /** adds a score to the leaderboard in the correct position.
     * @param name the name that goes in a score object
     * @param score the score that goes in a score object
     */
    public void addScore(String name, int score){
        Score a = new Score(name, score);
        if(scoreboard.isEmpty()){
            scoreboard.add(a);
        }
        else{
            if(scoreboard.size() == capacity){
                scoreboard.removeLast();
                if (scoreboard.getLast().getScore() >= score){
                    scoreboard.add(a);
                }
            }
            for(int i = 0; i < scoreboard.size(); i++){
                if((score > scoreboard.get(i).getScore())){
                    scoreboard.add(i, a);
                    break;
                }
            }
        }
    }

    /** finds the highest score on the scoreboard
     * @return the first (highest) score on the scoreboard
     */
    public int getHighScore(){
        if (scoreboard.isEmpty()){
            return 0;
        }
        return scoreboard.getFirst().getScore();
    }

    /** returns the average score on the scoreboard
     * @return the average score on the scoreboard
     */
    public int getAverageScore(){
        int average = 0;
        if (scoreboard.isEmpty()){
            return 0;
        }
        for (Score s : scoreboard){
            average += s.getScore();
        }
        return average / scoreboard.size();
    }

    /** checks if a score on the scoreboard breaks 1000
     * @return true if there is a score greater than 1000
     */
    public boolean break1000(){
        if (scoreboard.isEmpty()){
            return false;
        }
        return scoreboard.getFirst().getScore() > 1000;
        //since the first element will always be the highest
    }

    /** prints each score object in scoreboard
     *
     */
    public void printLeaderboard(){
        if (scoreboard.isEmpty()){
            System.out.println("No leaderboard found!");
        }
        else{
            for (int i = 0; i < scoreboard.size(); i++){
                System.out.println(scoreboard.get(i));
            }
        }
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

        board.addScore("ELI", 1000);
        System.out.println("\nLeaderboard: ");
        board.printLeaderboard();


        board.addScore("LMNOP", 1001);
        board.addScore("QRSTU", 275);
        System.out.println("Did a player break 1000 points?: " + board.break1000());

        System.out.println("\nLeaderboard: ");
        board.printLeaderboard();
    }
}
