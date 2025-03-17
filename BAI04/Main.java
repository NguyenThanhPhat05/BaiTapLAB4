package BAI04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		HangDienMay dienMay = new HangDienMay("DM001","Tivi", 5000000, 12, 220, 100);
		System.out.println("Thong tin hang dien may ban dau:");
		dienMay.Xuat();
		
		System.out.println("Nhap thong tin hang dien may");
		dienMay.Nhap(kb);
		dienMay.Xuat();
		
		HangThucPham thucPham = new HangThucPham("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
		System.out.println("Thong tin hang thuc pham ban dau:");
		thucPham.Xuat();
		
		System.out.println("Nhap thong tin hang thuc pham moi:");
		thucPham.Nhap(kb);
		thucPham.Xuat();
	}

}
