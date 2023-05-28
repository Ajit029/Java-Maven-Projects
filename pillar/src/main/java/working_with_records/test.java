package working_with_records;

public class test {
    record Student(String name, int age, int grade, String major) {}

    public static void main(String[] args) {
        Student student = new Student("John Doe", 18, 12, "Computer Science");
        System.out.println(student.name);
    }
    
}
