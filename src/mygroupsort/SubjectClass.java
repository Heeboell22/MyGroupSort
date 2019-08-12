/*
 Subject skal gøre det muligt at kopiere en liste over elever...
 */
package mygroupsort;

import java.util.Scanner;

/**
 * Hvad skal Subject objekter egentlig indeholde?
 *
 * @author Bruger
 */
public class SubjectClass {

    int subject_id;
    String subject_name;

//constructor for Subject objekter:
    public SubjectClass(int subject_id, String subject_name) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
    }

//setter for Subject_name:
    public void setSubject_name(String subject_name) {
        Scanner scan = new Scanner(System.in);
        this.subject_name = scan.nextLine();
    }

//getter for Subject_name:
    //Method getting the student_name:
    public String getSubject_name(String subject_name) {
        return this.subject_name;
    }
}
