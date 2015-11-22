package com.enis.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ali on 22/11/15.
 */
public  class Location {
    @SerializedName("long")
    private String longi;
    private String lat;

    public Location() {
    }

    public Location(String longi, String lat) {

        this.longi = longi;
        this.lat = lat;

    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}