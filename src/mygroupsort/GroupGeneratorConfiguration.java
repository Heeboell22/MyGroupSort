/*
 Tage et nummer fra interface (gruppestørrelse), og forholde det til antallet af de studerende
der skal sorteres (antallet i klassen - dem der ikke er til stede), og gemme dem så de indgår i Gruppegenerator.
 */
package mygroupsort;

public class GroupGeneratorConfiguration {
    private int group_size;
    private int total_number_of_students;
    private int number_of_groups;
    
    public GroupGeneratorConfiguration(int group_size, int total_number_of_students, int number_of_groups){
        this.group_size = group_size;
        this.total_number_of_students = total_number_of_students;
        this.number_of_groups = number_of_groups;
    }
    public int get_group_size(){
        return group_size;
    }
    public int get_total_number_of_students(){
        return total_number_of_students;
    }
    public int get_number_of_groups(){
        return number_of_groups;
    }
    
}
