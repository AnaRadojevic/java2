package main;

import computer.Computer;
import cours.Cours;
import student.Student;

public class main {

    
    public static void main(String[] args) {
      Student studentAna = new Student();
      studentAna.info();
      Student student2 = new Student("Igor", "Radojevic", 2018);
      student2.info();
      
      Cours coursQA = new Cours("QA kurs", 10);
      coursQA.info();
      Computer computer1 = new Computer(3.4, 7, 376);
      computer1.info();
      
      Student student3 = new Student("jovan", "jovanovic", 1999, coursQA, computer1);
      student3.info();
      
      
    }
    
}
