package com.billing;

import model.CONSTS;
import model.geektrust.apartment.Apartment;

public class Biling {

	Apartment apartment;
    Invoice invoice;


    public Biling(Apartment apartment, Invoice invoice){
        this.apartment = apartment;
        this.invoice = invoice;
    }

    public int generateBill(){
        return (int)this.invoice.calculateBill();
    }

    public int getTotalWater(){
        int people = this.apartment.getPeople();
        int guests = this.apartment.getGuests();
        int total = people + guests;
        return total * CONSTS.waterPerPerson * CONSTS.daysInMonth;
    }
}
