package com.mohanraj;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Test  t = new Test();
        t.Test();
        t.setRent(1);
        System.out.println(t.getRent());

        var Li = new Overr();
        System.out.println(Li.toString());//OverRiding toString Method that returns package info

        System.out.println(new lassTest());  //Calling Class Without Instatses using new

        Mortage mp =new Mortage();
        mp.mortage();

        MortageCalc moi = new MortageCalc();
        moi.mortageCalc();

        fizzbuzz mo = new fizzbuzz();
        mo.fizz();

        System.out.println("Created First Java Program");

        //Primitive Data Types

        System.out.println("Primitive data Types");
        byte age=20;
        int mark=200;
        long people=92853698375938475L;
        float GP=12.43F;
        double GPA=123.09245;
        char grade='A';

        //Reference Data Type

        System.out.println("Reference Data Types");
        Date now = new Date();
        Point po=new Point(1,2);
        String mess=new String("Lol This is Refernce Type");
        int[] numerator = new int[4];

        //String and Its Functions

        System.out.println("Strings and Function");
        String mes=new String("Lol This is Refernce Type"); //String Declaration as Reference
        String messa="  Hello this is Good !!";  //Short Hand Method of String Declaration
        messa+="Lol Gotcha"; //appending String
        System.out.println("String Messa Contains : "+messa); //Multi print Variable on one Line
        System.out.println("Does messa Ends With !! ? = "+messa.endsWith("!!"));  //Function of String
        System.out.println("Does messa Starts With !! ? = "+messa.startsWith("He"));  //Function of String
        System.out.println("Length of Messa = "+messa.length()); //Function of String
        System.out.println("Index of the Given Characters is : "+messa.indexOf("t"));
        System.out.println("Index of the Given Characters is : "+messa.indexOf("Fake"));  //Search for Unknown Character in String Will Return -1
        System.out.print("Replacing String with : "+messa.replace("Lol","Lmao"));  //This will not affect the original String(messa)
        System.out.println("    Note : This Will Not Affect Original String(messa) "+messa);
        System.out.println("Converting All Character to Upper String : "+messa.toUpperCase());
        System.out.println("Converting All Character to Lower String : "+messa.toLowerCase());
        System.out.println("This Will Eliminate Whitespace in String at begining and at End :"+messa.trim());

        //Escape Sequence

        System.out.println("Escape Sequence");
        System.out.println("Using Double Quotes in a String by This \"Method\"");
        System.out.println("Using BackSlash in String by This \\Method\\");
        System.out.println("This is a tab : \t , This is Newline \nNewline Detected");

        //Arrays  Note:Arrays are Refernce Type

        //Arrays have Fixed Length and The Length cannot be Changed

        System.out.println("Arrays");
        int[] numbers = new int[5]; //Declaration
        int[] numi={1,2,4,3,5}; //Short Hand Method of Array Declaration
        numbers[0]=1;//Assigning
        numbers[1]=3;
        numbers[2]=5;
        System.out.println("Printing Arrays will return its Memory Address : "+numbers);
        System.out.println(Arrays.toString(numbers)); //U can use this Function to print Arrays
        System.out.println("Length of a Arrays :  "+numi.length);
        Arrays.sort(numi); //This Sorting Method will impact the Original Array Variable
        System.out.println("Arrays can be Sorted Using: "+Arrays.toString(numi));

        //Multi Dimensional Arrays

        System.out.println("Multi Dimensional Array");
        int[][] lols = new int[2][3]; //Declaration     Two Dimensional
        lols[0][0]=1;//Assign
        lols[0][1]=2;
        System.out.println("We can Print Multidimensional Arrays using This : "+Arrays.deepToString(lols)); //DeepToString
        int[][] lole={{1,2,3},{4,5,6}}; //Short Hand Method of Array Declaration and Asssign
        System.out.println("We can Print Multidimensional Arrays using This : "+Arrays.deepToString(lole));

        int[][][] loli = new int[2][3][4]; //Declaration     Three Dimensional
        loli[0][0][0]=1;//Assign
        loli[0][1][0]=2;
        System.out.println("We can Print Multidimensional Arrays using This : "+Arrays.deepToString(loli)); //DeepToString
        int[][][] lolq = { {{1,2,3},{4,5,6},{2,5,7}},
                           {{7,8,9},{4,2,2},{3,9,5}},
                           {{8,2,9},{4,7,6},{6,3,9}
                           }
                         }; //Short Hand Method of Array Declaration and Asssign
        System.out.println("We can Print Multidimensional Arrays using This : "+Arrays.deepToString(lolq));

        //Constants

        final int cou=12; //Declaration
        //Use "final" that will make that var as constant(It can't be Varied in any part of prog)

        //Arithmetic operators

        System.out.println("Arithmetic Operation");
        //Java Also have such operations like +,-,*,/,%   and also use BODMAS Rules to Operate
        double als = 10/(double)3; //We should use (double) before decimal numbers to return exact floating values
        System.out.println(als);
        //Increment
        int x = 1;
        x++;
        ++x;
        System.out.println(x); //You will get 3 because its incremented two times
        int y=x++;  //Using x++ will copy only the x value to y no the incremented x value to y
        System.out.println(y);
        y=++x;  //Using ++x will copy the incremented value of x to y and also increments x value
        System.out.println(y);
        //We can increment the value of x by 2 like other languages
        x=x+2;
        x+=2;
        System.out.println(x);
        //Same is for decrement and other arithmetic operations also

        //Input

        System.out.println("Input");
        //For bytes
        Scanner inp = new Scanner(System.in); //We have Just Instance(inp) the Scanner class with System.in method
        System.out.print("Age : "); //Input Question
        byte a = inp.nextByte();//Prompting for input
        System.out.println("You are "+a);//printing Input
        //For int use nextInt() and so on for other data types
        //For Strings  using next()
        Scanner geti = new Scanner(System.in); //We have Just Instance(geti) the Scanner class with System.in method
        System.out.print("Name : "); //Input Question
        String bi = geti.next();//next() is used to get the first occurence of string not the Full Line and spaces
        System.out.println("You are "+bi);//printing Input
        //For Strings using nextLine()
        Scanner puti = new Scanner(System.in); //We have Just Instance(inp) the Scanner class with System.in method
        System.out.print("Name : "); //Input Question
        String cp = puti.nextLine();//nextLine() is used to Grab the full Line including Spaces . Spaces can be eliminated using trim() method
        System.out.println("You are "+cp);//printing Input

        //Boolean Operators

        System.out.println("Boolean Operators");
        int ldf = 3;
        boolean lil = ldf>=5; //this will evaluate the values and assign to lil as bool
        //some operators are  x>y,x<y,x>=y,x<=y,x!=y,x==y............
        lil = !lil;//negation operator ,This will reciprocal the value of bool
        System.out.println(lil);

        //Logical Operators

        System.out.println("Logical Operators");
        boolean fe; // This logi oper are used to give ability to take extra decision with bool operators
        String lods="lol";
        String lads="lol";
        fe = lods==lads && ldf>=3; //This will take both condition and evaluates and saves to the fe var as bool value
        System.out.println(fe);//Some logical operators are AND( && ),OR( || ),NOT( ! )
        fe = lods==lads && ldf>=3 || lods!=lads;//Using all the logical operators to give multi condition
        System.out.println(fe);//These sentence gets readed from left to right (so dont worry about giving bracket)

        //Conditional statement

        System.out.println("If Statement");
        if (lods==lads)   //This is how to give if statement
            System.out.println("You got it man"); //Wondering why i have not give any curly braces , You can eliminate braces for one line code in if
        else if (ldf>3) {//This is how else if is declared
            System.out.println("You got middle man");//I am using more than one sentence so curly braces is given
            System.out.println("curly braces given inside");
        }
        else //This is how else is declared
            System.out.println("You didnt got it");
          //int ab ;  (Wondering Why I haven't declared any variables inside if statements bcoz it can only be accessed inside the if statement not in the program code)

        //Ternary Operator

        System.out.println("Ternary Operator");
        String qwe;//Ternary Oper are used for assign values if certain condition is tru or false
        qwe = lods==lads ? "Yep" : "Nope" ;//variable = condition ? assign1: assign2;
        System.out.println(qwe);//It is pretty good to use ternary operator in certain condition like odd or even

        //Switch Statement

        System.out.println("Switch Statement");
        String ase;
        ase="owner";//Switch are mainly used for massive condition testing
        switch(ase) {//Switches are awesome for bulk amount of condition testing
            case "owner" :
                System.out.println("Welcome owner");
                break;//Break is used to jump out of switch statement
            case "worker" :
                System.out.println("Workers cannot be Welcomed");
                break;
            case "manager" :
                System.out.println("You can give infinite switches like this");
                break;
            default:          //When it skips all cases froom switch then it must end entering this
                System.out.println("You are Guest");
                break;
            }

        //For Loop

        System.out.println("For Loop");
        for(int i=0;i<5;i++) { //Similar to C and C++ I think You Probably Know it
            System.out.println(i);//For will Run unill the condition is True
        }

        //while Loop

        System.out.println("While Loop");
        int i=0;//While will Run unill the condition is True
        while(i<5) {
            System.out.println(i);
            i++;
        }

        //Do While Loop

        System.out.println("Do While Loop");
        i=0;
        do {
            System.out.println(i);
            i++;
        } while(i<5);

        //For Each Loop

        System.out.println("For Each Loop");//This is Special Loop Available in Java
        String[] Fruits = {"Apple","Orange","Banana","Grapes"};//This Loop is Widely used to Print Each Value from Arrays , That's Why it is Called For Each :)
        for (String f : Fruits){ //This Line Implements Java to Assign Each element of Array to Variable for Array.length times
            System.out.println(f);//This Loop has Two Disadvantage : (1)It can only Print Values of Arrays in Forward only Cannot print in Backward
        }                                                          //(2)It cannot access Only one element of Array Using Index

        //Break and Continue Statement

        System.out.println("Break and Continue Statement");//Break is used to break out fom the Loop
        String gs="";//Continue is used to ignore the remaining part of Loop and go Upwards to Loop Condition
        while(!gs.equals("quit")){
            System.out.print("Input : ");
            gs=inp.next().toLowerCase();
            if (gs.equals("pass"))
                continue;//This will just Skip System out and next if condition and Go to Loops Condition
            if (gs.equals("quit"))
                break;//This Will Break out of Loop
            System.out.println(gs);
        }

        //

        
        }
    }

