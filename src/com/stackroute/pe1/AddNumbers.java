package com.stackroute.pe1;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        AddNumbers problem5=new AddNumbers();
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many numbers you want to add");
        int n=input.nextInt();
        System.out.println("enter the numbers");
        int data[]=new int[n];
        for(int i=0;i<data.length;i++){
            data[i]=input.nextInt();
        }
        int result= problem5.sum(data);

        System.out.println("sum of given  numbers is "+result);

    }
    public int sum(int[] numbers)
    {
        int result=0;
        for(int i=0;i<numbers.length;i++){

            result=result+numbers[i];

        }
        return result;
    }
}
