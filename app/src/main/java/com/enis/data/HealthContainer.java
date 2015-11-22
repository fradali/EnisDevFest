package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class HealthContainer {
    private ArrayList<Health> health= new ArrayList<Health>();

    public ArrayList<Health> getHealth() {
        return health;
    }

    public void setHealth(ArrayList<Health> health) {
        this.health = health;
    }

    public HealthContainer() {

    }

    public HealthContainer(ArrayList<Health> health) {

        this.health = health;
    }
}
