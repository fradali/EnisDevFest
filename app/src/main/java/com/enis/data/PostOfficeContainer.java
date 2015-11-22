package com.enis.data;

import java.util.ArrayList;

/**
 * Created by ASUS on 22/11/2015.
 */
public class PostOfficeContainer {
    private ArrayList<PostOffice> postOffices= new ArrayList<PostOffice>();

    public PostOfficeContainer(ArrayList<PostOffice> postOffices) {
        this.postOffices = postOffices;
    }

    public PostOfficeContainer() {

    }

    public ArrayList<PostOffice> getPostOffices() {
        return postOffices;
    }

    public void setPostOffices(ArrayList<PostOffice> postOffices) {
        this.postOffices = postOffices;
    }
}
