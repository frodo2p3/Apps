package com.brsvc.zaq;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by student on 20.03.2017.
 */

public class RowAdapter extends ArrayAdapter<RowLista> {

    Context context;
    int layoutResourceId;
    RowLista data[] = null;

    public RowAdapter(Context context, int layoutResourceId, RowLista[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RowBeanHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new RowBeanHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imageView);
            holder.txtTitle = (TextView)row.findViewById(R.id.textView4);

            row.setTag(holder);
        }
        else
        {
            holder = (RowBeanHolder)row.getTag();
        }

        RowLista object = data[position];
        holder.txtTitle.setText(object.title);
        holder.imgIcon.setImageResource(object.icon);

        return row;
    }

    static class RowBeanHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}