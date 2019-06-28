package com.stackroute.pe1;

import java.util.Scanner;

public class Problem4 {
        public void printNumber(int number)
        {
            for(int i=1;i<=number;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(" "+i);
                }
            }
        }
        public static void main(String[] args)
        {
            Problem4 problem4=new Problem4();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a Num");
            int TestInput=scanner.nextInt();
            problem4.printNumber(TestInput);
        }

}
