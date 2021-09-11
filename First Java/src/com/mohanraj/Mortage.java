package com.mohanraj;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortage{
    public static void mort(){

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

    public static void mortage(){

        int principal = (int)Readi("Principal",100,300000);
        float Interest = (float)Readi("Annual Interest",1,10);
        byte year = (byte)Readi("Year",1,30);

        System.out.println("Mortage : "+MortageCal(principal,Interest,year));

    }

    public static double Readi(String ques,int min,int max){

        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print(ques + " : ");
            double res = inp.nextDouble();
            if (res > min && res <= max)
                return res;
            System.out.println("Enter value between "+min+" and "+max+'!');
        }

    }
    public static float MortageCal(int principle,float Interest,byte year){

        float minter = (Interest/100) / 12;
        int nopayment = year * 12;
        return (float)(principle *
                (minter * Math.pow(1+minter,nopayment)
                        / (Math.pow(1+minter,nopayment)-1)));

    }
}