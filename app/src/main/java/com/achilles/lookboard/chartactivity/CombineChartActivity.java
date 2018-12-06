package com.achilles.lookboard.chartactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.achilles.lookboard.R;
import com.achilles.lookboard.util.MPChartHelper;
import com.github.mikephil.charting.charts.CombinedChart;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合图形
 *
 * @author Achilles
 */
public class CombineChartActivity extends AppCompatActivity {

    private CombinedChart combineChart;
    private List<String> xAxisValues;
    private List<Float> lineValues;
    private List<Float> barValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combine_chart);
        initView();
        initData();
        MPChartHelper.setCombineChart(combineChart, xAxisValues, lineValues, barValues, "折线", "柱子");
    }

    private void initView() {
        combineChart = findViewById(R.id.combineChart);
    }

    private void initData() {
        xAxisValues = new ArrayList<>();
        lineValues = new ArrayList<>();
        barValues = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            xAxisValues.add(String.valueOf(i));
            lineValues.add((float) (Math.random() * 1000 + 20));
            barValues.add((float) (Math.random() * 1000 + 20));
        }
    }
}
