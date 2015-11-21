package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class CarRentalAgency {

    private String name;
    private String city;
    private String address;
    private String website;
    private String telephone;
    private LocationCar locationCar;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocationCar getLocationCar() {
        return locationCar;
    }

    public void setLocationCar(LocationCar locationCar) {
        this.locationCar = locationCar;
    }

   public class LocationCar{
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
