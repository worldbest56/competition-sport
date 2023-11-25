
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompetitorList {

    private ArrayList<Competitor> competitors;

    // Constructor
    public CompetitorList() {
        this.competitors = new ArrayList<>();
    }

    // Add competitor to the list
    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

    // Read competitors' details from a CSV file
    public void readCompetitorsFromCSV(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] cmpline = line.trim().split(",");
                addCompetitor(this.parseCompetitorFromCSVLine(cmpline));

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CompetitorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CompetitorList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(CompetitorList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Generate a final report and write it to a text file
    public void generateFinalReport(String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            // Table of competitors with full details
            writer.println("Competitors Table:");
            writer.println("Competitor No.\tName\t\t\tLevel\tCountry\tOverall Score");
            for (Competitor competitor : competitors) {
                writer.println(competitor.getCompetitorNumber() + "\t\t\t"
                        + competitor.getCompetitorName() + "\t"
                        + competitor.getLevel() + "\t"
                        + competitor.getCountry() + "\t"
                        + competitor.getOverallScore());
            }

            // Details of the competitor with the highest overall score
            writer.println("\nCompetitor with the Highest Overall Score:");
            Competitor highestScorer = getCompetitorWithHighestScore();
            writer.println(highestScorer.getFullDetails());

            // Four other summary statistics
            // You need to implement the logic for your chosen summary statistics
            // Frequency report
            writer.println("\nFrequency Report:");
            writer.println("Score\tFrequency");
            for (int i = 1; i <= 5; i++) {
                writer.println(i + "\t\t" + getFrequencyForScore(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get details for a competitor with a specific competitor number
    public String getCompetitorDetails(int competitorNumber) {
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == competitorNumber) {
                return competitor.getShortDetails();
            }
        }
        return "Competitor not found.";
    }
    
    
    public int [] getCompetitorScores(int competitorNumber){
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == competitorNumber) {
                return competitor.getScores();
            }
        }
        return null;
    }
    
    public ArrayList<Competitor> getCompetitors(){
        return competitors;
    }

    
    private Competitor getCompetitorWithHighestScore() {
        if (competitors.isEmpty()) {
            return null; 
        }

        Competitor highestScorer = competitors.get(0);

        for (Competitor competitor : competitors) {
            if (competitor.getOverallScore() > highestScorer.getOverallScore()) {
                highestScorer = competitor;
            }
        }

        return highestScorer;
    }

    // Helper method to get the frequency of a specific score
    private int getFrequencyForScore(int score) {
        int frequency = 0;
        for (Competitor competitor : competitors) {
            for (int competitorScore : competitor.getScores()) {
                if (competitorScore == score) {
                    frequency++;
                }
            }
        }
        return frequency;
    }

    private Competitor parseCompetitorFromCSVLine(String[] cmpline) {

        int competitorNo = Integer.parseInt(cmpline[0]);
        String cmpName = cmpline[1];
        String[] cmpNames = cmpName.trim().split(" ");
        String fName = "";
        String mName = "";
        String surName = "";

        if (cmpNames.length > 0) {
            switch (cmpNames.length) {
                case 1:
                    //only first name is provided
                    fName = cmpNames[0];
                    break;
                case 2:
                    //first and middle name provided
                    fName = cmpNames[0];
                    mName = cmpNames[1];
                    break;
                case 3:
                    fName = cmpNames[0];
                    mName = cmpNames[1];
                    surName = cmpNames[2];
                    break;
                default:
                    break;
            }

        }

        String cmpAge = cmpline[2];
        int age = Integer.parseInt(cmpAge);
        String cmpGender = cmpline[3];
        String country = cmpline[4];
        int cmpScore1 = Integer.parseInt(cmpline[5]);
        int cmpScore2 = Integer.parseInt(cmpline[6]);
        int cmpScore3 = Integer.parseInt(cmpline[7]);
        int cmpScore4 = Integer.parseInt(cmpline[8]);
        int[] scores = {cmpScore1, cmpScore2, cmpScore3, cmpScore4};
        Name competitorName = new Name(fName, mName, surName);
        Competitor competitor = new IceSkaterCompetitor(competitorNo, competitorName, "", country, "", "", "", cmpGender, age);
        competitor.setScoreArray(scores);

        return competitor;
    }

    void updateScores(int cmpNo, int[] newScores) {
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == cmpNo) {
                competitor.setScoreArray(newScores);
            }
        }
    }

    void updateCompetitorDetails(int compNo, String[] newDetails) {
        
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == compNo) {
                Name cpmName = new Name(newDetails[0],newDetails[1], newDetails[2] );
                competitor.setCompetitorName(cpmName);
                competitor.setAge(Integer.parseInt(newDetails[4]));
                competitor.setGender(newDetails[5]);
                competitor.setCountry(newDetails[3]);
            }
        }
       
        
    }
}
