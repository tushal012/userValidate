package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
    public static boolean isValidFirstName(String name) {
        String regexFirstName = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regexFirstName);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();


    }
    public static boolean isValidEmail(String email) {
//
        String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
        Pattern p = Pattern.compile(regexEmail);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the username validation program.");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the your First Name: ");
        String firstName = input.nextLine();
        System.out.println(isValidFirstName(firstName));

        System.out.print("Please enter the your last Name: ");
        String lastName = input.nextLine();
        System.out.println(isValidFirstName(lastName));

        System.out.print("Please enter the your Email ID: ");
        String emailID = input.nextLine();
        System.out.println(isValidEmail(emailID));
    }



}

