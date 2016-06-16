package com.example.mclondi.wearablegridlistview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Marcel on 2016-06-16.
 */
public class MainFragment extends Fragment {

    int postion;

    public Fragment setPos(int pos) {
        postion = pos;
        return this;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, container, false);

        TextView textView = (TextView) v.findViewById(R.id.text);
        textView.setText("Site no: " + postion);

        WearableListView lv = (WearableListView) v.findViewById(R.id.listview);
        lv.setAdapter(new WLVAdapter(25, getActivity()));
        lv.setGreedyTouchMode(true);
        return v;
    }
}
