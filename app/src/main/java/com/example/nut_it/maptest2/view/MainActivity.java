package com.example.nut_it.maptest2.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nut_it.maptest2.R;
import com.example.nut_it.maptest2.model.NhaHangFake;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ListView lvList;
    ArrayList<NhaHangFake> arrNhaHang;
    ArrayAdapter<NhaHangFake> adapterNhaHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
//        Intent intent=new Intent(MainActivity.this,MapsActivity.class);
//        startActivity(intent);
    }

    private void addEvents() {
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NhaHangFake nhaHangFake = arrNhaHang.get(position);
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("NhaHang", nhaHangFake);
                startActivity(intent);
            }
        });
    }


    private void addControls() {
        lvList = (ListView) findViewById(R.id.lvList);
        arrNhaHang = new ArrayList<>();
        adapterNhaHang = new ArrayAdapter<NhaHangFake>(MainActivity.this, android.R.layout.simple_list_item_1, arrNhaHang);
        lvList.setAdapter(adapterNhaHang);
    }
}
