package example.dacsanmonan;

import java.util.ArrayList;
import java.util.List;

import obj.ChuDe;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
public class VietnameseView extends BaseAdapter{
	 public static List<ChuDe> temporarylist;
	List<ChuDe> arrayTinTuc;

	public Activity context;
	public LayoutInflater inflater;

	public VietnameseView(Activity context, List<ChuDe> arrayTinTuc) {
		super();
		temporarylist=arrayTinTuc;
		this.context = context;
		this.arrayTinTuc = arrayTinTuc;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayTinTuc.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return arrayTinTuc.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder {
		TextView txtTu;
		ImageView img;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.list_item, null);
			holder.img = (ImageView) convertView.findViewById(R.id.imageViewMienBac);
			holder.txtTu = (TextView) convertView.findViewById(R.id.itemName);

			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		ChuDe _entry = (ChuDe) arrayTinTuc.get(position);
		holder.img.setImageResource(_entry.getImage());
		holder.txtTu.setText(_entry.getIdChude());

		return convertView;
	}
	
}
