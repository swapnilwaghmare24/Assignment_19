package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserValidationRunner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char ch='y';
        UserValidation userValidation=new UserValidation();
        userValidation.firstName();
        while (ch=='y') {
            System.out.println("type y to check again");
            ch = sc.next().charAt(0);
            if (ch == 'y') {
                userValidation.firstName();
            } else {
                return;
            }
        }
    }
}
