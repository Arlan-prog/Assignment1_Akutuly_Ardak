public class Course {
    private final String courseName;
    private final String instructor;
    private final Student[] students;

    public Course(String courseName, String instructor, int size) {
        if (courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException("Course name must not be empty.");
        }
        if (instructor == null || instructor.isBlank()) {
            throw new IllegalArgumentException("Instructor must not be empty.");
        }
        if (size < 0) {
            throw new IllegalArgumentException("Course size cannot be negative.");
        }
        this.courseName = courseName.trim();
        this.instructor = instructor.trim();
        this.students = new Student[size];
    }

    public void addStudent(Student student, int index) {
        if (student == null) {
            throw new IllegalArgumentException("Student must not be null.");
        }
        if (index < 0 || index >= students.length) {
            throw new IndexOutOfBoundsException("Student index is outside the course capacity.");
        }
        students[index] = student;
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.getGpa();
                count++;
            }
        }
        return count == 0 ? 0.0 : sum / count;
    }

    @Override
    public String toString() {
        return "Курс: " + courseName
                + "  Преподаватель: " + instructor
                + "  Средний GPA: " + courseAverageGPA();
    }
}
