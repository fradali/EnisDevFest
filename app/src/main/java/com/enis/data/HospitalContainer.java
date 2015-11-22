package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class HospitalContainer {
    ArrayList<Hospital> hospital=new ArrayList<Hospital>();

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }

    public HospitalContainer() {

    }

    public HospitalContainer(ArrayList<Hospital> hospital) {

        this.hospital = hospital;
    }
}
