package com.enis.data;

/**
 * Created by ASUS on 22/11/2015.
 */
public class Events {

    private String description;
    private String type;
    private String organizer ;
    private String website;
    private String phone;
    private String city;
    private String address;
    private String date;
    private String duration;
    private String entranceFees;

    private Location location;

    public Events(String description, String type, String organizer, String website, String phone, String city, String address, String date, String duration, String entranceFees, Location location) {
        this.description = description;
        this.type = type;
        this.organizer = organizer;
        this.website = website;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.date = date;
        this.duration = duration;
        this.entranceFees = entranceFees;
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
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

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEntranceFees() {
        return entranceFees;
    }

    public void setEntranceFees(String entranceFees) {
        this.entranceFees = entranceFees;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
