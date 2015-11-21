package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class Typ {
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Typ() {

    }

    public Typ(Hospital hospital) {

        this.hospital = hospital;
    }
}
