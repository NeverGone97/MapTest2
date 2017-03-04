package com.example.nut_it.maptest2.model;

import com.example.nut_it.maptest2.R;

import java.util.ArrayList;

/**
 * Created by Nut_IT on 3/4/2017.
 */

public class NhaHangFake1 {
    public static ArrayList<NhaHangFake>layDanhSach(){
        ArrayList<NhaHangFake>ds=new ArrayList<>();
        ds.add(new NhaHangFake("vua tao pho", R.drawable.vuataopho,21.028810f, 105.844235f));
        ds.add(new NhaHangFake("Nha hang non la",R.drawable.nonla,10.788980f, 106.700273f));
        ds.add(new NhaHangFake("Nha hang co la",R.drawable.cola,21.009611f, 105.858895f));
        return ds;
    }
}
