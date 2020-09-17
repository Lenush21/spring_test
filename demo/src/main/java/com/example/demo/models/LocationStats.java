package com.example.demo.models;

public class LocationStats {
    
    private String state;
    private String country;
    private int total;
    private int diff; 

    public int getDiff() {
        return this.diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "{" +
            " state='" + getState() + "'" +
            ", country='" + getCountry() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }

}
