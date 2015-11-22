package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class ShoppingContainer {
    private ArrayList<Shopping> shopping= new ArrayList<Shopping>();

    public ShoppingContainer() {
    }

    public ArrayList<Shopping> getShopping() {

        return shopping;
    }

    public void setShopping(ArrayList<Shopping> shopping) {
        this.shopping = shopping;
    }

    public ShoppingContainer(ArrayList<Shopping> shopping) {

        this.shopping = shopping;
    }
}
