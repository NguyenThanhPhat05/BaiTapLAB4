package BAI05;
import java.util.Scanner;
class SachVanHoc extends Sach {
	private int lanXuatBan;
	
	public SachVanHoc() {
		this.lanXuatBan=0;
	}
	public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int lanXuatBan) {
		super(maSach, tenSach, tacGia, gia);
		this.lanXuatBan= lanXuatBan;
	}
	public int getLanXuatBan() {
		return lanXuatBan;
	}
	@Override
	public long getGiaSauGiam() {
		return (getGia() > 300000) ? (long) (getGia() * 0.8) : getGia();
	}

}
