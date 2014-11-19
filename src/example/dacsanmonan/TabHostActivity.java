package example.dacsanmonan;


import android.support.v7.app.ActionBarActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class TabHostActivity extends TabActivity {

	@Override
	 public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        //Khai báo các thành phần
        Resources res = getResources(); 
		TabHost tabHost = getTabHost(); 
		TabHost.TabSpec spec; 
		Intent intent; 
		//Tạo các tab
		//1
		intent = new Intent().setClass(this, MienBacActivity.class);
		spec = tabHost.newTabSpec("tab1").setIndicator("Miền Bắc").setContent(intent);
		tabHost.addTab(spec);
		tabHost.setCurrentTab(1);
		//2
		intent = new Intent().setClass(this, MienTrungActivity.class);
		spec = tabHost.newTabSpec("tab2").setIndicator("Miền Trung").setContent(intent);
		tabHost.addTab(spec);
		
		//3
		intent = new Intent().setClass(this, MienNamActivity.class);
		spec = tabHost.newTabSpec("tab3").setIndicator("Miền Nam").setContent(intent);
		tabHost.addTab(spec);
    }
}
