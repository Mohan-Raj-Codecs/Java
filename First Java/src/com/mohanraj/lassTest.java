package com.mohanraj;

import java.text.NumberFormat;
import java.util.Scanner;

public class lassTest{
    //Using Both Constructor and Reduce Coupling Method
    //If You Didn't Know Let You Refer Ultimate Java Series
    public lassTest(int prin, float inter, byte year){
        prin = (int) Validate(prin,100,300000);
        inter = (float) Validate( (int) inter,0,10);
        year = (byte) Validate(year,0,35);
        System.out.println("Mortage Value : "+MortageCal(prin,inter,year));

    }
    public lassTest(){

        Scanner inl = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("-_-_-_-_-_-_Our Mortage Calc -_-_-_-_-_-_");
        System.out.print("Principal : ");
        int prin=inl.nextInt();
        System.out.print("Annual Interest : ");
        float inter=inl.nextFloat();
        System.out.print("Period in Years : ");
        byte year=inl.nextByte();

        float minter=(inter/100)/12;
        int nopayment = year*12;
        double Morta = prin *
                (minter * Math.pow(1+minter,nopayment)
                        / (Math.pow(1+minter,nopayment)-1));
        System.out.println("Mortage Value: " + NumberFormat.getCurrencyInstance().format(Morta));

    }

    private void mortage(){

        int principal = (int)Readi("Principal",100,300000);
        float Interest = (float)Readi("Annual Interest",1,10);
        byte year = (byte)Readi("Year",1,30);

        System.out.println("Mortage : "+MortageCal(principal,Interest,year));

    }

    private double Validate(int res,int min,int max) {

        if (res > min && res <= max)
                return res;
        else
            throw new IllegalArgumentException("You Entered : "+res+"\nEnter Value between "+min+" and "+max);
    }


    private double Readi(String ques,int min,int max){

        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print(ques + " : ");
            double res = inp.nextDouble();
            if (res > min && res <= max)
                return res;
            System.out.println("Enter value between "+min+" and "+max+'!');
        }
    }

    private float MortageCal(int principle,float Interest,byte year){

        float minter = (Interest/100) / 12;
        int nopayment = year * 12;
        return (float)(principle *
                (minter * Math.pow(1+minter,nopayment)
                        / (Math.pow(1+minter,nopayment)-1)));

    }
}