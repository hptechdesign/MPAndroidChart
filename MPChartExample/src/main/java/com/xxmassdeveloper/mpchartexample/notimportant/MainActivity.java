
package com.xxmassdeveloper.mpchartexample.notimportant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.github.mikephil.charting.utils.Utils;
import com.xxmassdeveloper.mpchartexample.AnotherBarActivity;
import com.xxmassdeveloper.mpchartexample.BarChartActivity;
import com.xxmassdeveloper.mpchartexample.BarChartActivityMultiDataset;
import com.xxmassdeveloper.mpchartexample.BarChartActivitySinus;
import com.xxmassdeveloper.mpchartexample.BarChartPositiveNegative;
import com.xxmassdeveloper.mpchartexample.BubbleChartActivity;
import com.xxmassdeveloper.mpchartexample.CandleStickChartActivity;
import com.xxmassdeveloper.mpchartexample.CombinedChartActivity;
import com.xxmassdeveloper.mpchartexample.CubicLineChartActivity;
import com.xxmassdeveloper.mpchartexample.DynamicalAddingActivity;
import com.xxmassdeveloper.mpchartexample.FilledLineActivity;
import com.xxmassdeveloper.mpchartexample.HalfPieChartActivity;
import com.xxmassdeveloper.mpchartexample.HorizontalBarChartActivity;
import com.xxmassdeveloper.mpchartexample.HorizontalBarNegativeChartActivity;
import com.xxmassdeveloper.mpchartexample.InvertedLineChartActivity;
import com.xxmassdeveloper.mpchartexample.LineChartActivity1;
import com.xxmassdeveloper.mpchartexample.LineChartActivity2;
import com.xxmassdeveloper.mpchartexample.LineChartActivityColored;
import com.xxmassdeveloper.mpchartexample.LineChartTime;
import com.xxmassdeveloper.mpchartexample.ListViewBarChartActivity;
import com.xxmassdeveloper.mpchartexample.ListViewMultiChartActivity;
import com.xxmassdeveloper.mpchartexample.MultiLineChartActivity;
import com.xxmassdeveloper.mpchartexample.PerformanceLineChart;
import com.xxmassdeveloper.mpchartexample.PieChartActivity;
import com.xxmassdeveloper.mpchartexample.PiePolylineChartActivity;
import com.xxmassdeveloper.mpchartexample.R;
import com.xxmassdeveloper.mpchartexample.RadarChartActivity;
import com.xxmassdeveloper.mpchartexample.RealtimeLineChartActivity;
import com.xxmassdeveloper.mpchartexample.ScatterChartActivity;
import com.xxmassdeveloper.mpchartexample.ScrollViewActivity;
import com.xxmassdeveloper.mpchartexample.StackedBarActivity;
import com.xxmassdeveloper.mpchartexample.StackedBarActivityNegative;
import com.xxmassdeveloper.mpchartexample.fragments.SimpleChartDemo;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        setTitle("Arrunden Enviromon");

        // initialize the utilities
        Utils.init(this);

        ArrayList<ContentItem> objects = new ArrayList<>();

        ////
        objects.add(0, new ContentItem("Weather data"));

        objects.add(1, new ContentItem("Day", "Last 7 days data"));
        objects.add(2, new ContentItem("Week", "Last 4 weeks data"));
        objects.add(3, new ContentItem("Month", "Last 6 months data"));
        objects.add(4, new ContentItem("All", "All data"));

        ////

        MyAdapter adapter = new MyAdapter(this, objects);

        ListView lv = findViewById(R.id.listView1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> av, View v, int pos, long arg3) {

        Intent i = null;

        switch (pos) {
            case 1:
                i = new Intent(this, LineChartActivity1.class);
                break;
            case 2:
                i = new Intent(this, MultiLineChartActivity.class);
                break;
            case 3:
                i = new Intent(this, LineChartActivity2.class);
                break;
            case 4:
                i = new Intent(this, InvertedLineChartActivity.class);
                break;
            case 5:
                i = new Intent(this, CubicLineChartActivity.class);
                break;
            case 6:
                i = new Intent(this, LineChartActivityColored.class);
                break;
            case 7:
                i = new Intent(this, PerformanceLineChart.class);
                break;
            case 8:
                i = new Intent(this, FilledLineActivity.class);
                break;
            case 10:
                i = new Intent(this, BarChartActivity.class);
                break;
            case 11:
                i = new Intent(this, AnotherBarActivity.class);
                break;
            case 12:
                i = new Intent(this, BarChartActivityMultiDataset.class);
                break;
            case 13:
                i = new Intent(this, HorizontalBarChartActivity.class);
                break;
            case 14:
                i = new Intent(this, StackedBarActivity.class);
                break;
            case 15:
                i = new Intent(this, BarChartPositiveNegative.class);
                break;
            case 16:
                i = new Intent(this, HorizontalBarNegativeChartActivity.class);
                break;
            case 17:
                i = new Intent(this, StackedBarActivityNegative.class);
                break;
            case 18:
                i = new Intent(this, BarChartActivitySinus.class);
                break;
            case 20:
                i = new Intent(this, PieChartActivity.class);
                break;
            case 21:
                i = new Intent(this, PiePolylineChartActivity.class);
                break;
            case 22:
                i = new Intent(this, HalfPieChartActivity.class);
                break;
            case 24:
                i = new Intent(this, CombinedChartActivity.class);
                break;
            case 25:
                i = new Intent(this, ScatterChartActivity.class);
                break;
            case 26:
                i = new Intent(this, BubbleChartActivity.class);
                break;
            case 27:
                i = new Intent(this, CandleStickChartActivity.class);
                break;
            case 28:
                i = new Intent(this, RadarChartActivity.class);
                break;
            case 30:
                i = new Intent(this, ListViewMultiChartActivity.class);
                break;
            case 31:
                i = new Intent(this, SimpleChartDemo.class);
                break;
            case 32:
                i = new Intent(this, ScrollViewActivity.class);
                break;
            case 33:
                i = new Intent(this, ListViewBarChartActivity.class);
                break;
            case 35:
                i = new Intent(this, DynamicalAddingActivity.class);
                break;
            case 36:
                i = new Intent(this, RealtimeLineChartActivity.class);
                break;
            case 37:
                i = new Intent(this, LineChartTime.class);
                break;
            /*case 38:
                i = new Intent(this, RealmMainActivity.class);
                break;*/
        }

        if (i != null) startActivity(i);

        overridePendingTransition(R.anim.move_right_in_activity, R.anim.move_left_out_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i;

        switch (item.getItemId()) {
            case R.id.viewGithub:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/PhilJay/MPAndroidChart"));
                startActivity(i);
                break;
            case R.id.report:
                i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "philjay.librarysup@gmail.com", null));
                i.putExtra(Intent.EXTRA_SUBJECT, "MPAndroidChart Issue");
                i.putExtra(Intent.EXTRA_TEXT, "Your error report here...");
                startActivity(Intent.createChooser(i, "Report Problem"));
                break;
            case R.id.website:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://at.linkedin.com/in/philippjahoda"));
                startActivity(i);
                break;
        }

        return true;
    }
}
