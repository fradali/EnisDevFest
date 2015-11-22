package com.enis.data;

/**
 * Created by ASUS on 22/11/2015.
 */
public class Doctors {

    private String phone;
    private String name;
    private String city;
    private String address;

    public Doctors(String phone, String name, String city, String address, Location location, Type type) {
        this.phone = phone;
        this.name = name;
        this.city = city;
        this.address = address;
        this.location = location;
        this.type = type;
    }

    public Doctors() {

    }

    private Location location;
    private Type type;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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
}
