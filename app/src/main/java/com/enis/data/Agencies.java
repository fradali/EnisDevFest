package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class Agencies {

    private String name;
    private String city;
    private String address;
    private String website;
    private String phone;

    public Agencies(String name, String city, String address, String website, String phone, Location location) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.website = website;
        this.phone = phone;
        this.location = location;
    }

    public Agencies() {

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telephone) {
        this.phone = telephone;
    }







}
