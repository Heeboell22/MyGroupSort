package mygroupsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/*Det denne klasse skal genererere de ønskede grupper ud fra den gældende konfiguration.
*/ 

public class GroupGenerator {
    
    private GroupGeneratorConfiguration currentConfiguration;
    
    public void GroupGenerator(GroupGeneratorConfiguration currentConfiguration) {
        if (isTooManyStudentsInGroups()) {
            System.out.println("Error - you try to put too many students into groups. Choose a fitting group size");
            
        } else if (isOneStudentInGroup()){
            System.out.println("Error - one person is not a group. Choose a fitting group size");
        } 
        this.currentConfiguration = currentConfiguration;
    }
    public Collection<Group> generateGroups(Collection<Student> inputStudents){
        List<Student> studentList = new ArrayList<Student>(inputStudents);
        Collection<Group> outputGroups = new HashSet<Group>();
        for(int i = 0; i < currentConfiguration.get_number_of_groups(); i++){
            Collection<Student> emptyStudentCollection = new HashSet<Student>(inputStudents);
            outputGroups.add(new Group(emptyStudentCollection));
        }
        Random random = new Random();
        int expectedNumberOfStudentsInGroup = 0;
        while(!studentList.isEmpty()){
            for(Group g : outputGroups){
                if(g.size() > expectedNumberOfStudentsInGroup){
                    continue;
                }
                int randomIndex = random.nextInt() % studentList.size();
                Student randomStudent = studentList.get(randomIndex);
                g.addStudentToGroup(randomStudent);
                studentList.remove(randomStudent);
                if(studentList.isEmpty()){
                    break;
                }
            }
            expectedNumberOfStudentsInGroup++;
        }
        
        return outputGroups;
         /*else if (rest <= gz / 2 && nog > 1 && rest < nog || gz / 2 % rest == 0) {
            System.out.println("An extra student will be added to " + rest + " of the " + nog + " groups");
            System.out.print("This means there will be " + rest + " groups with " + (gz + 1) + " students");
            if (nog - rest > 0) {
                System.out.print(" and " + (nog - rest) + " groups with " + gz + " students.");
            };
        }
        else if (rest > gz / 2 && 2 * gz < ns) {
            System.out.println("An extra group with " + rest + " students will be added to the " + nog + " groups.");
            System.out.println("There are " + (nog + 1) + " groups in total");
            System.out.println();
            System.out.print("This means there will be " + (nog) + " groups with " + gz + " students and " + 1 + " group with " + rest + " students.");

            nog += 1;*/
        }
    private boolean isTooManyStudentsInGroups(){
        return (currentConfiguration.get_total_number_of_students() / 2) < currentConfiguration.get_group_size();
    }
    private boolean isOneStudentInGroup(){
        return (currentConfiguration.get_group_size() == 1);
    }
}
