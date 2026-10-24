public class Student {
    private final String name;
    private final String id;
    private final String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = requireText(name, "name");
        this.id = requireText(id, "id");
        this.major = requireText(major, "major");
    }

    private static String requireText(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " must not be empty.");
        }
        return value.trim();
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }

    public void addCredits(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Credits cannot be negative.");
        }
        credits = Math.addExact(credits, amount);
    }

    public void updateGPA(double newGPA) {
        if (!Double.isFinite(newGPA) || newGPA < 0.0 || newGPA > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
        gpa = newGPA;
    }

    public boolean theBest() {
        return gpa >= 3.5;
    }

    @Override
    public String toString() {
        return "Студент: " + name + "  ID: " + id + "  GPA: " + gpa + "  Кредиты: " + credits;
    }
}
