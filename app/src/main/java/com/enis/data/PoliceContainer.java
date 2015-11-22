package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class PoliceContainer {
    private ArrayList<Police> police = new ArrayList<Police>();

    public ArrayList<Police> getPolice() {
        return police;
    }

    public void setPolice(ArrayList<Police> police) {
        this.police = police;
    }

    public PoliceContainer() {

    }

    public PoliceContainer(ArrayList<Police> police) {

        this.police = police;
    }
}
