package BAI05;
import java.util.Scanner;
class SachGiaoKhoa extends Sach {
	private int lop;
	private String nhaXuatBan;
	
	public SachGiaoKhoa() {
		this.lop=0;
		this.nhaXuatBan="";
	}
	public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, int lop, String nhaXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }
	public int getLop() {
		return lop;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	@Override 
	public long getGiaSauGiam() {
		return nhaXuatBan.equalsIgnoreCase("Giao Duc") ? (long) (gia * 0.9) : gia;
    }
}
