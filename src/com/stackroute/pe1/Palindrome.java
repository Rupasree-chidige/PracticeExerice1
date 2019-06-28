package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(int number) {
        boolean result = false;
        int temp = number, sum = 0, rem;
        while (number != 0) {
            rem = number % 10;
            sum = sum * 10 + rem;
            number = number / 10;
        }
        if (sum == temp) {
            result = true;
            return result;
        }
        return result;
    }



    public int evenNumbersSum(int number){
        int evenSum=0;

        while (number!=0)
        {
            int rem=0;
            rem=number%10;
            if(rem%2==0)
            {
                evenSum=evenSum+rem;
            }
            number=number/10;
        }

        return evenSum;

    }



    public static void main(String[] args) {
        // write your code here

        Palindrome palindrome=new Palindrome();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        int TestInput=scanner.nextInt();
        boolean res=palindrome.isPalindrome(TestInput);
        if(res)
        {
            int EvenSum=palindrome.evenNumbersSum(TestInput);
            if(EvenSum>25) {
                System.out.println(TestInput + " is a Palindrome and sum of even numbers is greater than 25");
            } else
            {
                System.out.println( TestInput +" is a Palindrome and sum of even numbers is less than 25");
            }
        }
        else {
            System.out.println( TestInput +" is not a Palindrome");
        }
    }

}

