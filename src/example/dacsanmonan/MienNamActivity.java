package example.dacsanmonan;

import java.util.ArrayList;
import java.util.List;

import obj.ChuDe;
import example.dacsanmonan.R;
import example.dacsanmonan.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MienNamActivity extends Activity {
	List<ChuDe> listChuDe = new ArrayList<ChuDe>();
	VietnameseView adapterChude;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mien_nam);
		final ListView listview = (ListView) findViewById(R.id.listViewMienNam);
		loadData();
		adapterChude = new VietnameseView(MienNamActivity.this, listChuDe);
		listview.setAdapter(adapterChude);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				DetalActivity.listDetail.clear();
				DetalActivity.listDetail.add(listChuDe
						.get(position));
				Intent in = new Intent(MienNamActivity.this,
						DetalActivity.class);
				startActivity(in);
			}
		});
		
	}
	void loadData (){
		List<ListItem> tv_CaKhoTieu = new ArrayList<ListItem>();
		tv_CaKhoTieu.add(new ListItem("Cá kho tiêu Miền Nam", " Nguyên liệu :" + "\n" + "- 300g cá lóc" + "\n" + "- 1 thìa cà phê tỏi băm" + "\n" + "- 2 thìa cà phê đầu hành lá băm"
				+ "\n" + "- 1/2 thìa cà phê ớt băm" + "\n" + "- 1 gói gia vị cá kho" + "\n" + "- 1/4 thìa cà phê tiêu xay" + "\n" + "- 1,5 thìa súp dầu ăn" + "\n" + "- 2/3 chén nước sạch",
				" Cách làm :" +"\n"+"\n"+ " 1, Cá lóc rửa sạch, xắt miếng vừa ăn, ướp với tỏi băm, đầu hành lá, ớt, dầu ăn và gói gia vị hoàn chỉnh cá kho. Để khoảng 15 phút cho cá thấm gia vị." +
						"" +"\n"+"\n"+ " " +
						"2, Cho cá vào nồi, chiên sơ với lửa nhỏ khoảng 5 phút hoặc đến khi thịt cá săn lại. Trở đều hai mặt để cá thấm gia vị." +"\n"+"\n"+ " 4, Chế nước lọc vào đun vừa sôi, giảm " +
								"lửa nhỏ, kho khoảng 15 phút hoặc đến khi nước xốt sệt lại là được."
						+"\n"+"\n"+ " 5, Múc cá ra đĩa, rắc vào ít tiêu xay. Dùng nóng với cơm trắng.",R.drawable.cakhotieu));

		ChuDe cd_CaKhoTieu = new ChuDe();
		cd_CaKhoTieu.setIdChude("Cá kho tiêu Miền Nam");
		cd_CaKhoTieu.setImage(R.drawable.cakhotieu);
		cd_CaKhoTieu.setListTuVung(tv_CaKhoTieu);
		listChuDe.add(cd_CaKhoTieu);
		
		//==========================================================
		
		List<ListItem> tv_BanhTrangTron = new ArrayList<ListItem>();
		tv_BanhTrangTron.add(new ListItem("Bánh tráng trộn", " Nguyên liệu: " +"\n"+ "- Bánh tráng vụn" +"\n"+ "- Trứng cút luộc chín" +"\n"+ "- Rau răm xắt nhỏ" +"\n"+ "- Hành lá xắt nhỏ, dầu ô liu"
		+"\n"+ "- Ruốc xào qua với đường và chút bột ngọt",
				"Cách làm : " +"\n"+"\n"+ " 1, Đun sôi dầu ô liu rồi đổ vào chén hành đã xắt nhỏ: " +"\n"+"\n"+ " 2, Làm cách này hành sẽ chín mà vẫn giữ được màu xanh đẹp" +"\n"+"\n"+ " 3, Cho hành, " +
						"rau răm, trứng, ruốc, muối vào trộn đều với bánh tráng. Các mẹ có thể đeo bao tay ni lông vào để trộn cho nhanh mềm bánh tráng nhé"
						+"\n"+"\n"+ " 4, Xong rồi ạ, mời cả nhà cùng thưởng thức nào:",R.drawable.banhtrangtron));

		ChuDe cd_BanhTrangTron = new ChuDe();
		cd_BanhTrangTron.setIdChude("Bánh tráng trộn");
		cd_BanhTrangTron.setImage(R.drawable.banhtrangtron);
		cd_BanhTrangTron.setListTuVung(tv_BanhTrangTron);
		listChuDe.add(cd_BanhTrangTron);
		
		//==========================================================
		
		List<ListItem> tv_GoiBuoi = new ArrayList<ListItem>();
		tv_GoiBuoi.add(new ListItem("Gỏi bưởi chua lạ", " Nguyên liệu: " +"\n"+ "- 200gr bưởi tách múi, không tách quá nhỏ nếu không bưởi sẽ khô" +"\n"+ "- Rau xăm xắt nhuyễn" +"\n"+ "- Ruốc tôm, trứng cút" 
		+"\n"+ "- Đậu phộng.",
				"Cách làm : " +"\n"+"\n"+ " 1, Cho bưởi, rau răm, ruốc tôm và trứng cút, đậu phộng lần lượt vào tô." +"\n"+"\n"+ " 2, Rưới đều nước trộn và trộn đều " +"\n"+"\n"+ " 3, Bỏ tủ lạnh 15 phút trước " +
						"khi ăn" +"\n"+"\n"+ " 4, Món này ăn rất ngon mà còn có tác dụng giảm cân nữa các mẹ ạ",R.drawable.goibuoi));

		ChuDe cd_GoiBuoi = new ChuDe();
		cd_GoiBuoi.setIdChude("Gỏi bưởi chua lạ");
		cd_GoiBuoi.setImage(R.drawable.goibuoi);
		cd_GoiBuoi.setListTuVung(tv_GoiBuoi);
		listChuDe.add(cd_GoiBuoi);
		
		//==========================================================
		
		List<ListItem> tv_ThitHeoKho = new ArrayList<ListItem>();
		tv_ThitHeoKho.add(new ListItem("Thịt Heo kho nhừ", " Nguyên liệu:" +"\n"+ "- ½ kg thịt loại thịt đùi" +"\n"+ "- 5 quả trứng gà luộc chín bóc vỏ" +"\n"+ "- 4 muỗng canh nước mắm" +"\n"+ "- 1 muỗng cà phê muối"
					+"\n"+"- 1 trái dừa tươi" +"\n"+ "- 2 tép tỏi đập dập" +"\n"+ "- ¼ quả ớt sừng trâu chín đỏ" +"\n"+ "- 2 viên đường phèn", " Cách làm : " +"\n"+"\n"+ " 1, Thịt heo cắt khúc khoảng 5 hay 6 cm có da, mỡ, thịt. Luộc qua" +
					" nước sôi vớt ráo.  (Cách này  tránh nhiều bọt khi kho thịt )"
					+"\n"+"\n"+ " 2, Tỏi, ớt đập dập bằm nhuyễn hay ép lấy nước cho vào nồi cùng nước dừa, muối đun sôi. Cho thịt vào và vớt bọt, vớt cặn tỏi bỏ đi." +"\n"+"\n"+ " 3, Thêm khoảng 3 phần nước lạnh, trứng gà vào " +
					"nồi đun với lửa riu riu thịt từ từ mềm, nước cạn dần và chuyển màu nâu. Khoảng 1 giờ."
					+"\n"+"\n"+ " 4, Nêm lại với nước mắm, đường phèn cho ngọt nhẹ và mặn mặn là được. Tiếp tục đun với lửa riu riu tới khi thịt mềm là được. (Khoảng 1 giờ)" +"\n"+"\n"+ 
					" 5, Thịt kho rệu ăn với cơm trắng kèm dĩa dưa cải, dưa giá hay dưa củ cải, rau sống chấm kèm rất ngon.",R.drawable.thitheokho));

		ChuDe cd_ThitHeoKho = new ChuDe();
		cd_ThitHeoKho.setIdChude("Thịt Heo kho nhừ");
		cd_ThitHeoKho.setImage(R.drawable.thitheokho);
		cd_ThitHeoKho.setListTuVung(tv_ThitHeoKho);
		listChuDe.add(cd_ThitHeoKho);
		
		//==========================================================
		
		List<ListItem> tv_BanhChuoi = new ArrayList<ListItem>();
		tv_BanhChuoi.add(new ListItem("Bánh Chuối hấp", " Bạn cần chuẩn bị những nguyên liệu sau để làm bánh chuối hấp:"+"\n"+ "- 3 quả chuối tây chín "+"\n"+ "- 50g đường cát" +"\n"+ "- 100g bột năng" +"\n"+ "- 170ml nước"
						+"\n"+ "- Lạc rang, nước cốt dừa, vài giọt phẩm màu vàng"," Cách làm :" +"\n"+"\n"+ " 1, Chuối thái khoanh tròn chừng 1 cm." +"\n"+"\n"+ " 2, Cho chuối vào 170ml nước luộc đến khi sôi chừng 3 phút." +"\n"+"\n"+ " 3, Vớt chuối ra, dùng phần nước chờ nguội rồi hòa với bột" +
						" và đường cho tan" +"\n"+"\n"+ " 4, Chuẩn bị khuôn hấp, bôi một lớp dầu ăn mỏng vào khuôn, xếp một lớp chuối rồi đổ bột ngập mặt chuối."
						+"\n"+"\n"+ " 5, Đem hấp đến khi thấy bánh trong thì bắt đầu đổ lớp tiếp theo lên, cứ làm như vậy cho đến hết." +"\n"+"\n"+ " 6, Dùng dao mỏng và sắc lách qua thành khuôn để lấy bánh ra" +"\n"+"\n"+ " 7, Xếp bánh" +
						" xuống dưới, rắc lạc rang và nước cốt dừa lên trên là bạn đã hoàn thành món bánh chuối hấp cực ngon rồi đấy!",R.drawable.banhchuoi));

		ChuDe cd_BanhChuoi = new ChuDe();
		cd_BanhChuoi.setIdChude("Bánh Chuối hấp");
		cd_BanhChuoi.setImage(R.drawable.banhchuoi);
		cd_BanhChuoi.setListTuVung(tv_BanhChuoi);
		listChuDe.add(cd_BanhChuoi);
		
		//==========================================================
		
		List<ListItem> tv_GoiXoai = new ArrayList<ListItem>();
		tv_GoiXoai.add(new ListItem("Gỏi xoài chua cay", " Để làm gỏi xoài bạn cần chuẩn bị những nguyên liệu sau:" +"\n"+ "- 1 trái xoài cỡ vừa" +"\n"+ "- Một mớ rau răm" +"\n"+ "- 100g khô cá lóc hoặc khô cá sặc" +"\n"+ "- 1-2 trái ớt" +"\n"+ 
					"- Nước mắm, đường."," Cách làm :" +"\n"+"\n"+ " 1, Xoài gọt vỏ, bào sợi." +"\n"+"\n"+ " 2, Rau răm nhặt rửa sạch, để ráo." +"\n"+"\n"+ " 3, Ớt bỏ hạt, bằm nhỏ" +"\n"+"\n"+ " 4, Nướng chín cá trên bếp gas. Một số chỗ có thể bị cháy xém một chút cũng " +
					"không sao bạn nhé!" +"\n"+"\n"+ " 5, Cá nướng xong bạn cho ra thớt, dùng chày đập dập" +"\n"+"\n"+ " 6, Đập cá xong bạn xé cá thành dạng sợi to, để riêng." +"\n"+"\n"+ " 7, Pha nước trộn gỏi: pha 1 muỗng canh đường với 2 muỗng canh nước lọc, sau đó thêm nước mắm vào nếm " +
					"độ mặn	 ngọt vừa phải rồi mới " +
					"cho ớt. " +"\n"+"\n"+  "Lấy 2 chiếc đũa, trộn đều. ",R.drawable.goixoai));

		ChuDe cd_GoiXoai = new ChuDe();
		cd_GoiXoai.setIdChude("Gỏi xoài chua cay");
		cd_GoiXoai.setImage(R.drawable.goixoai);
		cd_GoiXoai.setListTuVung(tv_GoiXoai);
		listChuDe.add(cd_GoiXoai);
		
		//==========================================================
		
		List<ListItem> tv_CheXoai = new ArrayList<ListItem>();
		tv_CheXoai.add(new ListItem("Gỏi bưởi chua lạ", " Nguyên liệu: " +"\n"+ "- 200gr bưởi tách múi, không tách quá nhỏ nếu không bưởi sẽ khô" +"\n"+ "- Rau xăm xắt nhuyễn" +"\n"+ "- Ruốc tôm, trứng cút" +"\n"+ "- Đậu phộng.",
						"Cách làm : " +"\n"+"\n"+ " 1, Cho bưởi, rau răm, ruốc tôm và trứng cút, đậu phộng lần lượt vào tô." +"\n"+"\n"+ " 2, Rưới đều nước trộn và trộn đều " +"\n"+"\n"+ " 3, Bỏ tủ lạnh 15 phút trước khi ăn" +"\n"+"\n"+ " 4, Món này ăn rất ngon" +
						" mà còn có tác dụng giảm cân nữa các mẹ ạ",R.drawable.chexoai));

		ChuDe cd_CheXoai= new ChuDe();
		cd_CheXoai.setIdChude("Gỏi bưởi chua lạ");
		cd_CheXoai.setImage(R.drawable.chexoai);
		cd_CheXoai.setListTuVung(tv_CheXoai);
		listChuDe.add(cd_CheXoai);
				
		//==========================================================
		
		List<ListItem> tv_BanhDua = new ArrayList<ListItem>();
		tv_BanhDua.add(new ListItem("Bánh Dứa Nướng", " Nguyên liệu: " +"\n"+ "- 200gr bưởi tách múi, không tách quá nhỏ nếu không bưởi sẽ khô" +"\n"+ "- Rau xăm xắt nhuyễn" +"\n"+ "- Ruốc tôm, trứng cút" +"\n"+ "- Đậu phộng.",
						"Cách làm : " +"\n"+"\n"+ " 1, Cho bưởi, rau răm, ruốc tôm và trứng cút, đậu phộng lần lượt vào tô." +"\n"+"\n"+ " 2, Rưới đều nước trộn và trộn đều " +"\n"+"\n"+ " 3, Bỏ tủ lạnh 15 phút trước khi ăn" +"\n"+"\n"+ " 4, Món này ăn rất ngon mà" +
						" còn có tác dụng giảm cân nữa các mẹ ạ",R.drawable.banhdua));

		ChuDe cd_BanhDua = new ChuDe();
		cd_BanhDua.setIdChude("Bánh Dứa Nướng");
		cd_BanhDua.setImage(R.drawable.banhdua);
		cd_BanhDua.setListTuVung(tv_BanhDua);
		listChuDe.add(cd_BanhDua);
	
	}
	
	}