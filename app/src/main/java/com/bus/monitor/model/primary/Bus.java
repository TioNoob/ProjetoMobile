package com.bus.monitor.model.primary;

public class Bus {

    private int identifier;
    private Route route;

    public Bus(int identifier, Route route) {
        this.identifier = identifier;
        this.route = route;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;

        Bus bus = (Bus) o;

        if (identifier != bus.identifier) return false;
        if (!route.equals(bus.route)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identifier;
        result = 31 * result + route.hashCode();
        return result;
    }

}
