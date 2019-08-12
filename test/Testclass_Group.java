import java.util.Scanner;

public class Testclass_Group {
   
    int group_id;
    int group_size;
    int total_number_of_students;
    //int rest;
    int number_of_groups;
    
    int ns;
    int gid;
    int gz;
    //int nog;
// constructor for group-object:

    public Testclass_Group(int gid,int gz, int ns) { 
        
        this.group_id = gid; //konstrurere objectet
        this.group_size = gz;
        this.total_number_of_students = ns;}
        
        int rest = ns%gz;
        int nog = ns/gz;
        //nog = number_of_groups;
    
//Testclass_Group groupOne = new Testclass_Group();
    
//Ask for imput number of students to be sorted:
public void setNumberOfStudents(int ns, int number_of_students){
System.out.println("Write the number of students to be sorted");
Scanner scan = new Scanner(System.in);              
this.ns = scan.nextInt();
ns = total_number_of_students;
}

//Method for setting the group_size:indtastes af brugervoid setGroup_size(int gz){
public void setGroupSize(int gz, int group_size){
System.out.println("write the preferred group size");
Scanner scan = new Scanner(System.in);              
this.gz = scan.nextInt();
gz = group_size;
}
}
 //public static void main(String[] args){ 



// Method for determining what to do when there is an uneven nuber of students
/*
if (ns/2 < gz){

    System.out.println("Error - you try to put too many students into groups. Choose a fitting group size");
}
else

if (gz==1){
System.out.println("Error - one person is not a group. Choose a fitting group size");
nog = 0;
}
else
    
if (rest == 0){
    System.out.println("Here are your " + nog + " groups");
}else

if (rest <= gz/2 && nog > 1 && rest < nog || gz/2%rest == 0){
System.out.println("An extra student will be added to " + rest + " of the " + nog + " groups");
System.out.print("This means there will be " + rest + " groups with " + (gz+1) + " students");
if(nog-rest > 0){
System.out.print(" and " + (nog-rest) + " groups with " + gz + " students.");
        };       
}

if (rest > gz/2 && 2 * gz < ns){
System.out.println("An extra group with " + rest + " students will be added to the " + nog + " groups.");
System.out.println("There are " + (nog + 1) + " groups in total");
System.out.println();
System.out.print("This means there will be " + (nog) + " groups with " + gz + " students and " + 1 + " group with " + rest + " students.");

nog +=1;
} 


/*Group_id skal bruge en loop ifht. hvor længe der skal genereres gruppe 
objekter. Det gælder både objekterne, og der skal tilskrives en værdi... der kan
startes med værdien*/

/*
for(gid = 1; gid <= nog; gid++) {
  System.out.println();
    System.out.println("Group " + gid);
   
}
} */
