package BAI04;
import java.util.Scanner;
class HangHoa {
	private String maHang;
	private String tenHang;
	private long donGia;
	
	public HangHoa() {
		this.maHang="";
		this.tenHang="";
		this.donGia=0;
	}
	public HangHoa(String maHang, String tenHang, long donGia) {
		this.maHang= maHang;
		this.tenHang= tenHang;
		this.donGia= donGia;
	}
	public String getMahang() {
		return maHang;
	}
	public String getTenHang̣() {
		return tenHang;
	}
	public long getDonGia() {
		return donGia;
	}
	public void Nhap(Scanner kb) {
		System.out.print("Nhap ma hang: ");
		maHang= kb.nextLine();
		System.out.print("Nhap ten hang: ");
		tenHang= kb.nextLine();
		System.out.print("Nhap don gia: ");
		donGia= kb.nextLong();
	}
	public void Xuat() {
		System.out.println("Ma hang: " + maHang);
		System.out.println("Ten hang: " + tenHang);
		System.out.println("Don gia: " + donGia);
	}
}
