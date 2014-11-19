package obj;

import java.util.List;

import example.dacsanmonan.ListItem;

public class ChuDe {
	private String idChude;
	private List<ListItem>listMonAn;
	int image;

	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	public String getIdChude() {
		return idChude;
	}
	public void setIdChude(String idChude) {
		this.idChude = idChude;
	}
	public List<ListItem> getListTuVung() {
		return listMonAn;
	}
	public void setListTuVung(List<ListItem> listMonAn) {
		this.listMonAn = listMonAn;
	}
	public ChuDe(){}
	
	public ChuDe(String idChude, List<ListItem> listMonAn,int image) {
		super();
		this.idChude = idChude;
		this.listMonAn = listMonAn;
		this.image = image;
	}
	public ChuDe(String idChude, List<ListItem> listMonAn) {
		this.idChude = idChude;
		this.listMonAn = listMonAn;
	}
	
	@Override
	public String toString() {
		return  idChude ;
	}

}
