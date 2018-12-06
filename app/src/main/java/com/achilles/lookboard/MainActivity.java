package com.achilles.lookboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.achilles.lookboard.chartactivity.BarChartActivity;
import com.achilles.lookboard.chartactivity.CombineChartActivity;
import com.achilles.lookboard.chartactivity.LineChartActivity;
import com.achilles.lookboard.chartactivity.MultiLineChartActivity;
import com.achilles.lookboard.chartactivity.PieChartActivity;
import com.achilles.lookboard.chartactivity.PositiveNegativeBarChartActivity;
import com.achilles.lookboard.chartactivity.ThreeBarChartActivity;
import com.achilles.lookboard.chartactivity.TwoBarChartActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Achilles
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,initListData()));
        listView.setOnItemClickListener(this);
    }

    private List<String> initListData(){
        List<String> data = new ArrayList<>();
        data.add("柱状图（单）");
        data.add("柱状图（双）");
        data.add("柱状图（三）");
        data.add("正负柱状图");
        data.add("折线图（单）");
        data.add("折线图（复）");
        data.add("饼图");
        data.add("组合图");
        return data;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i;
        switch (position){
            case 0:
                i = new Intent(MainActivity.this, BarChartActivity.class);
                startActivity(i);
                break;
            case 1:
                i = new Intent(MainActivity.this, TwoBarChartActivity.class);
                startActivity(i);
                break;
            case 2:
                i = new Intent(MainActivity.this, ThreeBarChartActivity.class);
                startActivity(i);
                break;
            case 3:
                i = new Intent(MainActivity.this, PositiveNegativeBarChartActivity.class);
                startActivity(i);
                break;
            case 4:
                i = new Intent(MainActivity.this, LineChartActivity.class);
                startActivity(i);
                break;
            case 5:
                i = new Intent(MainActivity.this, MultiLineChartActivity.class);
                startActivity(i);
                break;
            case 6:
                i = new Intent(MainActivity.this, PieChartActivity.class);
                startActivity(i);
                break;
            case 7:
                i = new Intent(MainActivity.this, CombineChartActivity.class);
                startActivity(i);
                break;
                default:
        }
    }
}
