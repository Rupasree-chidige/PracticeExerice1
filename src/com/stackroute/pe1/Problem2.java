package com.stackroute.pe1;

import java.util.Scanner;

public class Problem2 {

    public boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }
    public boolean isBetween(int number)
    {
        if(number>20 && number<30)
        {
            return  true;
        }
        return false;
    }
    public static void main(String[] args) {
        // write your code here

        Problem2 problem2=new Problem2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        int TestInput=scanner.nextInt();

        if(problem2.isEven(TestInput))
        {
            if(problem2.isBetween(TestInput))
            {
                System.out.println("Jerry");
            }
            else {
                System.out.println("Is even not in between 20 and 30");
            }
        }
        else {
            if(!problem2.isBetween(TestInput))
            {
                System.out.println("Tom");
            }
            else{
                System.out.println("Is Odd not in between 20 and 30");
            }

        }
    }


}
