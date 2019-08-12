package mygroupsort;

/**
 * The class Student impelments a student with an id, a name, a class, a
 * subject, and a signifier for if the student has been sorted into a group or
 * not.
 */
import java.util.Scanner;

public class Student {

    int student_id;
    String student_name;
    String Class;
    boolean presence;
    String subject; //Er usikker på, om den skal stå her, eller om den evt skal være en arrayliste???
    boolean sorted;

    //Constructor for the Student object
    public Student(int student_id, String student_name, String Class, boolean presence, boolean sorted) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.Class = Class;
        presence = true;
        sorted = false;
    }

    //Method setting presence to false
    public void setPresenceAbsent(boolean presence) {
        this.presence = false;
    }

    //Method for getting til value of precence for the student objects
    public boolean getPresence() {
        return this.presence;
    }

    //Method for setting the student_name:
    public void setStudent_name(String student_name) {
        Scanner scan = new Scanner(System.in);
        this.student_name = scan.nextLine();
    }

    //Method getting the student_name:
    public String getStudent_name(String student_name) {
        return this.student_name;
    }

    //Method for getting student_id:
    public int getStudent_id(int student_id) {
        return this.student_id;
    }

    //Method for setting the name of the class:
    public void setClass(String Class) {
        this.Class = Class;
    }

    //Method for getting the name of the class:
    public String getClass(String Class) {
        return this.Class;
    }

    // Method for getting the student ID from the database... 
    // Method for getting userimput and ascribe it to the variable
    //Method for transferring user imput to the database
}
