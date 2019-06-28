package com.stackroute.pe1;

import java.util.Scanner;

public class ConsonantOrVowel {

    public void consonantorvowel(String input){

        char[] inputarray= input.toCharArray();
            if(input.length()>1) {
                for (int i = 0; i < input.length(); i++) {
                    if (Character.isAlphabetic(inputarray[i])) {
                        char ch=inputarray[i];
                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                            System.out.println(ch + " is vowel");
                        else
                            System.out.println(ch + " is consonant");
                    }
                    else {
                        System.out.println("ERROR!  Not an Alphabet Character");
                    }
                }
            }




    }

    public static void main(String[] args){
        ConsonantOrVowel consonantOrVowel=new ConsonantOrVowel();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String TestInput=scanner.next();
        consonantOrVowel.consonantorvowel(TestInput);
    }
}
