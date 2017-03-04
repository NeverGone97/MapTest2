package com.example.nut_it.maptest2.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nut_it.maptest2.R;
import com.example.nut_it.maptest2.model.NhaHangFake;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.vision.text.Text;

import java.util.zip.Inflater;

/**
 * Created by Nut_IT on 3/4/2017.
 */

public class CustomInfoAdapter implements GoogleMap.InfoWindowAdapter{
    Activity context;
    NhaHangFake nhaHangFake;

    public CustomInfoAdapter(Activity context, NhaHangFake nhaHangFake) {
        this.context = context;
        this.nhaHangFake = nhaHangFake;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(R.layout.item,null);
        ImageView imgHinh= (ImageView) row.findViewById(R.id.txtHinh);
        TextView txtTen= (TextView) row.findViewById(R.id.txtTen);
        imgHinh.setImageResource(nhaHangFake.getHinh());
        txtTen.setText(nhaHangFake.getTen());
        return row;
    }
}
