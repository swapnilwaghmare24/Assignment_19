package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    Scanner sc = new Scanner(System.in);
    void firstName()
    {
        String firstName;
        System.out.println("Enter first name");
        firstName=sc.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(firstName);
        if(matcher.matches())
        {
            System.out.println("First name is valid");
        }
        else
        {
            System.out.println("First name is invalid");
        }

    }


}
