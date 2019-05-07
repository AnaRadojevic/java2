
package student;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    public Student(){
    this.firstName = "-";
    this.lastName = "-";
    this.yearOfBirth=0;
    
    
    }
    public Student(String firstName, String lastName, int yearOfBirth ){
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth=yearOfBirth;
    
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    
    public void info() {
        System.out.println("Terenutni program je: " + getFirstName());
        System.out.println("Zvuk je: " + getLastName());
        System.out.println("Ukljuceno: " + getYearOfBirth());
    }
    
}
