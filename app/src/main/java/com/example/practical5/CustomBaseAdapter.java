package com.example.practical5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter
{
    Context context;
    String listCountries[];
    int listImages[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] countryList, int [] countryImages)
    {
        this.context = ctx;
        this.listCountries = countryList;
        this.listImages = countryImages;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listCountries.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_country_list, null);
        TextView countryTextView = (TextView) convertView.findViewById(R.id.countryTextView);
        ImageView countryImageView = (ImageView) convertView.findViewById(R.id.imageIcon);

        countryTextView.setText(listCountries[position]);
        countryImageView.setImageResource(listImages[position]);
        return convertView;
    }
}
