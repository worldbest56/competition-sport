
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * The CompetitorModel class represents the model for handling competitor data.
 */
public class CompetitorModel {

    // Instance variable to store the CompetitorList
    private CompetitorList competitorList;

    /**
     * Constructor for CompetitorModel class.
     *
     * @param competitorList The CompetitorList object to be associated with the
     * model.
     */
    public CompetitorModel(CompetitorList competitorList) {
        this.competitorList = competitorList;
    }

    /**
     * Retrieves competitor data in a two-dimensional array format.
     *
     * @return Object[][] representing the competitor data.
     */
    public Object[][] getCompetitorData() {
        ArrayList<Competitor> competitors = competitorList.getCompetitors();
        Object[][] data = new Object[competitors.size()][6];

        for (int i = 0; i < competitors.size(); i++) {
            Competitor competitor = competitors.get(i);
            data[i][0] = competitor.getCompetitorNumber();
            data[i][1] = competitor.getCompetitorName().toString();
            data[i][2] = competitor.getAge();
            data[i][3] = competitor.getGender();
            data[i][4] = competitor.getCountry();
            data[i][5] = competitor.getOverallScore();
        }

        return data;
    }

    /**
     * Retrieves column names for the competitor data.
     *
     * @return Object[] representing the column names.
     */
    public Object[] getColumnNames() {
        return new Object[]{"No", "Name", "Age", "Gender", "Country", "Overall Score"};
    }

    /**
     * Retrieves details of a specific competitor based on the competitor
     * number.
     *
     * @param competitorNumber The unique identifier for the competitor.
     * @return String representing the details of the specified competitor.
     */
    public String getCompetitorDetails(int competitorNumber) {
        return competitorList.getCompetitorDetails(competitorNumber);
    }

    /**
     * Retrieves the scores of a specific competitor based on the competitor
     * number.
     *
     * @param cmpNo The unique identifier for the competitor.
     * @return int[] representing the scores of the specified competitor.
     */
    public int[] getCompetitorScores(int cmpNo) {
        return competitorList.getCompetitorScores(cmpNo);
    }

    /**
     * Saves competitor data to a CSV file.
     */
    public void saveDataToFile() {
        String filePath = "RunCompetitor.csv";
        ArrayList<Competitor> competitors = competitorList.getCompetitors();
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            // Writing header line (commented out as not required in this case)
            //writer.println("CompetitorNo,FirstName,MiddleName,SurName,Age,Gender,Country,Score1,Score2,Score3,Score4");

            // Writing data for each competitor
            for (Competitor competitor : competitors) {
                StringBuilder line = new StringBuilder();
                line.append(competitor.getCompetitorNumber()).append(",");
                line.append(competitor.getCompetitorName().getFirstname()).append(",");
                line.append(competitor.getCompetitorName().getMiddle()).append(",");
                line.append(competitor.getCompetitorName().getSurname()).append(",");
                line.append(competitor.getAge()).append(",");
                line.append(competitor.getGender()).append(",");
                line.append(competitor.getCountry()).append(",");

                int[] scores = competitor.getScores();
                for (int i = 0; i < scores.length; i++) {
                    line.append(scores[i]);
                    if (i < scores.length - 1) {
                        line.append(",");
                    }
                }

                writer.println(line.toString());
            }

            System.out.println("Data saved to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Updates the scores of a specific competitor.
     *
     * @param competitor The unique identifier for the competitor.
     * @param newScores The new scores to be assigned to the competitor.
     */
    void updateScores(int competitor, int[] newScores) {
        this.competitorList.updateScores(competitor, newScores);
    }

    /**
     * Updates the details of a specific competitor.
     *
     * @param compNo The unique identifier for the competitor.
     * @param newDetails The new details to be assigned to the competitor.
     */
    void updateDetails(int compNo, String[] newDetails) {
        this.competitorList.updateCompetitorDetails(compNo, newDetails);
    }
}
