import java.time.LocalDate;

public class SinhVien {
	private String firstName;
	private String lastName;
	private LocalDate ngaySinh;
	private String address;
	private Lop tenLop;
	private double diemLapTrinhHuongDoiTuong;
	private double diemQuanLiDuAn;
	private double diemHocMay;
	private double diemCSDL;
	private double diemLapTrinhUngDungChoTBDD;
	
	public SinhVien(String firstName, String lastName, LocalDate ngaySinh, String address, Lop tenLop,
			double diemLapTrinhHuongDoiTuong, double diemQuanLiDuAn, double diemHocMay, double diemCSDL,
			double diemLapTrinhUngDungChoTBDD) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ngaySinh = ngaySinh;
		this.address = address;
		this.tenLop = tenLop;
		this.diemLapTrinhHuongDoiTuong = diemLapTrinhHuongDoiTuong;
		this.diemQuanLiDuAn = diemQuanLiDuAn;
		this.diemHocMay = diemHocMay;
		this.diemCSDL = diemCSDL;
		this.diemLapTrinhUngDungChoTBDD = diemLapTrinhUngDungChoTBDD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Lop getTenLop() {
		return tenLop;
	}
	public void setTenLop(Lop tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemLapTrinhHuongDoiTuong() {
		return diemLapTrinhHuongDoiTuong;
	}
	public void setDiemLapTrinhHuongDoiTuong(double diemLapTrinhHuongDoiTuong) {
		this.diemLapTrinhHuongDoiTuong = diemLapTrinhHuongDoiTuong;
	}
	public double getDiemQuanLiDuAn() {
		return diemQuanLiDuAn;
	}
	public void setDiemQuanLiDuAn(double diemQuanLiDuAn) {
		this.diemQuanLiDuAn = diemQuanLiDuAn;
	}
	public double getDiemHocMay() {
		return diemHocMay;
	}
	public void setDiemHocMay(double diemHocMay) {
		this.diemHocMay = diemHocMay;
	}
	public double getDiemCSDL() {
		return diemCSDL;
	}
	public void setDiemCSDL(double diemCSDL) {
		this.diemCSDL = diemCSDL;
	}
	public double getDiemLapTrinhUngDungChoTBDD() {
		return diemLapTrinhUngDungChoTBDD;
	}
	public void setDiemLapTrinhUngDungChoTBDD(double diemLapTrinhUngDungChoTBDD) {
		this.diemLapTrinhUngDungChoTBDD = diemLapTrinhUngDungChoTBDD;
	}
	
	public double tinhDiemTB() {
		return (diemLapTrinhHuongDoiTuong + diemQuanLiDuAn + diemHocMay + diemCSDL + diemLapTrinhUngDungChoTBDD)/5;
	}
	
	public String getRank() {
		if(tinhDiemTB()>=8.5) return "A";
		if(tinhDiemTB()>=7 && tinhDiemTB()<8.5) return "B";
		if(tinhDiemTB()>=5.5 && tinhDiemTB()<7) return "C";
		if(tinhDiemTB()>=4 && tinhDiemTB()<5.5) return "<D";
		return "F";
	}
	public void hienThi() {
		//System.out.println("Ho va ten: "+firstName+lastName+" | Ngay sinh: "+ngaySinh+" | Dia chi: "+address+" | Ten Lop: "+tenLop.getTenLop()+" | Diem Trung Binh :"+ tinhDiemTB()+" | Rank: "+getRank() );
		System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-4s |\n",
                this.getFirstName(),
                this.getLastName(),
                this.getNgaySinh(),
                this.getAddress(),
                this.getDiemLapTrinhHuongDoiTuong(),
                this.getDiemQuanLiDuAn(),
                this.getDiemHocMay(),
                this.getDiemCSDL(),
                this.getDiemLapTrinhUngDungChoTBDD(),
                this.tinhDiemTB(),
                this.getRank());
	}
	
	}

