package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class DoctorsContainer {
    private ArrayList<Doctors> doctor= new ArrayList<Doctors>();

    public ArrayList<Doctors> getDoctors() {
        return doctor;
    }

    public void setDoctors(ArrayList<Doctors> doctor) {
        this.doctor = doctor;
    }

    public DoctorsContainer() {

    }

    public DoctorsContainer(ArrayList<Pharmacies> pharmacie) {

        this.doctor = doctor;
    }
}

