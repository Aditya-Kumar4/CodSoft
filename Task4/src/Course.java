public class Course {
    private int courseCode;
    private String courseTitle;
    private String description;
    private int capacity;
    private String schedule;
    private int available;

    public Course(int courseCode, String courseTitle, String description, int capacity, String schedule){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        available = this.capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (courseCode != other.courseCode)
            return false;
        return true;
    }

    public int getCourseCode(){
        return this.courseCode;
    }

    public int getAvailable(){
        return this.available;
    }

    public void setAvailable(int capacity){
        this.available = capacity;
    }

    public String toString(){
        return "Course Code: "+courseCode+"\nTitle: "+courseTitle+"\nDescription: "+description+"\nSchedule: "+schedule+"\nAvailable Slots: "+available+"\n";
    }
}
