package com.amatista.geoloctracker;

/**
 * Created by cole on 11/4/14.
 */
public class CoordinateObject {
    private double lat;
    private double lng;

    public CoordinateObject(double lat, double lng) {
        this.lat= lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
