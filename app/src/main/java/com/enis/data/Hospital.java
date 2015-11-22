package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class Hospital {

    private String website;
    private String name;
    private String city;
    private String address;
    private Location location;
    private Type type;

    public Hospital(String website, String name, String city, String address, Location location, Type type) {
        this.website = website;
        this.name = name;
        this.city = city;
        this.address = address;
        this.location = location;
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Type getType() {

        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public Hospital() {
    }

    public Hospital(String website) {

        this.website = website;
    }

    public String getWebsite() {

        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
