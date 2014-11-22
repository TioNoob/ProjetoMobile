package com.bus.monitor.model.primary;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private boolean checked;
    private String routeName;
    private List<BusStop> busStops;

    public Route(String routeName) {
        busStops = new ArrayList<BusStop>();
        this.routeName = routeName;
    }

    public Route(String routeName, List<BusStop> busStops) {
        this.routeName = routeName;
        this.busStops = busStops;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }

    public void setBusStops(List<BusStop> busStops) {
        this.busStops = busStops;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;

        Route route = (Route) o;

        if (!busStops.equals(route.busStops)) return false;
        if (!routeName.equals(route.routeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = routeName.hashCode();
        result = 31 * result + busStops.hashCode();
        return result;
    }
}
