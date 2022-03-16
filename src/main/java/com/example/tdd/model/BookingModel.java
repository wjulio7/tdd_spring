package com.example.tdd.model;

import java.time.LocalDate;

public class BookingModel {

    private String id;
    private String reservedName;
    private LocalDate checkin;
    private LocalDate checkOut;
    private int numberGuests;

    public BookingModel(String id, String reservedName, LocalDate checkin, LocalDate checkOut, int numberGuests) {
        this.id = id;
        this.reservedName = reservedName;
        this.checkin = checkin;
        this.checkOut = checkOut;
        this.numberGuests = numberGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReservedName() {
        return reservedName;
    }

    public void setReservedName(String reservedName) {
        this.reservedName = reservedName;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }
}
