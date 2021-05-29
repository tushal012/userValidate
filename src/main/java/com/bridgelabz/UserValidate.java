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
    public static void isValidEmail() {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        String regexEmail = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
        Pattern p = Pattern.compile(regexEmail);

        for(String email : emails) {
            //Create instance of matcher
            Matcher matcher = p.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
    public static boolean isValidMobileNum(String mobileNum) {
        String regexMobileNum = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(regexMobileNum);
        if ( mobileNum == null ){
            return false;
        }
        Matcher m = p.matcher(mobileNum);

        return m.matches();
    }
    public static boolean isValidPassword(String password) {
        String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
        Pattern p = Pattern.compile(regexPassword);
        if ( password == null ){
            return false;
        }
        Matcher m = p.matcher(password);

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

        System.out.print("Please enter the your mobile with country code 91: ");
        String mobileNo = input.nextLine();
        System.out.println(isValidMobileNum(mobileNo));

        System.out.print("please enter the password: ");
        String userPassword = input.nextLine();
        System.out.println(isValidPassword(userPassword));
    }



}

