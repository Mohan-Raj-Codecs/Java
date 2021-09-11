package com.mohanraj;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalc {        //$ 178,777.59

    static NumberFormat cur = NumberFormat.getCurrencyInstance();   //Global Variable     It is also Called as Field

    public static void mortageCalc(){
        int principal = (int)Readi("Principal",100,300000);
        float Interest = (float)Readi("Annual Interest",1,10);
        byte year = (byte)Readi("Year",1,30);

        System.out.println("\nMORTAGE\n-------");
        System.out.println("Monthly Payments : "+MortageCal(principal,Interest,year)+'\n');
        System.out.println("PAYMENT SCHEDULE\n----------------");
        Balance(principal,Interest,year);
    }

    public static void Balance(int principal,float Interest,byte year){  //Calculates Payment Schedule
        float minter = (Interest/100) / 12;
        int nopayment = year * 12;
        float morta = (float)(principal *
                (minter * Math.pow(1+minter,nopayment)
                        / (Math.pow(1+minter,nopayment)-1)));

        float balance=principal;

        while(true) {
            balance = balance - morta;
            if (balance <= 0){
                System.out.println("$ 0.0");
                break;
            }
            System.out.println(cur.format(balance));
        }
    }

    public static double Readi(String ques,int min,int max){         //Prompt User for Input
        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print(ques + " : ");
            double res = inp.nextDouble();
            if (res > min && res <= max)
                return res;
            System.out.println("Enter value between "+min+" and "+max+" !");
        }

    }
    public static String MortageCal(int principal,float Interest,byte year){       //Calculate Mortage Value
        float minter = (Interest/100) / 12;
        int nopayment = year * 12;
        return cur.format( (float)(principal *
                (minter * Math.pow(1+minter,nopayment)
                        / (Math.pow(1+minter,nopayment)-1))));

    }
}
