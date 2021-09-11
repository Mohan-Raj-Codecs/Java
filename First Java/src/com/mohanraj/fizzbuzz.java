package com.mohanraj;

import java.util.Scanner;

public class fizzbuzz {

    public static void fizz() {
        // write your code here
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Number : ");
        num=inp.nextInt();
        if (num%5==0 && num%3==0)
            System.out.println("FizzBuzz");
        else if (num%3==0)
            System.out.println("Buzz");
        else if (num%5==0)
            System.out.println("Fizz");
        else
            System.out.println(num);

    }
}
