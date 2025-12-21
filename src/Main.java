    public class Main {
        public static void main(String[] args) {

            System.out.println("СИСТЕМА УПРАВЛЕНИЯ СТУДЕНТАМИ\n");

            Student s1 = new Student("Хан Досаев", "1", "IT");
            Student s2 = new Student("Ермахан Токаев", "2", "Математика");
            Student s3 = new Student("Айгерим Уталиева", "3", "Информатика");
            Student s4 = new Student("Данияр Жумабек", "4", "IT");
            Student s5 = new Student("Асель Абдрахман", "5", "Инженерия");

            s1.updateGPA(3.8);
            s1.addCredits(45);

            s2.updateGPA(3.9);
            s2.addCredits(34);

            s3.updateGPA(3.4);
            s3.addCredits(36);

            s4.updateGPA(3.6);
            s4.addCredits(48);

            s5.updateGPA(4.0);
            s5.addCredits(52);

            System.out.println("СПИСОК СТУДЕНТОВ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5+"\n");

            Student[] allStudents = {s1, s2, s3, s4, s5};

            System.out.println("СТАТИСТИКА");

            Student top = getTopStudent(allStudents);
            System.out.println("Лучший студент: " + top.getName() + " (GPA: " + top.getGpa() + ")");

            int honors = countHonors(allStudents);
            System.out.println("Отличников: " + honors);

            int total = totalCredits(allStudents);
            System.out.println("Всего кредитов: " + total + "\n\n");


            Course java = new Course("Java Programming", "Проф.Айдана", 5);
            java.addStudent(s1, 0);
            java.addStudent(s2, 1);
            java.addStudent(s3, 2);
            java.addStudent(s4, 3);
            java.addStudent(s5, 4);

            System.out.println("ИНФОРМАЦИЯ О КУРСЕ");
            System.out.println(java);
        }

        public static Student getTopStudent(Student[] arr) {
            Student best = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].getGpa() > best.getGpa()) {
                    best = arr[i];
                }
            }
            return best;
        }


        public static int countHonors(Student[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].theBest()) {
                    count++;
                }
            }
            return count;
        }

        public static int totalCredits(Student[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i].getCredits();
            }
            return sum;
        }
    }
