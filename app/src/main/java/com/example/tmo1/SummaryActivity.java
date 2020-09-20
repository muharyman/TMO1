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

import butterknife.ButterKnife;

public class SummaryActivity extends AppCompatActivity {

    ArrayList<Integer> list =  new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            list = bundle.getIntegerArrayList("LIST_TERMINAL");
        }

        Log.d("asdad",String.valueOf(list));
        BarChart chart = (BarChart) findViewById(R.id.chart);

        List<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(list.get(0),0));
        entries.add(new BarEntry(list.get(1), 1));
        entries.add(new BarEntry(list.get(2), 2));
        entries.add(new BarEntry(list.get(3), 3));
        entries.add(new BarEntry(list.get(4), 4));
        entries.add(new BarEntry(list.get(5), 5));
        entries.add(new BarEntry(list.get(6), 6));
        entries.add(new BarEntry(list.get(7), 7));
        entries.add(new BarEntry(list.get(8), 8));
        entries.add(new BarEntry(list.get(9), 9));
        entries.add(new BarEntry(list.get(10), 10));
        entries.add(new BarEntry(list.get(11), 11));
        entries.add(new BarEntry(list.get(12), 12));
        entries.add(new BarEntry(list.get(13), 13));
        entries.add(new BarEntry(list.get(14), 14));
        entries.add(new BarEntry(list.get(15), 15));
        entries.add(new BarEntry(list.get(16), 16));
        entries.add(new BarEntry(list.get(17), 17));

        BarDataSet set = new BarDataSet(entries, "BarDataSet");
        BarData data = new BarData(set);
        data.setBarWidth(0.9f); // set custom bar width
        chart.setData(data);
        chart.setFitBars(true); // make the x-axis fit exactly all bars
        chart.invalidate(); // refresh
    }

    private ArrayList getDataSet() {

        ArrayList dataSets = null;

        ArrayList valueSet1 = new ArrayList();
        BarEntry v1e1 = new BarEntry(list.get(0),0); // Jan
        BarEntry v1e2 = new BarEntry(list.get(1), 1); // Feb
        BarEntry v1e3 = new BarEntry(list.get(2), 2); // Feb
        BarEntry v1e4 = new BarEntry(list.get(3), 3); // Feb
        BarEntry v1e5 = new BarEntry(list.get(4), 4); // Feb
        BarEntry v1e6 = new BarEntry(list.get(5), 5); // Feb
        BarEntry v1e7 = new BarEntry(list.get(6), 6); // Feb
        BarEntry v1e8 = new BarEntry(list.get(7), 7); // Feb
        BarEntry v1e9 = new BarEntry(list.get(8), 8); // Feb
        BarEntry v1e10 = new BarEntry(list.get(9), 9); // Feb
        BarEntry v1e11 = new BarEntry(list.get(10), 10); // Feb
        BarEntry v1e12 = new BarEntry(list.get(11), 11); // Feb
        BarEntry v1e13 = new BarEntry(list.get(12), 12); // Feb
        BarEntry v1e14 = new BarEntry(list.get(13), 13); // Feb
        BarEntry v1e15 = new BarEntry(list.get(14), 14); // Feb
        BarEntry v1e16 = new BarEntry(list.get(15), 15); // Feb
        BarEntry v1e17 = new BarEntry(list.get(16), 16); // Feb
        BarEntry v1e18 = new BarEntry(list.get(17), 17); // Feb

        valueSet1.add(v1e1); valueSet1.add(v1e2);
        valueSet1.add(v1e3); valueSet1.add(v1e4);
        valueSet1.add(v1e5); valueSet1.add(v1e6);
        valueSet1.add(v1e7); valueSet1.add(v1e8);
        valueSet1.add(v1e9); valueSet1.add(v1e10);
        valueSet1.add(v1e11); valueSet1.add(v1e12);
        valueSet1.add(v1e13); valueSet1.add(v1e14);
        valueSet1.add(v1e15); valueSet1.add(v1e16);
        valueSet1.add(v1e17); valueSet1.add(v1e18);






//        ArrayList valueSet2 = new ArrayList();
//        BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
//        valueSet2.add(v2e1);
//        BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
//        valueSet2.add(v2e2);
//        BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
//        valueSet2.add(v2e3);
//        BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
//        valueSet2.add(v2e4);
//        BarEntry v2e5 = new BarEntry(20.000f, 4); // May
//        valueSet2.add(v2e5);
//        BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
//        valueSet2.add(v2e6);
        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
//        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
//        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList();
        dataSets.add(barDataSet1);
//        dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList getXAxisValues() {
        ArrayList xAxis = new ArrayList();
        xAxis.add("1");
        xAxis.add("2");
        xAxis.add("3");
        xAxis.add("4");
        xAxis.add("5");
        xAxis.add("6");
        xAxis.add("7");
        xAxis.add("8");
        xAxis.add("9");
        xAxis.add("10");
        xAxis.add("11");
        xAxis.add("12");
        xAxis.add("13");
        xAxis.add("14");
        xAxis.add("15");
        xAxis.add("16");
        xAxis.add("17");
        xAxis.add("18");

        return xAxis;
    }
}
