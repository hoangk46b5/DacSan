package example.dacsanmonan;

public class ListItem {
	private String ten;
	private String nguyenlieu;
	private String cachnau;
	private int Image;
	public int getImage() {
		return Image;
	}
	public void setImage(int image) {
		Image = image;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNguyenlieu() {
		return nguyenlieu;
	}
	public void setNguyenlieu(String nguyenlieu) {
		this.nguyenlieu = nguyenlieu;
	}
	public String getCachnau() {
		return cachnau;
	}
	public void setCachnau(String cachnau) {
		this.cachnau = cachnau;
	}
	
	@Override
	public String toString() {
		return ten + nguyenlieu + cachnau;
	}

	public ListItem() {
		// TODO Auto-generated constructor stub
	 
	}

	public ListItem(String Ten, String nguyenLieu, String cachNau, int ImaGe) {
		this.ten = Ten;
		this.nguyenlieu = nguyenLieu;
		this.cachnau = cachNau;
		this.Image = ImaGe;
	}
}
