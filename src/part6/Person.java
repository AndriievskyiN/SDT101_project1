package part6;
import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public static final int COMING_OF_AGE = 18;

    // Constructors
    Person(){
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    // create method printPersonInfo for formatted console output of instance fields
    public void printPersonInfo(){
        String isAdult = isAdult() ? "is adult" : "is not adult";
        System.out.println(lastName + " " + firstName  + " was born in " + birthYear + " and " + isAdult);
    }

    // create method isAdult() which returns true if person is adult on the base of comparison calculated age and COMING_OF_AGE constant
    public boolean isAdult(){
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int curAge = currentYear - birthYear;

        return curAge >= COMING_OF_AGE;
    }


}








