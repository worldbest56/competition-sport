
public class Name {
    
    private String firstname;  
    private String middle;
    private String surname ;

    public Name(String firstname, String middle, String surname) {
        this.firstname = firstname;
        this.middle = middle;
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return firstname + " " + middle  + " " + surname ;
    }
    
    
    
}
