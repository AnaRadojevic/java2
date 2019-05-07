package student;

import computer.Computer;
import cours.Cours;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Cours cours;
    private Computer computer;

    public Student() {
        this.firstName = "-";
        this.lastName = "-";
        this.yearOfBirth = 0;
        this.computer = new Computer();
        this.cours = new Cours();

    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.computer = new Computer();
        this.cours = new Cours();

    }

    public Student(String jovan, String jovanovic, int i, Cours coursQA, Computer computer1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cours getCours() {
        return this.cours;
    }

    public Computer getComputer() {
        return this.computer;
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
        System.out.println("First namr: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Computer, hard drive: " + getComputer().getHardDrive());
        System.out.println("Computer, memory: " + getComputer().getMemory());
        System.out.println("Computer,tact: " + getComputer().getTact());

        System.out.println("Cours,name: " + getCours().getName());
        System.out.println("Cours,number of class: " + getCours().getNumberOfClasess());

    }

}
