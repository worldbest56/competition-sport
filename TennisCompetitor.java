
import java.util.Arrays;


public class TennisCompetitor extends Competitor {

    /**
     * Called when DOB is provided
     * @param competitorNo
     * @param competitorName
     * @param level
     * @param dob
     * @param country
     * @param email
     * @param phone
     * @param category 
     * @param gender 
     */
    public TennisCompetitor(int competitorNo, Name competitorName, 
            String level, String dob, String country, String email,
            String phone, String category ,String gender) {
        super(competitorNo, competitorName, level, dob, country, email, phone, category, gender);
    }
    
    /**
     * Called when DOB is not provided, but 
     * age is provided as an int
     * @param competitorNo
     * @param competitorName
     * @param level
     * @param age
     * @param country
     * @param email
     * @param phone
     * @param category 
     * @param gender 
     */
    public TennisCompetitor(int competitorNo, Name competitorName, 
            String level,  String country, String email,
            String phone, String category, String gender, int age) {
        super(competitorNo, competitorName, level, country, email, phone, category,gender,age);
    }

    @Override
    public double calculateOverallScore() {
        if (scores.length < 3) {
            throw new IllegalArgumentException("Array should have at least three elements");
        }

        // Sort the array in ascending order
        Arrays.sort(scores);

        // Calculate the sum excluding the first and last elements
        int sum = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            sum += scores[i];
        }

        // Calculate the average
        return (double) sum / (scores.length - 2);
    }

    @Override
    public String getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
