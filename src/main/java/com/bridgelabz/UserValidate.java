package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
    public static boolean isValidUsername(String name) {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();

    }
    public static void main(String[] args) {
        System.out.println("welcome to username validation program");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the your username: ");
        String userName = input.nextLine();

        System.out.println(isValidUsername(userName));
    }
}

