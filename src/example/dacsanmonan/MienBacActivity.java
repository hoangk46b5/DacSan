package example.dacsanmonan;

import java.util.ArrayList;
import java.util.List;

import obj.ChuDe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
public class MienBacActivity extends Activity {
	List<ChuDe> listChuDe = new ArrayList<ChuDe>();
	VietnameseView adapterChude;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mien_bac);
		final ListView listview = (ListView) findViewById(R.id.listViewMienBac);
		loadData();
		adapterChude = new VietnameseView(MienBacActivity.this, listChuDe);
		listview.setAdapter(adapterChude);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				DetalActivity.listDetail.clear();
				DetalActivity.listDetail.add(listChuDe
						.get(position));
				Intent in = new Intent(MienBacActivity.this,
						DetalActivity.class);
				startActivity(in);
			}
		});
		//tim kiem
		
	}
	void loadData(){
		List<ListItem> tv_BanhKhuc = new ArrayList<ListItem>();
		tv_BanhKhuc.add(new ListItem("Bánh khúc nóng hổi", " Bạn cần chuẩn bị những nguyên liệu sau để làm khoảng 15 cái bánh khúc cỡ 100g :" +"\n"
			+ "- 1kg gạo nếp" +"\n" +"- 200g đỗ xanh"+"\n" +"- 100g thịt ba chỉ"+"\n" +"- 300g lá khúc"+"\n" +"- 200g bột nếp, 100g bột gạo tẻ"+"\n" +"- Muối, gia vị, nước mắm, dầu ăn, hạt tiêu, hành khô",
			" * Cách làm :" +"\n"+"\n"+ " 1, Đỗ ngâm 3 tiếng rồi đem đồ chín với 1 nhúm muối. Gạo nếp vo sạch ngâm 4-6 tiếng, vớt ra rổ để ráo nước. "+"\n"+"\n"+" 2, Rau khúc rửa sạch, để riêng phần già và phần ngọn non. Phần rau già bạn chỉ dùng để xay lấy nước cho bánh xanh và vứt bã đi, dùng nước đó tiếp tục cho phần rau non vào xay cùng. " +"\n"+"\n"+
					" 3, Bạn chú ý cho thật ít nước vừa đủ để máy chạy được thôi nhé vì khi trộn bột cũng không cần quá nhiều nước đâu. Sau đó vớt riêng cái ra." + "\n" + "Phần nước đem đun sôi để trộn với bột."+"\n"+"\n"+
					" 4, Bột nếp + bột gạo tẻ trộn chung với 1 nhúm muối, 2 thìa canh dầu ăn, phần cái rau đã để riêng rồi từ từ chế nước rau đã đun sôi vào để nhào bột. Bột cần rất ít nước nên bạn hãy cho từng ít một, lúc đầu có thể cảm giác bột rất khô và dính tay nhưng trộn một lúc sẽ có một khối bột dẻo mịn."+"\n"+"\n"+
					"Sau khi đỗ chín thì dùng chày nghiền mịn khi đỗ còn nóng."+"\n"+"\n"+" 5, Thịt ba chỉ thái con chì, ướp với 1 thìa café nước mắm, ½ thìa café gia vị, hành khô băm nhỏ, hạt tiêu trong khoảng 30 phút. Tiếp tục bóc thêm 1 củ hành khô thái lát mỏng, sau đó cho vào chảo dầu phi thơm, bạn nên cho nhiều dầu 1 chút nhé!"+"\n"+"\n"+
					" 6, Cho thịt vào xào săn lại thì tắt bếp. Rồi trộn tất cả đỗ vào chảo thịt cho đều."+"\n"+"\n"+"7, Nặn phần bột thành 15 phần bằng nhau. Đậu và thịt cũng nặn tương tự.Ấn dẹt viên bột rồi cho nhân đậu vào giữa, viên kín nhân lại cho tròn."+"\n"+"\n"+
					" 8, Sau đó lăn qua gạo nếp đã để ráo nước và trộn với ½ thìa canh gia vị.Đem hấp xôi trong chõ đến khi chín (khoảng 40 phút), bạn cố gắng để phần gạo bao kín lấy phần bánh bên trong nhé! . Giờ thì lấy bánh khúc ra và thưởng thức ngay khi nó còn nóng hổi bạn nhé!",R.drawable.banhkhuc));
	
		ChuDe cd_BanhKhuc = new ChuDe();
		cd_BanhKhuc.setIdChude("Bánh Khúc nóng hổi");
		
		cd_BanhKhuc.setImage(R.drawable.banhkhuc);
		cd_BanhKhuc.setListTuVung(tv_BanhKhuc);
		listChuDe.add(cd_BanhKhuc);
	
	// ==================================================
	
		List<ListItem> tv_CheBaCot = new ArrayList<ListItem>();
		tv_CheBaCot.add(new ListItem("Chè Bà Cốt", " Để nấu chè bà cốt bạn cần chuẩn bị những nguyên liệu sau đây:" +"\n"+ "- 200g gạo nếp"+"\n"+"- 280g đường phên hoặc đường hoa mai"+"\n"+"- 40 – 50g gừng tươi1 chút xíu muối",
			" * Cách Làm :" +"\n"+"\n"+ " 1, Gạo nếp vo sạch, để ráo."+"\n"+"\n"+ " 2, Đổ đường hoa mai vào nồi, thêm 800ml nước lạnh vào hòa tan đường. " +"\n"+"\n"+ " 3, Đổ gạo nếp đã vo sạch vào nồi nước đường, ninh gạo. Bạn không nên khuấy chè quá nhiều sẽ làm nát hạt gạo, thỉnh thoảng đảo qua để tránh gạo nở bị bén nồi là được." +"\n"+"\n"+ 
					" 4, Trong lúc ninh chè, gừng đem gọt vỏ, thái miếng rồi đem giã nhỏ. Cho chút nước vào gừng, lọc qua rây để lấy nước cốt. " +"\n"+"\n"+ " 5, Kiểm tra nồi chè thấy hạt gạo nở to thì từ từ đổ nước cốt gừng vào, vừa đổ vừa dùng đũa khuấy đều." +"\n"+"\n"+ " 6, Đậy vung lại, vặn nhỏ lửa và ninh tiếp chừng 10 phút nữa là được. " 
					+"\n"+"\n"+ " 7, Múc chè bà cốt ra bát, ăn nóng. " , R.drawable.mon3));
	
		ChuDe cd_CheBaCot = new ChuDe();
		cd_CheBaCot.setIdChude("Chè bà cốt");
		cd_CheBaCot.setImage(R.drawable.mon3);
		cd_CheBaCot.setListTuVung(tv_CheBaCot);
		listChuDe.add(cd_CheBaCot);
	
	//=====================================================
	
		List<ListItem> tv_PhoGa = new ArrayList<ListItem>();
		tv_PhoGa.add(new ListItem("Phở Gà siêu ngon"," Với cách nấu phở gà này bạn cần chuẩn bị những nguyên liệu sau cho 2-3 người ăn: " +"\n"+"- 1/2 con gà ta (khoảng 1.2kg)" +"\n" +"- 2 cánh hoa hồi" +"\n"+"- 1 muỗng canh hạt mùi" +"\n" + "- 100g giá đỗ" +"\n"+"- 1 nắm rau mùi" +"\n"+ "- 1 củ hành tây, 1 mẩu gừng, 2 củ hành khô"+"\n"+"- Mắm, muối, hạt nêm",
				" * Cách làm :" +"\n"+"\n"+ " 1, Đổ nước lạnh ngập mặt gà trong nồi, cho gừng, hành khô, hoa hồi và hạt mùi vào cùng 1 muỗng canh gia vị (bột canh), bật lửa lớn đun sôi. Sau khi nước sôi bạn giảm xuống lửa nhỏ đun tiếp 15 phút nữa thì tắt bếp." +"\n"+"\n"+ " 2, Gà chín bạn vớt ra đĩa, để ráo rồi lóc lấy phần thịt, thái miếng vừa ăn. Phần nước còn " +
						"lại trong nồi bạn lọc lại qua rây rồi đun sôi lại, nêm nếm cho vừa ăn." +"\n"+"\n"+ " 3, Rau mùi và giá đỗ nhặt rửa sạch, để ráo rồi bày ra một đĩa riêng cùng hành tây xắt lát mỏng và ớt, chanh." +"\n"+"\n"+ " 4, Khi ăn bạn chần phở rồi sắp ra bát, bày giá đỗ, rau mùi, hành tây và thịt gà lên trên cùng vài lớt ớt tùy thích." +"\n"+"\n"+ 
						" 5, Chan nước dùng lên, ăn nóng kèm tương ớt, tương đen phở hay chanh, ớt tùy thích.", R.drawable.phoga ));
		ChuDe cd_PhoGa = new ChuDe();
		cd_PhoGa.setIdChude("Phở Gà siêu ngon");
		cd_PhoGa.setImage(R.drawable.phoga);
		cd_PhoGa.setListTuVung(tv_PhoGa);
		listChuDe.add(cd_PhoGa);
	
	//=====================================================
	
		List<ListItem> tv_CheConOng = new ArrayList<ListItem>();
		tv_CheConOng.add(new ListItem("Chè con ong dẻo thơm"," Bạn cần chuẩn bị những nguyên liệu sau để nấu chè con ong: " + "\n" + "- 500g gạo nếp"+ "\n" +"- 500g đường mật"+ "\n" + "- 1 củ gừng" + "\n" + "Lạc rang, vừng rang",
				"Cách làm :" +"\n"+"\n"+ " 1, Gạo nếp vo sạch, ngâm nước qua đêm." +"\n"+"\n"+ " 2, Gừng rửa sạch, không bỏ vỏ rồi giã dập vắt lấy nước cốt, bạn có thể thêm chút nước nóng vào trộn rồi lọc bã qua rây nhé." +"\n"+"\n"+ " 3, Gạo nếp trộn với một nhúm muối, đem đồ hoặc nấu chín thành xôi." +"\n"+"\n"+
							" 4, Chuẩn bị một chiếc nồi gang (hoặc nồi có đế dày) để nấu chè, cho đường mật cùng 1 bát con nước vào đun đến khi đường tan hết, nước đường sánh." +"\n"+"\n"+ " 5, Nấu đến khi nước đường cạn thì tắt bếp." +"\n"+"\n"+ " 6, Lấy chè con ong ra đĩa, rắc lạc rang và vừng rang lên đĩa, để nguội là bạn có thể thưởng thức.",R.drawable.checonong));

		ChuDe cd_CheConOng = new ChuDe();
		cd_CheConOng.setIdChude("Chè con ong dẻo thơm");
		cd_CheConOng.setImage(R.drawable.checonong);
		cd_CheConOng.setListTuVung(tv_CheConOng);
		listChuDe.add(cd_CheConOng);
	

	//========================================================

		List<ListItem> tv_GioXao = new ArrayList<ListItem>();
		tv_GioXao.add(new ListItem("Giò Xào đón tết"," Với cách làm giò xào này bạn cần chuẩn bị những nguyên liệu sau: " + "\n" +"- 1 cái tai lợn chừng 500g"+ "\n" + "- 300g thịt chân giò, hoặc thịt mũi, thịt thủ nếu bạn ăn được mỡ" + "\n" + "- 50g mộc nhĩ, hạt tiêu, 3 củ hành khô" + "\n" + "- Nước mắm, muối hạt.",
				"Cách làm :" +"\n"+"\n"+ " 1, Thịt mua về bóp muối hạt, cạo sạch lông rồi rửa thật sạch." +"\n"+"\n"+ " 2, Thái thịt hình con chì cỡ ngón tay." +"\n"+"\n"+ " 3, Phần có mỡ bạn nên thái mỏng hơn 1 chút." +"\n"+"\n"+ "  Mộc nhĩ ngâm nở thái sợi." +"\n"+"\n"+ "  Đổ nước ngập mặt thịt, đun đến khi sôi sùi" +
						" hết bọt đen thì tắt bếp." +"\n"+"\n"+ " 4, Cho thịt ra rửa lại bằng nước lạnh cho sạch rồi để ráo nước." +"\n"+"\n"+ " 5, Hành khô thái nhỏ." +"\n"+"\n"+ "  Cho dầu ăn vào chảo, phi thơm hành khô." +"\n"+"\n"+ " 6, Sau đó cho thịt vào xào, nêm 2 thìa canh nước mắm (bạn chỉ nên dùng nước mắm thôi cho thịt được thơm nhé)."
						+"\n"+"\n"+" 7, Cho giò vào 1 chai lavi 1,5l đã cắt bỏ miệng, vừa múc giò vào vừa dùng muôi ấn chặt xuống, giò sẽ tiết ra rất nhiều mỡ và bạn có thể gạn ra nhé.",R.drawable.mon3));

		ChuDe cd_GioXao = new ChuDe();
		cd_GioXao.setIdChude("Giò Xào đón tết");
		cd_GioXao.setImage(R.drawable.mon3);
		cd_GioXao.setListTuVung(tv_GioXao);
		listChuDe.add(cd_GioXao);
		
	//========================================================

		List<ListItem> tv_ChaRuoi = new ArrayList<ListItem>();
		tv_ChaRuoi.add(new ListItem("Giò Xào đón tết"," Với cách làm giò xào này bạn cần chuẩn bị những nguyên liệu sau: " + "\n" +"- 1 cái tai lợn chừng 500g"+ "\n" + "- 300g thịt chân giò, hoặc thịt mũi, thịt thủ nếu bạn ăn được mỡ" + "\n" + "- 50g mộc nhĩ, hạt tiêu, 3 củ hành khô" + "\n" + "- Nước mắm, muối hạt.",
				"Cách làm :" +"\n"+"\n"+ " 1, Thịt mua về bóp muối hạt, cạo sạch lông rồi rửa thật sạch." +"\n"+"\n"+ " 2, Thái thịt hình con chì cỡ ngón tay." +"\n"+"\n"+ " 3, Phần có mỡ bạn nên thái mỏng hơn 1 chút." +"\n"+"\n"+ "  Mộc nhĩ ngâm nở thái sợi." +"\n"+"\n"+ "  Đổ nước ngập mặt thịt, đun đến khi sôi sùi" +
						" hết bọt đen thì tắt bếp." +"\n"+"\n"+ " 4, Cho thịt ra rửa lại bằng nước lạnh cho sạch rồi để ráo nước." +"\n"+"\n"+ " 5, Hành khô thái nhỏ." +"\n"+"\n"+ "  Cho dầu ăn vào chảo, phi thơm hành khô." +"\n"+"\n"+ " 6, Sau đó cho thịt vào xào, nêm 2 thìa canh nước mắm (bạn chỉ nên dùng nước mắm thôi cho thịt được thơm nhé)."
						+"\n"+"\n"+" 7, Cho giò vào 1 chai lavi 1,5l đã cắt bỏ miệng, vừa múc giò vào vừa dùng muôi ấn chặt xuống, giò sẽ tiết ra rất nhiều mỡ và bạn có thể gạn ra nhé.", R.drawable.charuoi));

		ChuDe cd_ChaRuoi = new ChuDe();
		cd_ChaRuoi.setIdChude("Chả Rươi");
		cd_ChaRuoi.setImage(R.drawable.charuoi);
		cd_ChaRuoi.setListTuVung(tv_ChaRuoi);
		listChuDe.add(cd_ChaRuoi);
	}
	
}