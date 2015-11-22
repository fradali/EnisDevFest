package com.enis.data;

import android.animation.PropertyValuesHolder;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class PharmaciesContainer {
    private ArrayList<Pharmacies> pharmacie = new ArrayList<Pharmacies>();

    public ArrayList<Pharmacies> getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(ArrayList<Pharmacies> pharmacie) {
        this.pharmacie = pharmacie;
    }

    public PharmaciesContainer() {

    }

    public PharmaciesContainer(ArrayList<Pharmacies> pharmacie) {

        this.pharmacie = pharmacie;
    }
}
