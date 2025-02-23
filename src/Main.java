import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Lop> danhSachLop = new ArrayList<>();
		
		Lop lop1 = new Lop("He thong thong tin 1", "HTTT1");
		Lop lop2 = new Lop("He thong thong tin 2", "HTTT2");
		
		danhSachLop.add(lop1);
		danhSachLop.add(lop2);
		lop1.addSV(new SinhVien("Nguyen", "Van A", LocalDate.of(2004, 2, 19), "Ha Noi", lop1, 9.5, 8.0, 7.5, 6.0, 10.0));
		lop1.addSV(new SinhVien("Nguyen", "Van B", LocalDate.of(2004, 2, 20), "Ha Noi", lop1, 10.0, 8.6, 7.0, 4.0, 6.0));
		
		lop2.addSV(new SinhVien("Nguyen", "Thi C", LocalDate.of(2004, 4, 30), "Ninh Binh", lop2, 4.0, 5.0, 4.5, 7.0, 6.0));
		lop2.addSV(new SinhVien("Nguyen", "Thi D", LocalDate.of(2004, 6, 1), "Ha Noi", lop2, 9.5, 8.6, 7.9, 10.0, 6.0));
		
		System.out.println("Danh sach lop: \n");
		for(Lop lop : danhSachLop) {
			System.out.println(lop.getMaLop()+": "+lop.getTenLop());
		}
		
		System.out.println("Nhap vao ma lop can xem danh sach: ");
		String MaLopNhap = sc.nextLine();
		
		boolean timKiem = false;
		for(Lop lop:danhSachLop) {
			if(lop.getMaLop().equals(MaLopNhap)) {
				lop.danhSachSV();
				lop.demRank();
				timKiem = true;
			}
		}
		if(!timKiem) {
			System.out.println("Khong tim thay lop!");
		}
		
		
	}
}

