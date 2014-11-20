package example.dacsanmonan;

import java.util.ArrayList;
import java.util.List;

import obj.ChuDe;
import example.dacsanmonan.R;
import example.dacsanmonan.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MienTrungActivity extends Activity {
	ArrayList<ChuDe> arrayList = new ArrayList<ChuDe>();
	VietnameseView adapter;
	ListView lv;
	Button btnSearch;
	private ArrayList<ChuDe> arr_sort = new ArrayList<ChuDe>();
	EditText txtWord;
	int textlength = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mien_bac);
		
		txtWord = (EditText) findViewById(R.id.txtWord);
		lv = (ListView) findViewById(R.id.listViewMienBac);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				DetalActivity.listDetail.clear();
				DetalActivity.listDetail.add(arrayList
						.get(position));
				Intent in = new Intent(MienTrungActivity.this,
						DetalActivity.class);
				startActivity(in);
			}
		});
		
		loadData();
		btnSearch = (Button) findViewById(R.id.btnSearch);
		btnSearch.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				onTextChanged();
			}
		});
		adapter = new VietnameseView(this, arrayList);
		lv.setAdapter(adapter);
		
	}

	public void onTextChanged() {
		textlength = txtWord.getText().length();
		arr_sort.clear();
		for (int i = 0; i < arrayList.size(); i++) {
			String _text = (String) arrayList.get(i).getIdChude();
			if (textlength <= _text.length()) {
				if (txtWord
						.getText()
						.toString()
						.equalsIgnoreCase(
								(String) _text.subSequence(0, textlength))) {
					Log.i("array sort", _text);
					arr_sort.add(arrayList.get(i));
				}
			}
		}
		adapter = new VietnameseView(MienTrungActivity.this, arr_sort);
		lv.setAdapter(adapter);
	}
	void loadData (){
		List<ListItem> tv_KeoMeXung = new ArrayList<ListItem>();
		tv_KeoMeXung.add(new ListItem("Kẹo mè xửng", " Bạn cần chuẩn bị những nguyên liệu sau để làm kẹo mè xửng: " +"\n"+ "- 115g đường mạch nha" +"\n"+ "- 300g đường" +"\n"+ "- 90g siro ngô (corn syrup)" +"\n"+ 
		"- 200g đậu phộng rang bóc vỏ" +"\n"+ "- 200g mè vàng rang" +"\n"+ "- 450ml nước" +"\n"+ "- 60g bột năng" +"\n"+ "- 1 muỗng súp nước cốt chanh" +"\n"+ "- 23g dầu phộng ",
		 " Cách làm : " +"\n"+"\n"+ " 1, Thoa 1 lớp dầu ăn quanh khuôn rồi áo đều 1 lớp mè rang." +"\n"+"\n"+ " 2, Cho đường và chỗ nước còn lại vào nồi. Bắc lên bếp để lửa vừa cho đến khi đường tan thì thêm dầu phộng vào."
				 +"\n"+"\n"+ " 3, Khi thấy hỗn hợp đường bắt đầu sệt lại thì cho tiếp nước cốt chanh vào. Vẫn trộn đều và khuấy liên tục đến lúc đường đặc lại thành một khối thống nhất nhưng vẫn có độ dẻo sánh." +"\n"+"\n"+ 
				 " 4, Cho hết phần đậu phộng rang, vani vào quậy mạnh cho đậu dàn đều hỗn hợp đường nhưng không làm cho đậu bị bể nát.",R.drawable.mexung));

		ChuDe cd_KeoMeXung = new ChuDe();
		cd_KeoMeXung.setIdChude("Kẹo mè xửng");
		cd_KeoMeXung.setImage(R.drawable.mexung);
		cd_KeoMeXung.setListTuVung(tv_KeoMeXung);
		arrayList.add(cd_KeoMeXung);
	
	
	//========================================================
		
		List<ListItem> tv_BanhRam = new ArrayList<ListItem>();
		tv_BanhRam.add(new ListItem("Bánh Ram ít dẻo", " Bạn cần chuẩn bị những nguyên liệu sau để làm bánh ram ít: " +"\n"+ "- 500g bột nếp ướt" +"\n"+ "- 100g bột gạo tẻ" +"\n"+ "- 100g thịt ba chỉ heo"
				+"\n"+ "- 200g tôm " +"\n"+ "- Hành lá, ớt, hành khô" +"\n"+ "- Dầu ăn, nước mắm, ", " Cách làm : " +"\n"+"\n"+ " 1, Tôm bóc vỏ thái nhỏ, ½ chỗ tôm sẽ dùng làm nhân bánh, ½ dùng để làm ruốc tôm rắc lên trên bánh." +"\n"+"\n"+ " 2, Thịt heo thái hạt lựu."
				+"\n"+"\n"+ " 3, Trộn ½ lượng tôm, thịt heo với ½ thìa canh nước mắm, hạt tiêu, hành khô bằm nhỏ, sa tế ướp chừng 30 phút." +"\n"+"\n"+ " 4, Phi thơm hành khô, cho thịt và tôm vào xào săn, thơm vàng." +"\n"+"\n"+ 
				" 5, Trong 1 chảo khác cho ½ chỗ tôm còn lại vào đảo đều." +"\n"+"\n"+ " 6, Dùng muỗng gỗ miết tôm đến khi nhỏ mín" +"\n"+"\n"+ " 7, Xào tới khi tôm vàng thơm." +"\n"+"\n"+ " 8, Chia bột nếp thành những viên tròn nhỏ, Sau đó cho nhân bánh vào giữa." +"\n"+"\n"+ 
				" 9, Viên tròn lại, làm đến khi hết bột và nhân. Đem hấp hoặc luộc tới khi bánh chín. Nếu luộc thì khi bánh chín nổi lên khoảng 2 phút bạn vớt ngay ra bát nước lạnh nhé." +"\n"+"\n"+ " 10, Tiếp tục dùng bột sống vê thành những viên cỡ trái quất, ấn dẹt." +"\n"+"\n"+ 
				" 11, Mỗi viên bánh hấp bạn đặt lên 1 miếng bánh chiên, rắc 1 chút ruốc tôm và mỡ hành lên trên và chuẩn bị thêm 1 bát nước mắm ớt là bạn đã có món bánh cực ngon.",R.drawable.banhram));

		ChuDe cd_BanhRam = new ChuDe();
		cd_BanhRam.setIdChude("Bánh Ram ít dẻo");
		cd_BanhRam.setImage(R.drawable.banhram);
		cd_BanhRam.setListTuVung(tv_BanhRam);
		arrayList.add(cd_BanhRam);
		
	//========================================================

		List<ListItem> tv_MutChum = new ArrayList<ListItem>();
		tv_MutChum.add(new ListItem("Mứt chùm ruột", " Bạn cần chuẩn bị những nguyên liệu sau để làm mứt chùm ruột: " +"\n"+ "- 1kg chùm ruột tươi" +"\n"+ "- 500g đường " +"\n"+ "- 1 củ gừng loại vừa rửa sạch vỏ" +"\n"+ "- 1 thìa ớt bột"+"\n"+ "- Muối",
				" Cách làm :" +"\n"+"\n"+ " 1, Chùm ruột nhặt sạch cuống từng quả sau đó ngâm vào nước muối loãng trong 3 giờ." +"\n"+"\n"+ " 2, Lấy mỗi lần 15-20 trái chùm ruột đặt lên mặt bàn sạch,dùng 1 tấm thớt đặt nhẹ lên." +"\n"+"\n"+ " 3, Dùng 1 tấm khăn sạch cho từng ít chùm ruột vào vắt thặt ráo. "
						+"\n"+"\n"+ " 4, Ướp chùm ruột với đường, để từ 2-3 giờ cho đường tan,  và chùm ruột ngấm đường." +"\n"+"\n"+ " 5, Dùng một chảo dày cho chùm ruột vào và bắt đầu sên với lửa vừa." +"\n"+"\n"+ " 6, Khi đường tan hoàn toàn và bắt đầu sôi thì hạ lửa nhỏ lại. " +"\n"+"\n"+ 
						" 6, Đường sẽ bắt đầu sệt lại và chùm ruột bắt đầu chuyển từ màu xanh sang màu cam.",R.drawable.mutchum));

		ChuDe cd_MutChum = new ChuDe();
		cd_MutChum.setIdChude("Mứt chùm ruột");
		cd_MutChum.setImage(R.drawable.mutchum);
		cd_MutChum.setListTuVung(tv_MutChum);
		arrayList.add(cd_MutChum);
		
	//========================================================

		List<ListItem> tv_MyQuang = new ArrayList<ListItem>();
		tv_MyQuang.add(new ListItem("Mỳ quảng cực đơn giản ", " Bạn cần chuẩn bị những nguyên liệu sau để nấu mỳ Quảng: "+"\n"+ "- 200g thịt gà đùi đã lọc xương" +"\n"+ "- 100g tôm đồng" +"\n"+ "- Nước dùng gà" +"\n"+ "- 2 quả cà chua, rau sống" +"\n"+ "- Lạc rang, trứng gà"
						+"\n"+ "- 1kg mỳ Quảng" +"\n"+ "- Nước mắm, gia vị, dầu ăn, hạt tiêu, hành, tỏi, ớt, dầu điều "," Cách làm: " +"\n"+"\n"+ " 1, Thịt gà đã lóc xương rửa sạch, thái miếng nhỏ vừa ăn rồi ướp với nước mắm, gia vị, hạt tiêu, hành khô, tỏi, ớt băm nhỏ ít nhất 30 phút."
						+"\n"+"\n"+ " 2, Cà chua bóc vỏ thái nhỏ." +"\n"+"\n"+ " 3, Cho dầu vào chảo, cho tôm vào xào thơm sau đó múc ra bát." +"\n"+"\n"+ " 3, Tiếp tục cho dầu vào chảo, cho 1 củ hành khô bào mỏng vào phi thơm, cho thịt gà vào xào đến khi thịt săn lại."
						+"\n"+"\n"+ " 4, Cho tôm vào cùng thịt gà, thêm 1 muỗng nước dùng cho săm sắp mặt thịt, nêm thêm 1 chút đường vào đun sôi rồi vặn lửa nhỏ riu riu đến khi nước nhân sánh lại." +"\n"+"\n"+ " 5, Phi thơm hành khô trong chảo dầu.Sau đó cho cà chua vào xào nhừ."
						+"\n"+"\n"+ " 6, Thêm nước dùng để nấu nước chan mỳ. Tuy nhiên mỳ quảng là loại mỳ ăn khô nên không cần quá nhiều nước đâu bạn nhé! " +"\n"+"\n"+ " 7, Lạc rang dập làm đôi.Trứng luộc thái làm tư, nếu thích bạn có thể thay bằng trứng cút cũng được."
						+"\n"+"\n"+ " 8, Chần nhanh sợi mỳ qua nước nóng. Cho rau sống vào bát. Tiếp theo là cho mỳ lên, chan nước nhân (gồm thịt gà + tôm + nước thịt) và chút nước dùng (nồi nước nấu với cà chua) vào sao cho nước chỉ khoảng 1/3 bát, rắc lạc, trứng và bánh đa lên trên " +
								"là bạn đã hoàn thành món mỳ quảng rồi đấy.",R.drawable.myquang));

		ChuDe cd_MyQuang = new ChuDe();
		cd_MyQuang.setIdChude("Mỳ quảng cực đơn giản ");
		cd_MyQuang.setImage(R.drawable.myquang);
		cd_MyQuang.setListTuVung(tv_MyQuang);
		arrayList.add(cd_MyQuang);
		
		
	//========================================================

		List<ListItem> tv_BunChay = new ArrayList<ListItem>();
		tv_BunChay.add(new ListItem("Bún chay Huế", " Nguyên liệu:" +"\n"+ "- 200g các loại nấm: nấm đông cô, nấm kim châm, nấm rơm, nấm bào ngư, mỗi loại một ít" +"\n"+ "- 20g tàu hũ ky" +"\n"+ "- 1/2 thanh chả chay Huế" +"\n"+ "- một cọng hành boa-rô, hai cây sả, một củ hành tây trắng"
						+"\n"+ "- Một ít ngò gai, một muỗng xúp sa tế, hai lít nước dùng rau củ" +"\n"+ "- Bún Huế (loại bún cọng to), rau sống, xà lách, bắp chuối bào dùng kèm, dầu ăn vừa đủ.",
						"Cách làm :" +"\n"+"\n" + " 1, Nước rau củ nấu từ củ cải trắng, cà rốt, nấm bào ngư, có thể lược lại cho trong."  +"\n"+"\n"+ " 2,  Các loại nấm gọt, rửa sạch, chẻ đôi nếu to."
						+"\n"+"\n" + " 3, Đậu hũ cắt miếng vừa ăn, tàu hũ ky chiên vàng, chả chay xắt khoanh." +"\n"+"\n"+ " 4, Hành boa-rô rửa sạch, xắt khúc. Sả cây cắt khúc, đập giập. Hành tây bóc vỏ, xắt khoanh mỏng."
						+"\n"+"\n" + " 5, Bắc nồi nước dùng rau củ lên bếp, cho sả cây đập giập vào, đun sôi, sau đó cho boa-rô, các loại nấm, đậu hũ, tàu hũ ky, chả chay vào, nêm hạt nêm vừa ăn."
						+"\n"+"\n" + " 6,  Khi ăn, trụng sơ bún, chan nước dùng vào, rắc thêm củ hành tây, ngò gai. Dùng kèm rau các loại, thêm ít sa tế, nếu nhạt chan nước tương.",R.drawable.bunchay));

		ChuDe cd_BunChay = new ChuDe();
		cd_BunChay.setIdChude("Bún chay Huế");
		cd_BunChay.setImage(R.drawable.bunchay);
		cd_BunChay.setListTuVung(tv_BunChay);
		arrayList.add(cd_BunChay);
	//========================================================

		List<ListItem> tv_BanhBeo = new ArrayList<ListItem>();
		tv_BanhBeo.add(new ListItem("Bánh Bèo Huế", " CÔNG THỨC :" +"\n"+ "- 200gr bột gạo tẻ"+"\n"+ "- 20gr bột năng" +"\n"+ "- 500ml nước" +"\n"+ "- Một ít muối" +"\n"+"\n"+ " NHÂN:" +"\n"+ "- 250gr tôm tươi bóc vỏ,rửa sạch" +"\n"+ 
		"- 2 lát bánh mỳ gối" +"\n"+ "- Vài lá hành," ," Cách làm : " +"\n"+"\n" + " 1, Trôn bột tẻ, bột năng với nước thêm một ít muối rồi để nghỉ khoảng 30 phút cho bột nở" +"\n"+"\n"+ " 2, Chuẩn bị phần nhân: "+"\n"+ " - Bánh mỳ gối thái hạt lựu nhỏ. Đun sôi dầu rồi đổ bánh mỳ vào chiên đến khi bánh ngả màu vàng"
				+"\n"+ " - Tôm bóc vỏ làm sạch rồi ướp với một ít nước mắm và ít hạt tiêu. Bắc chảo lên bếp cho 1 thìa dầu ăn vào. Dầu nóng cho tôm vào rang chín.Đổ ra cối và giã nhẹ cho tôm mềm. Dùng tay xé thịt tôm như làm ruốc. Cho lên chảo và rang lại lần hai cho khô" +"\n"+
				" - Hành thái nhỏ rồi cho vào bát. Đun sôi một ít dầu ăn rồi đổ vào bát hành làm chín hành.Vớt hành ra để tránh hành thấm nhiều dầu." +"\n"+ " - Chuẩn bị những cái đĩa con có phết ít dầu ăn chống dính." +"\n"+  
				" - Đun sôi nước trong nồi hấp. Xếp đĩa lên hấp nóng. Từ từ đổ từng thìa bột vào từng đĩa nhỏ. Chỉ đổ nửa đĩa. Đậy vung và hấp lửa to khoảng 5 phút là được."  +"\n"+"\n"+ " 3, Nhấc bánh ra và cho nhân lên trên." +"\n"+"\n"+ " 4, Dùng với nước mắm pha chua ngọt",R.drawable.banhbeo));

		ChuDe cd_BanhBeo = new ChuDe();
		cd_BanhBeo.setIdChude("Bánh Bèo Huế");
		cd_BanhBeo.setImage(R.drawable.banhbeo);
		cd_BanhBeo.setListTuVung(tv_BanhBeo);
		arrayList.add(cd_BanhBeo);
				
	}
}
