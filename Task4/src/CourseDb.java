import java.util.ArrayList;

public class CourseDb {

    private ArrayList<Course> courses;
    public CourseDb(){
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addCourse(ArrayList<Course> courses){
        this.courses.addAll(courses);
    }

    public Course getCourse(int courseCode){
        for (Course c : courses) {
            if (c.getCourseCode()==courseCode) {
                return c;
            }
        }
        return null;
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }

    public void getCoursesInfo(){
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public String toString(){
        String string="";
        for (Course course : courses) {
            string += course+"\n";
        }
        return string;
    }
}
