package com.enis.data;

import android.location.Location;

/**
 * Created by ali on 22/11/15.
 */
public class Health {
    private String name;
    private String city;
    private Location location;
    private String phone;
    private Type type;
    private String address;

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Health() {
    }

    public Health(String name, String city, Location location, String phone, Type type, String address, String id) {

        this.name = name;
        this.city = city;
        this.location = location;
        this.phone = phone;
        this.type = type;
        this.address = address;
        this.id = id;
    }

    private String id;

}
