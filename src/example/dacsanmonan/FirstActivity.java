package example.dacsanmonan;

import example.dacsanmonan.R.drawable;

import android.support.annotation.DrawableRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class FirstActivity extends ActionBarActivity {
	Button btnTrangChu, btnGioiThieu, btnTimKiem, btnExit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		btnTrangChu = (Button) findViewById(R.id.btnTrangChu);
		btnExit = (Button) findViewById(R.id.btnExit);
		btnTimKiem = (Button) findViewById(R.id.btnTimKiem);
		btnGioiThieu = (Button) findViewById(R.id.btnInfo);
		
		
		btnExit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				 
	            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FirstActivity.this);
	 
	            alertDialogBuilder.setTitle("Đặc Sản Ba Miền");
	            alertDialogBuilder.setIcon(R.drawable.unnamed);
	            alertDialogBuilder
	                .setMessage("Bạn có thực sự muốn thoát ?")
	                .setCancelable(false)
	                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog,int id) {
	                        FirstActivity.this.finish();
	                    }
	                  })
	                .setNegativeButton("No",new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog,int id) {
	                        dialog.cancel();
	                    }
	                });
	 
	                AlertDialog alertDialog = alertDialogBuilder.create();
	 
	                alertDialog.show();
	            }
	        });
		
		
		
		
		btnTrangChu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),TabHostActivity.class);
				startActivity(intent);
			}
		});
		
		btnTimKiem.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(getApplicationContext(),TimKiemActivity.class);
				startActivity(intent2);
			}
		});
		
		
		
		//====
		btnGioiThieu.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View v) {
				AlertDialog.Builder b = new AlertDialog.Builder(FirstActivity.this);
				b.setTitle("Thông tin ứng dụng");
				b.setMessage("Ứng dụng này được xây dựng bởi Phạm Việt Hoàng, Sinh viên trường cao đẳng thực hành FPT polytechnic");
				b.setNegativeButton("OK", new DialogInterface.OnClickListener() {
	                   
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                b.create().show();
			}
		});
	}
}
