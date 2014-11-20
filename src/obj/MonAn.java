package obj;

public class MonAn {
	private String tenx;
	private int Imagex;
	public String getTenx() {
		return tenx;
	}
	public void setTenx(String tenx) {
		this.tenx = tenx;
	}
	public int getImagex() {
		return Imagex;
	}
	public void setImagex(int imagex) {
		Imagex = imagex;
	}
	@Override
	public String toString() {
		return tenx;
	}
	public MonAn() {
		// TODO Auto-generated constructor stub
	 
	}
	public MonAn(String Tenx,  int ImaGex) {
		this.tenx = Tenx;
		this.Imagex = ImaGex;
	}
}
