import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>(Arrays.asList(new Course(1, "Discrete Maths", "4th Semester", 60, "10-11 A.M"), 
        new Course(2, "Electronic Circuits", "3rd Semester", 70, "12-1 P.M"),
        new Course(3, "Data Structures and Algorithms", "3rd Semester", 65, "9-10 A.M"),
        new Course(4, "Organisational Behaviour", "4th Semester", 55, "8-9 A.M")));

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student("Ramesh Kumar", 1),
        new Student("Swati Goyal", 2),
        new Student("Tushar Garg", 3)));
        CourseDb courseDb = new CourseDb();
        courseDb.addCourse(courses);
        // students.get(0).addCourse(courseDb.getCourse(1));
        
        // for (Student student : students) {
        //     System.out.println(student);
        // }
        
        System.out.println("Available courses: ");
        System.out.println(courseDb);
        System.out.println("Select the option:");
        System.out.println("1. Show student details.");
        System.out.println("2. Add course to student.");
        System.out.println("3. Remove course from student");
        System.out.println("4. Show all course details");
        System.out.println("0. Exit");
        while (true) {
            int input = sc.nextInt();
            if (input==0) {
                break;
            }else if (input==1) {
                for (Student student : students) {
                    System.out.println(student);
                    System.out.println();
                }
            }else if (input==2) {
                System.out.println("Enter StudentId: ");
                int studentId = sc.nextInt();
                System.out.println("Enter CourseId of course to add:");
                int courseId = sc.nextInt();
                students.get(studentId-1).addCourse(courseDb.getCourse(courseId));
            }else if (input==3) {
                System.out.println("Enter StudentId: ");
                int studentId = sc.nextInt();
                System.out.println("Enter CourseId of course to remove: ");
                int courseId = sc.nextInt();
                students.get(studentId-1).dropCourse(courseDb.getCourse(courseId));
            }else if (input==4) {
                System.out.println(courseDb);
            }
        }
        System.out.println("Thank You!");
        sc.close();
    }
}
