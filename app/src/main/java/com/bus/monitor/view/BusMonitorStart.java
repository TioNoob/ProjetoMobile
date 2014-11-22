package com.bus.monitor.view;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.bus.monitor.dao.Stub;
import com.bus.monitor.model.secondary.BusAdapter;
import com.testing.testing.R;

public class BusMonitorStart extends Activity {

    Stub stub = null; // TODO Remove
    BusAdapter busAdapter = null;
    ListView listView = null;

    Button button = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_monitor_start);

        initListView();
        initButton();
    }

    private void initListView() {
        stub = new Stub();
        busAdapter = new BusAdapter(this, R.layout.bus_check_list, stub.getRoutes());

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(busAdapter);
    }

    private void initButton() {
        button = (Button) findViewById(R.id.botaoProcurarPontos);
        button.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.v("Checked Boxes", String.valueOf(busAdapter.getAllCheckedBoxes()));
                }
            }
        );
    }

}