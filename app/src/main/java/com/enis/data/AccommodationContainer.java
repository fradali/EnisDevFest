package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ali on 22/11/15.
 */
public class AccommodationContainer {
    private ArrayList<Accommodation> accommodation = new ArrayList<Accommodation>();

    public AccommodationContainer() {
    }

    public AccommodationContainer(ArrayList<Accommodation> accommodation) {
        this.accommodation = accommodation;
    }

    public ArrayList<Accommodation> getAccommodation(Accommodation a) {
        return accommodation;
    }

    public void setAccommodation(ArrayList<Accommodation> accommodation) {
        this.accommodation = accommodation;
    }



}
