package com.enis.data;

/**
 * Created by ASUS on 22/11/2015.
 */
public class Shopping {
   private String openingHours;
   private String description;
   private String city;
   private String name;
   private String phone;
   private String address;
   private Location location;

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Shopping(String openingHours, String description, String city, String name, String phone, String address, Location location) {
        this.openingHours = openingHours;
        this.description = description;
        this.city = city;
        this.name = name;

        this.phone = phone;
        this.address = address;
        this.location = location;
    }

    public Shopping() {

    }
}
