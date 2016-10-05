package com.portal.tfkb.wearapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
	
	// Declare Variables
	Context context;
	String[] sehir_adi;

	int[] sehir_icon_int;
	LayoutInflater inflater;

	//ListviewAdapter constructor
	//Gelen de�erleri set ediyor
	private int[] colors = new int[] { 0x30FF0000, 0x300000FF };
	public ListViewAdapter(Context context, String[] sehir_adi, int[] sehir_icon_int) {
		this.context = context;
		this.sehir_adi = sehir_adi;

		this.sehir_icon_int = sehir_icon_int;
	}

	@Override
	public int getCount() {
		return sehir_adi.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		// Declare Variables
		TextView sehir_adi_textview;

		ImageView sehir_icon_imageView;

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
		View itemView = inflater.inflate(R.layout.list_item_row, parent, false);//list_item_row dan yeni bir view olu�turuyoruz
		int colorPos = position % colors.length;
		itemView.setBackgroundColor(colors[colorPos]);
		// olu�an itemviewin i�indeki alanlar� Anasayfadan gelen de�erler ile set ediyoruz
		sehir_adi_textview = (TextView) itemView.findViewById(R.id.sehir_adi);

	//	sehir_icon_imageView = (ImageView) itemView.findViewById(R.id.sehir_icon);

		sehir_adi_textview.setText(sehir_adi[position]);

		//sehir_icon_imageView.setImageResource(sehir_icon_int[position]);
		

		return itemView;
	}
}
