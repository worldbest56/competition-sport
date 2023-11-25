
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Competitor Class
 * @author Uche Ebuka Anaele
 */
public abstract class Competitor {

    private Name competitorName;
    private String level;
    private String dob;
    private int age;
    private String country;
    private String email;
    private String phone;
    private String category;
    private int competitorNumber;
    protected int[] scores;
    
    private String gender;

    /**
     * Constructs a Competitor object with the specified attributes.
     *
     * @param competitorNo The unique identifier for the competitor.
     * @param competitorName The name of the competitor (first and last).
     * @param level The skill level of the competitor.
     * @param dob The date of birth of the competitor.
     * @param country The country of origin for the competitor.
     * @param email The email address of the competitor.
     * @param phone The phone number of the competitor.
     * @param category The competition category the competitor belongs to.
     * @param gender
     */
    public Competitor(int competitorNo, Name competitorName, String level,
            String dob, String country, String email, String phone, String category,String gender) {
        this.competitorNumber = competitorNo;
        this.competitorName = competitorName;
        this.level = level;
        this.dob = dob;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.category = category;
        this.gender = gender;
        
        scores = new int[5];
    }
    
    
    /**
     * Constructor Overloading.This constructor
 takes the option of age where DOB is not available
     * @param competitorNo
     * @param competitorName
     * @param level
     * @param country
     * @param email
     * @param phone
     * @param category
     * @param gender
     * @param age 
     */
    public Competitor(int competitorNo, Name competitorName, String level, 
            String country, String email, String phone, String category,String gender, int age) {
        this.competitorNumber = competitorNo;
        this.competitorName = competitorName;
        this.level = level;
        dob = null;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.category = category;
        this.age = age;
        this.gender = gender;
        
        scores = new int[5];
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
      
    // Getters and Setters
    public int getCompetitorNumber() {
        return competitorNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getLevel() {
        return level;
    }

    public int[] getScores() {
        return scores;
    }

    /**
     * This method takes an array of integers, sorts it in ascending order, 
     * and then calculates the sum of all elements except the first and last elements 
     * (which are the lowest and highest scores). 
     * it then calculates and returns the average by dividing the sum by the 
     * number of elements minus 2.
     * @return 
     */
    public double getOverallScore() {
        return this.calculateOverallScore();
    }
    
    public int[] getScoreArray(){
        return this.scores;
    }
    
    public void setScoreArray(int[] scor){
        this.scores = scor;
    }

    public abstract double calculateOverallScore();

    public abstract String getDetails();

    // Get full details as a String
    public String getFullDetails() {
        // Parse the date of birth string to a LocalDate object
        if(this.dob != null){
            LocalDate dob1 = LocalDate.parse(this.getDob(), DateTimeFormatter.ISO_LOCAL_DATE);
            // Calculate the difference between the current date and date of birth
            Period period = Period.between(dob1, LocalDate.now());
            // Extract years from the period
            age = period.getYears();
        }
        StringBuilder details = new StringBuilder();
         details.append("Competitor number ").append(competitorNumber)
                .append(", name ")
                .append(competitorName.toString())
                .append(", country ")
                .append(country)
                .append(".\n")
                .append(competitorName.getFirstname()).append(" is a ").append(level).append(" aged ").append(age).append("  and has an overall score of ")
                .append(Arrays.toString(scores)).append("\n")
                .append("This gives him an overall score of ").append(getOverallScore()).append(".\n");

        return details.toString();
    }

    // Get short details as a String
    public String getShortDetails() {
        return "CN " + competitorNumber + " (" + getInitials() + ") has overall score " + getOverallScore() + ".\n";
    }

    public void setCompetitorNumber(int competitorNumber) {
        this.competitorNumber = competitorNumber;
    }

    // Helper method to get initials
    private String getInitials() {
        Name nm = this.getCompetitorName();
        String firstChar = "";
        String mChar = "";
        String sChar = "";
        
        if(!"".equals(nm.getFirstname())){
            firstChar = ""+nm.getFirstname().charAt(0);
            
        }
        
        if(!"".equals(nm.getMiddle())){
            
            mChar = ""+nm.getMiddle().charAt(0);
            
        }
        if(!"".equals(nm.getSurname())){
            
            sChar = ""+nm.getSurname().charAt(0);
        }

        String initials = firstChar+mChar+sChar;
        return initials.toUpperCase();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Name getCompetitorName() {
        return competitorName;
    }

    public void setCompetitorName(Name competitorName) {
        this.competitorName = competitorName;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void updateCompetitorDetails(String details) {

    }

}
