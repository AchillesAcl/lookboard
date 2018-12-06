package com.achilles.lookboard.chartactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.achilles.lookboard.R;
import com.achilles.lookboard.util.MPChartHelper;
import com.github.mikephil.charting.charts.BarChart;

import java.util.ArrayList;
import java.util.List;

/**
 * 柱状图
 *
 * @author Achilles
 */
public class PositiveNegativeBarChartActivity extends AppCompatActivity {

    private BarChart barChart1;

    private List<String> xAxisValues;
    private List<Float> yAxisValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        initView();
        initData();
        MPChartHelper.setPositiveNegativeBarChart(barChart1, xAxisValues, yAxisValues, "正负柱状图");
    }

    private void initView() {
        barChart1 =  findViewById(R.id.barChart1);
    }

    private void initData() {
        xAxisValues = new ArrayList<>();
        yAxisValues = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            xAxisValues.add(String.valueOf(i));
            yAxisValues.add((float) (Math.random() * 20 - 10));
        }
    }
}
