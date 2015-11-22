package com.enis.data;

/**
 * Created by ali on 22/11/15.
 */
public class Type {
    private Hospital hospital;
    private Pharmacies pharmacy;

    public Pharmacies getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacies pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Type(Pharmacies pharmacy) {

        this.pharmacy = pharmacy;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Type() {

    }

    public Type(Hospital hospital) {

        this.hospital = hospital;
    }
}
