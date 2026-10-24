public class Main {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА УПРАВЛЕНИЯ СТУДЕНТАМИ\n");

        Student[] students = {
                new Student("Хан Досаев", "1", "IT"),
                new Student("Ермахан Токаев", "2", "Математика"),
                new Student("Айгерим Уталиева", "3", "Информатика"),
                new Student("Данияр Жумабек", "4", "IT"),
                new Student("Асель Абдрахман", "5", "Инженерия")
        };
        double[] gpas = {3.8, 3.9, 3.4, 3.6, 4.0};
        int[] credits = {45, 34, 36, 48, 52};

        for (int i = 0; i < students.length; i++) {
            students[i].updateGPA(gpas[i]);
            students[i].addCredits(credits[i]);
        }

        System.out.println("СПИСОК СТУДЕНТОВ");
        for (Student student : students) {
            System.out.println(student);
        }

        Student top = getTopStudent(students);
        System.out.println("\nСТАТИСТИКА");
        System.out.println("Лучший студент: " + top.getName() + " (GPA: " + top.getGpa() + ")");
        System.out.println("Отличников: " + countHonors(students));
        System.out.println("Всего кредитов: " + totalCredits(students));

        Course java = new Course("Java Programming", "Проф. Айдана", students.length);
        for (int i = 0; i < students.length; i++) {
            java.addStudent(students[i], i);
        }

        System.out.println("\nИНФОРМАЦИЯ О КУРСЕ");
        System.out.println(java);
    }

    public static Student getTopStudent(Student[] students) {
        if (students == null || students.length == 0) {
            throw new IllegalArgumentException("Student list must not be empty.");
        }
        Student best = null;
        for (Student student : students) {
            if (student != null && (best == null || student.getGpa() > best.getGpa())) {
                best = student;
            }
        }
        if (best == null) {
            throw new IllegalArgumentException("Student list must contain a student.");
        }
        return best;
    }

    public static int countHonors(Student[] students) {
        if (students == null) {
            return 0;
        }
        int count = 0;
        for (Student student : students) {
            if (student != null && student.theBest()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] students) {
        if (students == null) {
            return 0;
        }
        int total = 0;
        for (Student student : students) {
            if (student != null) {
                total = Math.addExact(total, student.getCredits());
            }
        }
        return total;
    }
}
