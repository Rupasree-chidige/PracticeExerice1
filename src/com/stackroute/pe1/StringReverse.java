package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {

    public void reverseString(String input) {


        char result[] = new char[input.length()];
        char inputArray[] = input.toCharArray();
        int j = 0;
        System.out.print("Reverse of the String " + input + " is ");
        for (int i = (input.length() - 1); i >= 0; i--) {

            result[j] = inputArray[i];
            System.out.print(result[j]);
            j++;
        }

    }
    public static void main(String[] args)
    {
        StringReverse stringReverse=new StringReverse();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String TestInput=scanner.nextLine();
        stringReverse.reverseString(TestInput);




    }
}
