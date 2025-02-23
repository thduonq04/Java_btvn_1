package bt1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private String className;
    private List<Student> students = new ArrayList<>();
    public Classroom (String tenLop){
        this.className = tenLop;
        this.students = new ArrayList<>();
    }
    public String getClassName(){
        return this.className;
    }
    public void setClassName(String tenLop){
        this.className = tenLop;
    }
    public void addStudent(Student student){
        if(student.getClassName().equals(this.className)){
            students.add(student);
        }
        else{
            System.out.println("Sinh vien khong thuoc lop "+this.className);
        }
    }
    public void demXepLoai() {
        int demA = 0, demB = 0, demC = 0, demD = 0, khac = 0;

        for (Student sv : students) {
            String xeploai  = sv.xepLoai();
            switch (xeploai) {
                case "A" -> demA++; 
                case "B" -> demB++; 
                case "C"-> demC++; 
                case "D"-> demD++; 
                default -> khac++; 
            }
        }
        System.out.println("Phan Loai: A=" + demA + " B=" + demB + " C=" + demC + " D=" + demD + " <D=" + khac);
    }
    public void hienthiSinhVien() {
    	if (students.isEmpty()) {
    		System.out.println("Lop khong co sinh vien nao");
    		return;
    	}
    	
    	 System.out.println("--------------------------------------------------------------------------");
         System.out.printf("%-15s %-15s %-12s %-20s %-10s %-10s\n", "First Name", "Last Name", "Birthdate", "Address", "Avg Grade", "Rank");
         System.out.println("--------------------------------------------------------------------------");
    	for (Student s :students) {
    		System.out.printf("%-15s %-15s %-12s %-20s %-10.2f %-10s\n", 
                    s.getFirstName(), s.getLastName(), s.getBirthDate(), s.getAddress(), s.diemTB(), s.xepLoai());
    	}
    	System.out.println("--------------------------------------------------------------------------");
    	demXepLoai();
    }

}
