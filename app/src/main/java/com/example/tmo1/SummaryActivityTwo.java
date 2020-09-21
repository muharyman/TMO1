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


public class SummaryActivityTwo extends AppCompatActivity {

    ArrayList<Integer> list2 =  new ArrayList<Integer>();
    List<BarEntry> entries2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        entries2 = new ArrayList<>();
        if(bundle != null){
            list2 = bundle.getIntegerArrayList("LIST_INSTRUMENTAL");

            for (int i = 0; i< 18 ; i++){
                entries2.add(new BarEntry(i, list2.get(i)));
            }
        }

        BarChart chart2 = (BarChart) findViewById(R.id.chart2);

        BarDataSet set2 = new BarDataSet(entries2, "Instrumental Value");
        BarData data2 = new BarData(set2);
        data2.setBarWidth(0.8f); // set custom bar width
        chart2.setData(data2);
        chart2.setFitBars(true); // make the x-axis fit exactly all bars
        chart2.invalidate(); // refresh
    }
}
