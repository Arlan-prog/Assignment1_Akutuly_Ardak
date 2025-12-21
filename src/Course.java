public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    public void addStudent(Student s, int index) {
        students[index] = s;
    }

    public double courseAverageGPA() {
        double sum = 0;
        int c = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                sum = sum + students[i].getGpa();
                c++;
            }
        }
        if (c > 0) {
            return sum / c;
        }
        return 0;
    }

    public String toString() {
        return "Курс: " + courseName +
                "  Преподаватель: " + instructor +
                "  Средний GPA: " + courseAverageGPA();
    }
}