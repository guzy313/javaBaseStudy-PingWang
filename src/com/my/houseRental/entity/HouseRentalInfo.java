package com.my.houseRental.entity;

public class HouseRentalInfo {
    private String id;
    private String name;
    private String phone;
    private String address;
    private double rent;
    private String status;

    public void clear(){
        this.setId(null);
        this.setName(null);
        this.setAddress(null);
        this.setPhone(null);
        this.setRent(0);
        this.setStatus(null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
