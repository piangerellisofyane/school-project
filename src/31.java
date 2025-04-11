public class SimpleSchoolProject {

    public static void main(String[] args) {
        // Example usage of an object or class
        Student student = new Student("Alice", 17);
        System.out.println(student.getName() + " is " + student.getAge());
    }

    private String getName() {
        return "Student";
    }
}
