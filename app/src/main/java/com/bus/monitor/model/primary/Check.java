package com.bus.monitor.model.primary;

import java.util.Date;

public class Check {

    public Check(Bus bus, BusStop busStop, Date checkDate) {
        this.bus = bus;
        this.busStop = busStop;
        this.checkDate = checkDate;
    }

    private Bus bus;
    private BusStop busStop;
    private Date checkDate;

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public BusStop getBusStop() {
        return busStop;
    }

    public void setBusStop(BusStop busStop) {
        this.busStop = busStop;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Check)) return false;

        Check check = (Check) o;

        if (!bus.equals(check.bus)) return false;
        if (!busStop.equals(check.busStop)) return false;
        if (!checkDate.equals(check.checkDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bus.hashCode();
        result = 31 * result + busStop.hashCode();
        result = 31 * result + checkDate.hashCode();
        return result;
    }
}
