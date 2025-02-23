package bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Classroom> classrooms = new ArrayList<>();

        Classroom class1 = new Classroom("HTTT4");
         
        class1.addStudent(new Student("Van Anh", "Nguyen", "2004-09-28", "HaiDuong", "HTTT4", 8.5, 7.5, 9.0, 6.5, 8.0));
        class1.addStudent(new Student("Thuy Duong", "Phan", "2004-07-19", "ThaiBinh", "HTTT4", 6.0, 8.5, 7.0, 9.0, 8.5));
        class1.addStudent(new Student("Thuy Tien", "Nguyen Ngoc", "2004-04-22", "QuangBinh", "HTTT4", 9.0, 7.5, 7.0, 8.0, 5.5));
        
        Classroom class2 = new Classroom("HTTT2");
        class2.addStudent(new Student("A","Nguyen Van", "2004-01-04","Hehe","HTTT2",2.0,4.0,9.5,3.5,7.5));

        classrooms.add(class1);
        classrooms.add(class2);
        System.out.println("Danh sach lop: ");
        for (Classroom classroom : classrooms) {
        	System.out.println(classroom.getClassName());
        }
        
        try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Nhap lop can tim: ");
    String tenLop = scanner.nextLine();

    boolean timkiem = false;
    for (Classroom classroom : classrooms) {
        if (classroom.getClassName().equals(tenLop)) {
            classroom.hienthiSinhVien();
            timkiem = true;
            break;
        }
    }

    if (!timkiem) {
        System.out.println("Lop khong ton tai.");
    }
}
        
    }
}
