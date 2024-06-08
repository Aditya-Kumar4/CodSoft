import java.util.ArrayList;

public class Student {
    private ArrayList<Course> courses;
    private String name;
    private int studentId;

    public Student(String name, int studentId){
        courses = new ArrayList<>();
        this.name = name;
        this.studentId = studentId;
    }

    public void addCourse(Course course){
        if (course==null) {
            System.out.println("Invalid Course");
                        
        }else{

            courses.add(course);
            course.setAvailable(course.getAvailable()-1);
            System.out.println("Course added!");
        }
    }

    public void dropCourse(Course course){
        if (!courses.contains(course)) {
            System.out.println("Student not enrolled in course");
        }else{
            courses.remove(course);
            course.setAvailable(course.getAvailable()+1);
            System.out.println("Course removed from student");
        }
    }

    public String toString(){
        return "Student ID: "+studentId+"\nName: "+name+"\nCourses: "+getCourses();
    }

    private String getCourses() {
        return courses.toString();
    }
}
