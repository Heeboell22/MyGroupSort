package mygroupsort;

import java.util.Scanner;

/**
 * The Group class creates arrays of groups-objects containing student_id's with
 * an index. Skal indeholde opskriften på ArrayListen, som en gruppe består af,
 * og at den skal indeholde Student objekter.
 */
public class Group {

    // Variables that recieves value from the userinterface:
    int group_size;

    //Variables derived from info from other classes (Student):
    int total_number_of_students; //afhængig af antallet i ArrayListen, og antallet af tilstedeværende

    //Variables used in this class:
    int group_id;
    //herunder også rest
    int number_of_groups;

    //Abbreviations for variable names:
    int gz = group_size;

    int ns = total_number_of_students;

    int rest = ns % gz;

    int nog = number_of_groups = ns / gz;

    //Constructor for Group objects:
    public Group(//int group_id, 
            int group_size) {
        //this.group_id = group_id;
        this.group_size = group_size;

    }

    //SortGroups();
    //setter for group_size
    public void setGroup_size(int group_size) {
        Scanner scan = new Scanner(System.in);
        this.group_size = scan.nextInt();
    }

    //getter for group_size:
    public int getGroup_size(int group_size) {
        return this.group_size;
    }

    //getter for group_id:
    public int getGroup_id(int group_id) {
        return this.group_id;
    }

// Programkrop - Method for determining what to do when there is an uneven nuber of students
    public Group() { // der er noget galt her

        if (ns / 2 < gz) {

            System.out.println("Error - you try to put too many students into groups. Choose a fitting group size");
        } else if (gz == 1) {
            System.out.println("Error - one person is nor a group. Choose a fitting group size");
            nog = 0;
        } else if (rest == 0) {
            System.out.println("Here are your " + nog + " groups");
        } else if (rest <= gz / 2 && nog > 1 && rest < nog || gz / 2 % rest == 0) {
            System.out.println("An extra student will be added to " + rest + " of the " + nog + " groups");
            System.out.print("This means there will be " + rest + " groups with " + (gz + 1) + " students");
            if (nog - rest > 0) {
                System.out.print(" and " + (nog - rest) + " groups with " + gz + " students.");
            };
        }

        if (rest > gz / 2 && 2 * gz < ns) {
            System.out.println("An extra group with " + rest + " students will be added to the " + nog + " groups.");
            System.out.println("There are " + (nog + 1) + " groups in total");
            System.out.println();
            System.out.print("This means there will be " + (nog) + " groups with " + gz + " students and " + 1 + " group with " + rest + " students.");

            nog += 1;
        }

    }
}
