package com.bus.monitor.dao;

import com.bus.monitor.model.primary.Bus;
import com.bus.monitor.model.primary.BusStop;
import com.bus.monitor.model.primary.Check;
import com.bus.monitor.model.primary.Route;

import java.util.ArrayList;
import java.util.Date;

public class Stub {

    ArrayList<Bus> buses = null;
    ArrayList<BusStop> busStops = null;
    ArrayList<Route> routes = null;
    ArrayList<Check> checks = null;

    public Stub() {

        buses = new ArrayList<Bus>();
        busStops = new ArrayList<BusStop>();
        routes = new ArrayList<Route>();
        checks = new ArrayList<Check>();

        BusStop busStop1 = new BusStop(1, 2);
        BusStop busStop2 = new BusStop(12, 22);
        BusStop busStop3 = new BusStop(17, 23);
        BusStop busStop4 = new BusStop(11, 33);

        busStops.add(busStop1);
        busStops.add(busStop2);
        busStops.add(busStop3);
        busStops.add(busStop4);

        Route route1 = new Route("503 - Destino Terminal de Vila Velha");
        Route route2 = new Route("503 - Destino Terminal de Itaparica");
        Route route3 = new Route("526 - Destino Terminal de Vila Velha");
        Route route4 = new Route("503 - Destino Terminal de Campo Grande");

        routes.add(route1);
        routes.add(route2);
        routes.add(route3);
        routes.add(route4);

        route1.getBusStops().add(busStop4);
        route1.getBusStops().add(busStop1);

        route2.getBusStops().add(busStop1);
        route2.getBusStops().add(busStop4);

        route3.getBusStops().add(busStop2);
        route3.getBusStops().add(busStop3);

        route4.getBusStops().add(busStop3);
        route4.getBusStops().add(busStop2);

        Bus bus1 = new Bus(1, route1);
        Bus bus2 = new Bus(2, route2);
        Bus bus3 = new Bus(3, route3);
        Bus bus4 = new Bus(4, route4);

        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);

        Check check1 = new Check(bus1, busStop1, getDateMinusMinutes(20));
        Check check2 = new Check(bus1, busStop4, getDateMinusMinutes(18));
        Check check3 = new Check(bus2, busStop4, getDateMinusMinutes(10));
        Check check4 = new Check(bus2, busStop1, getDateMinusMinutes(3));
        Check check5 = new Check(bus3, busStop2, getDateMinusMinutes(40));
        Check check6 = new Check(bus3, busStop3, getDateMinusMinutes(20));
        Check check7 = new Check(bus4, busStop3, getDateMinusMinutes(5));
        Check check8 = new Check(bus4, busStop2, getDateMinusMinutes(2));

        checks.add(check1);
        checks.add(check2);
        checks.add(check3);
        checks.add(check4);
        checks.add(check5);
        checks.add(check6);
        checks.add(check7);
        checks.add(check8);
    }

    private Date getDateMinusMinutes(int minutes){
        return new Date((new Date().getTime() - minutes*(1000*60)));
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public ArrayList<BusStop> getBusStops() {
        return busStops;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public ArrayList<Check> getChecks() {
        return checks;
    }
}