package Lec7;


import java.util.Arrays;
import java.util.Scanner;

public class Course {

    public static void main(String[] args){
        Course course1 = new Course("class1");
        Course course2 = new Course("class2");

        course1.numberOfStudents = 3;
        course1.students[0] = "ko";
        course1.students[1] = "kim";
        course1.students[2] = "ku";

        course2.numberOfStudents = 4;
        course2.students[0] = "ba";
        course2.students[1] = "bae";
        course2.students[2] = "bo";
        course2.students[3] = "bu";

        course1.dropStudent("ko");
        System.out.println("number of student class1 after drop ko: " + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(course1.students[i] + " ");
        }
        System.out.println();
        course1.clear();
        System.out.println("number of students after clear course1: " + course1.getNumberOfStudents());

        System.out.println();
        course2.dropStudent("bae");
        System.out.println("number of student class2 after drop bae " + course2.getNumberOfStudents());
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(course2.students[i] + " ");
        }
        System.out.println();
        course2.clear();
        System.out.println("number of students after clear course2: " + course2.getNumberOfStudents());


    }
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(numberOfStudents == students.length){
            String[] newStudents = new String[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for(int i=0; i<numberOfStudents; i++){
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents-1] = null;
                numberOfStudents--;
                return;
            }

        }
    }

    public void clear(){
        this.students = new String[4];
        numberOfStudents = 0;
    }
}
