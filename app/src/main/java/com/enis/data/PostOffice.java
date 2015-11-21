package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class PostOffice {
    private String name;
    private String city;
    private String address;

    private String telephone;
    private Location locationOffice;

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



    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Location getLocationOffice() {
        return locationOffice;
    }

    public void setLocation(Location locationoffice) {
        this.locationOffice = locationoffice;
    }


}
