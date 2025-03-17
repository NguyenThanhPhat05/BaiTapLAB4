package BAI05;
import java.util.Scanner;
class Sach {
	private String maSach;
	private String tenSach;
	private String tacGia;
	private long gia;
	
	public Sach() {
		this.maSach="";
		this.tenSach="";
		this.tacGia="";
		this.gia=0;
	}
	public Sach(String maSach, String tenSach, String tacGia, long gia) {
		this.maSach=maSach;
		this.tenSach=tenSach;
		this.tacGia=tacGia;
		this.gia=gia;
	}
	public String getMaSach() {
		return maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public long getGia() {
		return gia;
	}
	public long getGiaSauGiam() {
		return gia;
	}
	public void Xuat() {
		System.out.println("Ma sach:" + maSach + ",Ten sach" + tenSach + ",Tac gia:" + tacGia + ",Gia:" + gia);
		System.out.println("Gia sau giam:" + getGiaSauGiam());
	}
}
