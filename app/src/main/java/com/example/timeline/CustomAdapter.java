package com.example.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String country_names[];
    int country_flags[];
    LayoutInflater inflter;


    public CustomAdapter(Context applicationContext, String[] countries, int[] flags) {
        this.context = applicationContext;
        this.country_names = countries;
        this.country_flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return country_names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.tl_row_item, null);
        TextView country = (TextView) view.findViewById(R.id.item_textView);
        ImageView flag = (ImageView) view.findViewById(R.id.img_flag);
        country.setText(country_names[i]);
        flag.setImageResource(country_flags[i]);

        return view;
    }

}
