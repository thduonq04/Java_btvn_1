package btvn_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Classroom> classrooms = new ArrayList<>();

        // Tạo danh sách lớp và sinh viên
        Classroom class1 = new Classroom("CNTT1");
        class1.addStudent(new Student("Nguyen", "Van A", "01/01/2000", "Ha Noi", "CNTT1", 9.0, 8.5, 7.5, 8.0, 9.5));
        class1.addStudent(new Student("Tran", "Thi B", "02/02/2000", "Quang Binh", "CNTT1", 7.0, 6.5, 8.0, 7.5, 6.0));
        class1.addStudent(new Student("Le", "Van C", "03/03/2000", "Da Nang", "CNTT1", 5.0, 6.0, 5.5, 4.5, 6.5));

        Classroom class2 = new Classroom("CNTT2");
        class2.addStudent(new Student("Pham", "Van D", "04/04/2000", "Dak Lak -)", "CNTT2", 8.0, 7.5, 8.5, 9.0, 8.5));
        class2.addStudent(new Student("Hoang", "Thi E", "05/05/2000", "Nghe An", "CNTT2", 6.0, 5.5, 6.5, 7.0, 6.5));
        class2.addStudent(new Student("Vu", "Van F", "06/06/2000", "Hue", "CNTT2", 4.0, 3.5, 4.5, 5.0, 4.5));

        classrooms.add(class1);
        classrooms.add(class2);

        // Hiển thị danh sách lớp
        System.out.println("Danh sách các lớp:");
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.getClassName());
        }

        // Nhập mã lớp từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã lớp: ");
        String className = scanner.nextLine();

        // Tìm lớp và hiển thị thông tin
        for (Classroom classroom : classrooms) {
            if (classroom.getClassName().equals(className)) {
                System.out.println("Danh sách sinh viên trong lớp " + className + ":");
                classroom.displayStudents();
                classroom.displayRankSummary();
                break;
            }
        }
    }
}