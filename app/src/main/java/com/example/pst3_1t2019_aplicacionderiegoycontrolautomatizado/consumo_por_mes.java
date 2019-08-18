package com.example.pst3_1t2019_aplicacionderiegoycontrolautomatizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class consumo_por_mes extends AppCompatActivity {
    private Spinner spinner;
    private LineChartView lineChartView;
    List yAxisValues = new ArrayList();
    List axisValues = new ArrayList();
    final private String[] dias =new String[]{"1","2","3","4",
            "5","6","7","8","9","10"};

    private int[]valores=new int[]{10,25,30,27,16,44,21,15,28,22};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumo_por_mes);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dias);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        lineChartView=(LineChartView)findViewById(R.id.lineChart);
        createchart();
    }

    private void createchart(){
        Line line=new Line(yAxisValues).setColor(Color.parseColor("#9C27B0"));
        for(int i=0;i<dias.length;i++){
            axisValues.add(i, new AxisValue(i).setLabel(dias[i]));
        }
        for(int i=0;i<valores.length;i++){
            yAxisValues.add(i, new PointValue(i,valores[i]));
        }
        List lines = new ArrayList();
        lines.add(line);
        LineChartData data = new LineChartData();
        data.setLines(lines);
        lineChartView.setLineChartData(data);

        Axis axis = new Axis();
        axis.setValues(axisValues);
        data.setAxisXBottom(axis);
        Axis yAxis = new Axis();
        data.setAxisYLeft(yAxis);
        axis.setTextSize(16);
        axis.setTextColor(Color.parseColor("#03A9F4"));
        yAxis.setTextColor(Color.parseColor("#03A9F4"));
        yAxis.setTextSize(16);
        yAxis.setName("Consumo en cm3");
        Viewport viewport = new Viewport(lineChartView.getMaximumViewport());
        viewport.top =110;
        lineChartView.setMaximumViewport(viewport);
        lineChartView.setCurrentViewport(viewport);
    }
    public void tabla2(View view){
        Intent i = new Intent(this,consulta_por_dia.class);
        startActivity(i);
    }

}
