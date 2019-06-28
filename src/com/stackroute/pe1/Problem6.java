package com.stackroute.pe1;

import java.util.Scanner;

public class Problem6 {
    public void Sample(char var){
        if (Character.isDigit(var))
            System.out.println(var + " is a digit");
        else if (Character.isUpperCase(var))
            System.out.println(var + " is a UpperCase letter");
        else if (Character.isLowerCase(var))
            System.out.println(var + " is a LowerCase letter");
        else
            System.out.println(var + " is a symbol");
    }
    public static void main(String[] args)
    {
        Problem6 problem11=new Problem6();
        Scanner input = new Scanner(System.in);
        System.out.println("enter any character");
        char TestInput= input.next().charAt(0);
        problem11.Sample(TestInput);
    }
}
