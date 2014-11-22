package com.bus.monitor.model.secondary;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import com.bus.monitor.model.primary.Route;
import com.testing.testing.R;

import java.util.ArrayList;

public class BusAdapter extends ArrayAdapter<Route> {

    public BusAdapter(Context context, int textViewResourceId, ArrayList<Route> routes) {
        super(context, textViewResourceId, routes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CheckBox checkBox = null;
        LayoutInflater inflater = null;

        if (convertView == null) {
            inflater = (LayoutInflater) getContext().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.bus_check_list, null);

            checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);
            convertView.setTag(checkBox);
        } else {
            checkBox = (CheckBox) convertView.getTag();
        }

        Route route = getItem(position);
        route.setChecked(checkBox.isChecked());
        checkBox.setText(route.getRouteName());

        return convertView;
    }

    public ArrayList<Route> getAllCheckedBoxes(){

        ArrayList<Route> checkedRoutes = null;
        Route actualRoute = null;
        checkedRoutes = new ArrayList<Route>();

        for (int i = 0; i < getCount(); i++){

            actualRoute = getItem(i);

            if (actualRoute.isChecked())
                checkedRoutes.add(actualRoute);
        }

        if (checkedRoutes.size() > 0)
            return checkedRoutes;
        else
            return null;
    }
}
