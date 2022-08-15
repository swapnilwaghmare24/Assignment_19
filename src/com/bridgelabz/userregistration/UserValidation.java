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

    void lastName()
    {
        String lastName;
        System.out.println("Enter last name");
        lastName=sc.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(lastName);
        if(matcher.matches())
        {
            System.out.println("Last name is valid");
        }
        else {
            System.out.println("Last name is not valid");
        }
    }

    void email()
    {
        String email;
        System.out.println("Enter email");
        email=sc.next();
        Pattern pattern=Pattern.compile("^[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*$");
        Matcher matcher=pattern.matcher(email);
        if(matcher.matches())
        {
            System.out.println("Email is valid");
        }
        else
        {
            System.out.println("Email is not valid");
        }
    }
    void mobileNumber()
    {
        String mobileNumber;
        System.out.println("enter mobile number");
        mobileNumber=sc.next();
        Pattern pattern=Pattern.compile("^[9]{1}[1]{1}-[0-9]{10}$");
        Matcher matcher=pattern.matcher(mobileNumber);
        if(matcher.matches())
        {
            System.out.println("Mobile number is valid");
        }
        else
        {
            System.out.println("Mobile number is not valid");
        }
    }

    void password()
    {
        String password;
        System.out.println("enter password");
        password=sc.next();
        Pattern pattern=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&])[a-zA-Z0-9@#$%^&+=]{8,}$");
        Matcher matcher=pattern.matcher(password);
        if(matcher.matches())
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is not valid");
        }
    }


}
