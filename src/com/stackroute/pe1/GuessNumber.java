package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;



public class GuessNumber {

    public boolean checkMatched(int gussedNum,int ran)
    {
        boolean matched=false;
        if(gussedNum==ran)
        {
            matched=true;
            System.out.println("Number Gussed matches the original number");
        }else if(gussedNum>ran)
        {
            System.out.println("Number Gussed is more than original Number");
        } else {
            System.out.println("Number Gussed is less than original Number");
        }
        return  matched;
    }
    public static  void main(String[] args){
        GuessNumber guessNumber=new GuessNumber();
        Scanner sc=new Scanner(System.in);
        Random r= new Random();
        int originalNumber=r.nextInt(50);


        while(true){
            boolean result;
            System.out.println("Guess the number between 1 to 50");
            int guessNum=sc.nextInt();
            result=guessNumber.checkMatched(guessNum,originalNumber);
            if(result){
                break;
            }
            else {
                continue;
            }


        }

        }




}
