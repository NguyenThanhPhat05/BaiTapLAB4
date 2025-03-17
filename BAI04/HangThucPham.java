package BAI04;
import java.util.Scanner;
class HangThucPham extends HangHoa {
	private String ngaySanXuat;
	private String ngayHetHan;
	
	public HangThucPham() {
		super();
		this.ngaySanXuat="";
		this.ngayHetHan="";
	}
	public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
		super(maHang, tenHang, donGia);
		this.ngaySanXuat= ngaySanXuat;
		this.ngayHetHan= ngayHetHan;
	}
	public String getNgaySanXuat() {
		return ngaySanXuat;
	}
	public String getNgayHetHan() {
		return ngayHetHan;
	}
	public void Nhap(Scanner kb) {
		super.Nhap(kb);
		System.out.print("Nhap ngay san xuat:");
		ngaySanXuat=kb.nextLine();
		System.out.print("Nhap ngay het han:");
		ngayHetHan=kb.nextLine();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("Ngay san xuat: " + ngaySanXuat);
		System.out.println("Ngay het han: " + ngayHetHan);
	}
}
