public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            String rolls = args[0];

            BowlingScore bowlingScore = new BowlingScore();
            int score = bowlingScore.ScoreGame(rolls);
            System.out.println(score);
        }
    }
}
