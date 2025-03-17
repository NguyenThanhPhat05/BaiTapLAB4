package BAI04;
import java.util.Scanner;
class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private int dienAp;
	private int congSuat;
	
	public HangDienMay() {
		super();
		this.thoiGianBaoHanh=0;
		this.dienAp=0;
		this.congSuat=0;
	}
	public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
	super(maHang, tenHang, donGia);
	this.thoiGianBaoHanh= thoiGianBaoHanh;
	this.dienAp= dienAp;
	this.congSuat= congSuat;
    }
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public int getDienAp() {
		return dienAp;
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void Nhap(Scanner kb) {
		super.Nhap(kb);
		System.out.print("Nhap thoi gian bao hanh (thang): ");
		thoiGianBaoHanh= kb.nextInt();
		System.out.print("Nhap dien ap: ");
		dienAp= kb.nextInt();
		System.out.print("Nhap cong suat: ");
		congSuat= kb.nextInt();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("Thoi gian bao hanh la: " + thoiGianBaoHanh + "thang");
		System.out.println("Dien ap: " + dienAp + "V");
		System.out.println("Cong suat: " + congSuat + "W");		
	}
}	
