import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.*;

public class UserInterface {


    static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Student> students = new ArrayList<>();


    public void start() {
        try {

        while (true){
            System.out.println(" =============================================");
            System.out.println("| 1. Add new student                          |");
            System.out.println("| 2. Edit student information                 |");
            System.out.println("| 3. Delete student information               |");
            System.out.println("| 4. Display student list                     |");
            System.out.println("| 5. Search students by student id            |");
            System.out.println("| 6. Sort in ascending order of average score |");
            System.out.println("| 7. Exit                                     |");
            System.out.println(" =============================================");
            System.out.print("Choose a option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addNewStudent();
                    break;
                case 2:
//                    editStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    showStudent();
                    break;
                case 5:
//                    searchStudent();
                    break;
                case 6:
                    sortStudent();
                    break;
                case 7:
                    System.out.println("Thank you for using the program!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Please select again!");
            }
        }
    }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }




    private static void addNewStudent(){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter date of birth : ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter average score: ");
        int averageScore = Integer.parseInt(scanner.nextLine());

        Student newStudent = new Student(averageScore, dateOfBirth, name, id);
        students.add(newStudent);
        List<String> studentList = new ArrayList<>();
        for (Student student : students){
            studentList.add(student.toString());
        }
        WriteFile.write(studentList);
        System.out.println("The contact has been added successfully!");
    }

    private static void showStudent() {
        if(students.isEmpty()){
            System.out.println("No contacts");
        }else{
            System.out.println("Contact: ");
            for (Student student : students) {
                System.out.println(student);
            }
        }

    }

     private static void sortStudent(){
        Collections.sort(students);
        System.out.println("List students sorted : ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void removeStudent(){
            System.out.println("Enter id; ");
            int id = scanner.nextInt();
            int index= 0;
            for ( int i = 0; i < students.size(); i++ ){
                if (id == i ){
                    index = i;
                    break;
                }
            }
            students.remove(index);
        System.out.println("Student with id " + id + " removed!");

        }

//    private static void searchStudent(){
//        System.out.println("Enter id; ");
//        int id = scanner.nextInt();
//        int index= 0;
//        for ( int i = 0; i < students.size(); i++ ){
//            if (id == i ){
//                index = i;
//                break;
//            }
//        }




    }








