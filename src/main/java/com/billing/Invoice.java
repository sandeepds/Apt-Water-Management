package com.billing;

import java.util.HashMap;

import model.geektrust.Costing.Water;
import model.geektrust.apartment.Apartment;

public abstract class Invoice {

	Apartment apartment;
    HashMap<String, Water> waterTypes;

    public Invoice(Apartment apartment, HashMap<String, Water> waterTypes) {
        this.apartment = apartment;
        this.waterTypes = waterTypes;
    }

    public abstract double calculateBill();
}
