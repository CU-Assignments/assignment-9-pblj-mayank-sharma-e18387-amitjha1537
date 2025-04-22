public class Student {
    private String name;
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course.getCourseName() + " | Duration: " + course.getDuration());
    }
}