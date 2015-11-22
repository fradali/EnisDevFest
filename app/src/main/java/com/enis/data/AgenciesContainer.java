package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class AgenciesContainer {
    public ArrayList<Agencies> getAgencies() {
        return agencies;
    }

    public void setAgencies(ArrayList<Agencies> agencies) {
        this.agencies = agencies;
    }

    public AgenciesContainer() {

    }

    public AgenciesContainer(ArrayList<Agencies> agencies) {

        this.agencies = agencies;
    }

    private ArrayList<Agencies> agencies = new ArrayList<Agencies>();

}
