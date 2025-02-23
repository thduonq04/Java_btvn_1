package bt1;

public class Student {
	private String firstName, lastName, birthDate, Address, className;
    private double lapTrinhHuongDoiTuong, quanLyDuAn, hocMay, coSoDuLieu, lapTrinhUngDung;

    public Student(String ten, String ho, String ngaysinh, String diachi, String lop, double lapTrinhHuongDoiTuong, double quanLyDuAn, double hocMay, double coSoDuLieu, double lapTrinhUngDung ){
        this.firstName = ten;
        this.lastName = ho;
        this.birthDate = ngaysinh;
        this.Address = diachi;
        this.className = lop; 
        this.lapTrinhHuongDoiTuong = lapTrinhHuongDoiTuong;
        this.quanLyDuAn = quanLyDuAn;
        this.hocMay = hocMay;
        this.coSoDuLieu = coSoDuLieu;
        this.lapTrinhUngDung = lapTrinhUngDung;

    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public String getAddress(){
        return this.Address;
    }
    public String getClassName(){
        return this.className;
    }
    public double getLapTrinhHuongDoiTuong(){
        return this.lapTrinhHuongDoiTuong;
    }
    public double getquanLyDuAn(){
        return this.quanLyDuAn;
    }
    public double getHocMay(){
        return this.hocMay;
    }
    public double getCoSoDuLieu(){
        return this.coSoDuLieu;
    }
    public double getLapTrinhUngDung(){
        return this.lapTrinhUngDung;
    }
    public void setLastName(String ho){
        this.lastName= ho;
    }
    public void setFirstName(String ten){
        this.firstName= ten;
    }
    public void setBirthDate(String birthDate){
        this.birthDate= birthDate;
    }
    public void setAddress(String Address){
        this.Address= Address;
    }
    public void setClassName(String lop){
        this.className= lop;
    }
    public void setLapTrinhHuongDoiTuong(double LapTrinhHuongDoiTuong){
        this.lapTrinhHuongDoiTuong= LapTrinhHuongDoiTuong;
    }
    public void setQuanLyDuAn(double QuanLyDuAn){
        this.quanLyDuAn= QuanLyDuAn;
    }
    public void setCoSoDuLieu(double CoSoDuLieu){
        this.coSoDuLieu= CoSoDuLieu;
    }
    public void setHocMay(double hocMay){
        this.hocMay= hocMay;
    }
    public void setLapTrinhUngDung(double lapTrinhUngDung){
        this.lapTrinhUngDung= lapTrinhUngDung;
    }
    public double diemTB(){
        return (lapTrinhHuongDoiTuong+quanLyDuAn+hocMay+coSoDuLieu+lapTrinhUngDung)/5;
    }
    public String xepLoai(){
        double diemTB = diemTB();
        if (diemTB <10 && diemTB >= 8.5){
            return "A";
        }
        else if(diemTB < 8.5 && diemTB >= 7){
            return "B";
        }
        else if(diemTB < 7 && diemTB >=5.5){
            return "C";
        }
        else if(diemTB >= 4){
            return "D";
        }
        else{
            return "<D";
        }
    }
    @Override
    public String toString(){
        return firstName + " " + lastName + " (" + className + ") - Avg: " + String.format("%.2f", diemTB()) + " - Rank: " + xepLoai();
    }

}
