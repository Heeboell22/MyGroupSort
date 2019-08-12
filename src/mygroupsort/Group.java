package mygroupsort;

import java.util.Collection;
import java.util.HashSet;

/**
Det der står her skal være en 'opskrift' på et gruppe-objekt (uafhængigt af, hvor mange elever, der skal være i gruppen).
 */
public class Group {

/* Collection er en generisk klasse (egentlig ligesom ArrayListe), da den simpelthen refererer til en samling af 'noget'. 
    Her er noget defineret som værende Student (det vil sige det referer til objekter, der defineres i student-klassen), 
    og denne samling kaldes her groupMembers*/
    private Collection<Student> groupMembers;

 //Constructor for Group objects: Denne constructor for collection objektet indeholder et hashset og dermed et index.
    public Group(Collection<Student> inputStudents) {
        groupMembers = inputStudents;
    }
    
    public void addStudentToGroup(Student student){
        groupMembers.add(student);
    }

    //getter for group_size (det vil sige antallet af medlemmer):
    public int size() {
        return this.groupMembers.size();
    }
}
