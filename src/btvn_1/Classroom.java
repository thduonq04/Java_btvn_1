package btvn_1;

import java.util.ArrayList;
import java.util.List;

class Classroom {
    private String className;
    private List<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getNumberOfStudentsByRank(String rank) {
        int count = 0;
        for (Student student : students) {
            if (student.getRank().equals(rank)) {
                count++;
            }
        }
        return count;
    }

    public void displayStudents() {
        // Định dạng bảng
        System.out.println("+------------+------------+------------+------------+------------+------------+------------+------------+------------+");
        System.out.println("| First Name | Last Name  | Birthdate  | Address    | OOP Score  | PM Score   | ML Score   | DB Score   | MAD Score  | Average    | Rank |");
        System.out.println("+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------+");
        for (Student student : students) {
            System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-4s |\n",
                    student.getFirstName(),
                    student.getLastName(),
                    student.getBirthdate(),
                    student.getAddress(),
                    student.getOopScore(),
                    student.getProjectManagementScore(),
                    student.getMachineLearningScore(),
                    student.getDatabaseScore(),
                    student.getMobileAppDevelopmentScore(),
                    student.getAverageScore(),
                    student.getRank());
        }
        System.out.println("+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------+");
    }

    public void displayRankSummary() {
        System.out.println("Rank Summary for Class " + className + ":");
        System.out.println("A: " + getNumberOfStudentsByRank("A"));
        System.out.println("B: " + getNumberOfStudentsByRank("B"));
        System.out.println("C: " + getNumberOfStudentsByRank("C"));
        System.out.println("D: " + getNumberOfStudentsByRank("D"));
        System.out.println("<D: " + getNumberOfStudentsByRank("<D"));
    }
}
