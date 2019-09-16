package com.example.firstapp.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.firstapp.R;

public class ImageAdapter extends BaseAdapter {
    Integer[] imageIDs = {
            R.drawable.dog, R.drawable.butterfly, R.drawable.lily
    };
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return imageIDs.length;
    }

    public Object getItem(int position) {
        return imageIDs[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        View gridview = convertView;

        if (gridview == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridview = inflater.inflate(R.layout.relative_layout, null);
        }
        //ImageView i1 = (ImageView) gridview.findViewById(R.id.myimage);
       // i1.setImageResource(imageIDs[position]);
        return gridview;
    }
}
