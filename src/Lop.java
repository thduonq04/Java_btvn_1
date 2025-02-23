import java.util.ArrayList;

public class Lop {
	private String tenLop;
	private String maLop;
	private ArrayList<SinhVien> danhSachSinhVien;
	public Lop(String tenLop, String maLop) {
		super();
		this.tenLop = tenLop;
		this.maLop = maLop;
		this.danhSachSinhVien = new ArrayList<>();
	}
	
	
	public String getTenLop() {
		return tenLop;
	}


	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}


	public String getMaLop() {
		return maLop;
	}


	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}


	public void addSV(SinhVien sv) {
		danhSachSinhVien.add(sv);
	}
	
	public void danhSachSV() {
		System.out.println("Danh sach sinh vien ma lop "+maLop+":");
		for(SinhVien sv: danhSachSinhVien) {
			sv.hienThi();
		}
	}
	
	public void demRank() {
		int[] dem = new int[5];
		
		for(SinhVien sv : danhSachSinhVien) {
			if(sv.getRank() == "A") {
				dem[0]++;
			}
			if(sv.getRank() == "B") {
				dem[1]++;
			}
			if(sv.getRank() == "C") {
				dem[2]++;
			}
			if(sv.getRank() == "D") {
				dem[3]++;
			}
			if(sv.getRank() == "F") {
				dem[4]++;
			}
		}
		System.out.println("Thong ke so sinh vien theo rank:");
		System.out.println("A: "+dem[0]+" | B: "+dem[1]+" | C: "+dem[2]+" | D: "+dem[3]+" | F: "+dem[4]);
		
	}
	

	
	
	
}
