package com.stackroute.pe1;

import java.util.Scanner;

public class Problem10 {

    public void RepeatLast(String text,int num)
    {
        String finalText=text;
        String repeatText=text.substring((text.length()-num),text.length());

        for(int i=1;i<=num;i++)
        {
            finalText=finalText.concat(repeatText);
        }
        System.out.println(finalText);
    }
    public static void main(String[] args)
    {
        Problem10  problem10=new Problem10();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String TestInput=scanner.next();
        System.out.println("Enter number of last characters to repeat");
        int num=scanner.nextInt();
        problem10.RepeatLast(TestInput,num);
    }
}
