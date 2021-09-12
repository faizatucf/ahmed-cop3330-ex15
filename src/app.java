/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class password {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pass = "abc$123" , input;
        System.out.println("What is the password?");
        input = sc.nextLine();
        if(input.equals(pass))
        System.out.println("Welcome!");
        else
        System.out.println("I don't know you.");
    }
}