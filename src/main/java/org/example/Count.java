package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class Count
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "What is the input string" );
        String word= input.next();
        int num=0;
        for(int j=0; j < word.length(); j++) {
            if(word.charAt(j)!= ' ') {
                num++;
            }
        }
        System.out.println(word + " has " + num + " characters");
    }
}
