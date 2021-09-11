package com.mohanraj;

public class Overr {

    public Overr(){
        System.out.println("Lol");
    }

    @Override       //This will implement java Compiler to Notify that we are overrriding Method that is already declared
    public String toString(){
        return "Lol";
    }

    private void Lil(){
        System.out.println("LOl");
    }
}
