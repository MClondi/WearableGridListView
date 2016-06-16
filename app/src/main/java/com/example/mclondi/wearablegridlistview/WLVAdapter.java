package com.example.mclondi.wearablegridlistview;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Marcel on 2016-06-16.
 */
public class WLVAdapter extends WearableListView.Adapter {

    int size;
    Context context;

    public WLVAdapter(int size, Context context) {
        this.size = size;
        this.context = context;
    }

    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WearableListView.ViewHolder(new TextView(context));
    }

    @Override
    public void onBindViewHolder(WearableListView.ViewHolder holder, int position) {
        ((TextView) holder.itemView).setText("Position: " + position);
    }

    @Override
    public int getItemCount() {
        return size;
    }
}
