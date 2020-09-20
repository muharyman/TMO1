package com.example.tmo1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

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
    ArrayList<Integer> list2 =  new ArrayList<Integer>();
    List<BarEntry> entries2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        entries1 = new ArrayList<>();
        entries2 = new ArrayList<>();
        if(bundle != null){
            list1 = bundle.getIntegerArrayList("LIST_TERMINAL");
            list2 = bundle.getIntegerArrayList("LIST_INSTRUMENTAL");

            for (int i = 0; i< 18 ; i++){
                 entries1.add(new BarEntry(list1.get(i),i));
            }

            for (int i = 0; i< 18 ; i++){
                entries2.add(new BarEntry(list2.get(i),i));
            }
        }

        BarChart chart1 = (BarChart) findViewById(R.id.chart1);
        BarChart chart2 = (BarChart) findViewById(R.id.chart2);



        BarDataSet set = new BarDataSet(entries1, "Terminal Value");
        BarData data = new BarData(set);
        data.setBarWidth(1f); // set custom bar width
        set.setColor(Color.rgb(0, 155, 0));
        chart1.setData(data);
        chart1.setFitBars(true); // make the x-axis fit exactly all bars
        chart1.invalidate(); // refresh

        BarDataSet set2 = new BarDataSet(entries2, "Instrumental Value");
        BarData data2 = new BarData(set2);
        data2.setBarWidth(1f); // set custom bar width
        set2.setColor(Color.rgb(30, 40, 155));
        chart2.setData(data2);
        chart2.setFitBars(true); // make the x-axis fit exactly all bars
        chart2.invalidate(); // refresh
    }
}
