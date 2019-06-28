package com.stackroute.pe1;

import java.util.Scanner;

public class ArraySort {

    public int sum(int number) {
        int sum=0;
        int count=0;
        int temp=number;
        while(number>0)
        {
            number=number/10;
            count++;
        }
        int array[]=new int[count];
        for(int i=0;i<count;i++) {
            if (temp % 10 > 0) {
                array[i] = temp%10;
                temp = temp / 10;

            }
        }
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if (array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(array[i]);
            if((array[i])%2==0)
                sum=sum+array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int number =input.nextInt();
        int result = arraySort.sum (number);
        System.out.println("\nsum of even numbers is " +result);
        if(result > 15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
