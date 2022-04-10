public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(111223333, "John");
        java.util.Date dateCreated = student.getDateCreate();
        dateCreated.setTime(200000);
    }
}
