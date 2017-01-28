import junit.framework.TestCase;

/**
 * Created by dhoy on 1/27/17.
 */
public class BowlingScoreTest extends TestCase {

    BowlingScore bowlingScore = new BowlingScore();

    public void testScoreGame() throws Exception {
        int score;

        score = bowlingScore.ScoreGame("XXXXXXXXXXXX");
        assertEquals(300, score);

        score = bowlingScore.ScoreGame("9-9-9-9-9-9-9-9-9-9-");
        assertEquals(90, score);

        score = bowlingScore.ScoreGame("5/5/5/5/5/5/5/5/5/5/5");
        assertEquals(150, score);

        score = bowlingScore.ScoreGame("X7/9-X-88/-6XXX81");
        assertEquals(167, score);
    }

    public void testScoreRoll() throws Exception {

    }
}