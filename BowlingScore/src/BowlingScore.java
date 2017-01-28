/**
 * Created by dhoy on 1/27/17.
 */
public class BowlingScore {

    public int ScoreGame(String rolls) {
        int score = 0;
        int rollIndex = 0;

        int frameCount = 0;
        while (frameCount < 10) {
            // Check for strike
            if (rolls.charAt(rollIndex) == 'X') {
                score += ScoreRoll(rolls.charAt(rollIndex));
                // Bonus rolls
                // Check if spare and skip roll and count spare as 10
                if (rolls.charAt(rollIndex + 2) != '/') {
                    score += ScoreRoll(rolls.charAt(rollIndex + 1));
                }
                score += ScoreRoll(rolls.charAt(rollIndex + 2));
                rollIndex++;
            }
            // Check for spare
            else if (rolls.charAt(rollIndex + 1) == '/') {
                // Skip roll and count spare as 10
                score += ScoreRoll(rolls.charAt(rollIndex + 1));
                // Bonus roll
                score += ScoreRoll(rolls.charAt(rollIndex + 2));
                // Next frame
                rollIndex += 2;
            }
            // Regular frame
            else {
                score += ScoreRoll(rolls.charAt(rollIndex));
                score += ScoreRoll(rolls.charAt(rollIndex + 1));
                // Next frame
                rollIndex += 2;
            }
            frameCount++;
        }
        return score;
    }

    public int ScoreRoll(char roll) {
        int score;
        switch (roll) {
            case 'X':
            case '/':
                score = 10;
                break;
            case '-':
                score = 0;
                break;
            default:
                score = Character.getNumericValue(roll);
                break;
        }
        return score;
    }
}
