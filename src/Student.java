public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void addCredits(int c) {
        credits = credits + c;
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public boolean theBest() {
        return gpa >= 3.5;
    }

    public String toString() {
        return "Студент: " + name + "  ID: " + id + "  GPA: " + gpa + "  Кредиты: " + credits;
    }
}