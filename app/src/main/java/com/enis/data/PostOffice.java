package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class PostOffice {
    private String name;
    private String city;
    private String address;

    private String telephone;
    private LocationOffice locationOffice;

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

    public LocationOffice getLocationOffice() {
        return locationOffice;
    }

    public void setLocationCar(LocationOffice locationoffice) {
        this.locationOffice = locationoffice;
    }

    public static class LocationOffice{
        private String longi;
        private String lat;

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




}
