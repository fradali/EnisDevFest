package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class PoliceStation {
private String name;
private String city;
private String address;
private Locationpolice locationpolice;

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

    public Locationpolice getLocationpolice() {
        return locationpolice;
    }

    public void setLocationpolice(Locationpolice locationpolice) {
        this.locationpolice = locationpolice;
    }



    public class Locationpolice {
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
