package com.example.tmo1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;


public class SummaryActivity extends AppCompatActivity {

    ArrayList<Integer> list1 =  new ArrayList<Integer>();
    List<BarEntry> entries1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        entries1 = new ArrayList<>();
        if(bundle != null){
            list1 = bundle.getIntegerArrayList("LIST_TERMINAL");

            for (int i = 0; i< 18 ; i++){
                 entries1.add(new BarEntry(i, list1.get(i)));
            }
        }

        BarChart chart1 = (BarChart) findViewById(R.id.chart1);

        BarDataSet set = new BarDataSet(entries1, "Terminal Value");
        BarData data = new BarData(set);
        data.setBarWidth(0.8f); // set custom bar width
        chart1.setData(data);
        chart1.setFitBars(true); // make the x-axis fit exactly all bars
        chart1.invalidate(); // refresh

    }
}
