import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String address;
    private List<String> courses = new ArrayList<>();
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades() {
        System.out.println("Grades:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address;
    }
}

class Teacher {
    private String name;
    private String address;
    private List<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nCourses taught: " + courses;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student's information
        System.out.println("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter student's address: ");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        // Input courses and grades for the student
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter course " + i + " name: ");
            String course = scanner.nextLine();
            System.out.println("Enter grade for course " + i + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            student.addCourseGrade(course, grade);
        }

        // Input teacher's information
        System.out.println("Enter teacher's name: ");
        String teacherName = scanner.nextLine();
        System.out.println("Enter teacher's address: ");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Input courses taught by the teacher
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter course " + i + " name taught by the teacher: ");
            String course = scanner.nextLine();
            teacher.addCourse(course);
        }

        // Display student and teacher information
        System.out.println("Student Info:");
        System.out.println(student);
        student.printGrades();
        System.out.println("Average Grade: " + student.getAverageGrade());

        System.out.println("\nTeacher Info:");
        System.out.println(teacher);
    }
}


// Student and Teacher classes should be defined here
