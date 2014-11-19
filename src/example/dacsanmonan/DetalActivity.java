package example.dacsanmonan;

import java.util.ArrayList;
import java.util.List;


import obj.ChuDe;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalActivity extends Activity {
	public static List<ChuDe> listDetail = new ArrayList<ChuDe>();
	TextView tv1, tv2, tv3;
	ImageView imageView1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detal);
		
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		imageView1 = (ImageView) findViewById(R.id.imageView1);
		
		ListItem tv = listDetail.get(0).getListTuVung().get(0);
		tv1.setText(tv.getTen());
		tv2.setText(tv.getNguyenlieu());
		tv3.setText(tv.getCachnau());
		imageView1.setImageResource(tv.getImage());
	}
}
