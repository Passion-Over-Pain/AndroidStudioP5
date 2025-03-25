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
    String listSmoothies[];
    int listImages[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] smoothieList, int [] smoothieImages)
    {
        this.context = ctx;
        this.listSmoothies = smoothieList;
        this.listImages = smoothieImages;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listSmoothies.length;
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
        convertView = inflater.inflate(R.layout.activity_smoothie_list, null);
        TextView smoothieTextView = (TextView) convertView.findViewById(R.id.smoothieTextView);
        ImageView smoothieImageView = (ImageView) convertView.findViewById(R.id.imageIcon);

        smoothieTextView.setText(listSmoothies[position]);
        smoothieImageView.setImageResource(listImages[position]);
        return convertView;
    }
}
