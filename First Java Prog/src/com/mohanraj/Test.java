package com.mohanraj;


public class Test {

    private int Rent;

    public void setRent(int rent) {
        if (rent<=0)
            throw new IllegalArgumentException("Rent cannt be Less than or equals 0 ");
        Rent = rent;
    }
    public int getRent(){
        return Rent;
    }

    public void Test(){
        System.out.println("Hello");
    }
}
