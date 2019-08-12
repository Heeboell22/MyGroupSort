/*
 * Denne klasse indeholder constructor for exception items. Det er 
 */
package mygroupsort;

import java.util.ArrayList;

/**
 * Inger Heebøll Gemzøe
 */
public class ExceptionItem {

    //Variables within this class
    public int Student_id; //Student_id taken in from the database
    public String StudentName; //Student Name entered by the user and then chosen from the scroll down menu
    public int exception_id;

    //Constructor for an exceptionItem
    public ExceptionItem(int sid, String stn) {
        this.Student_id = sid;
        this.StudentName = stn;
    }

}
