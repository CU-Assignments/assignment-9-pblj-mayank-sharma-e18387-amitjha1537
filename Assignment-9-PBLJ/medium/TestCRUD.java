public class TestCRUD {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ravi");
        student.setAge(22);

        StudentDao dao = new StudentDao();
        dao.saveStudent(student);
    }
}