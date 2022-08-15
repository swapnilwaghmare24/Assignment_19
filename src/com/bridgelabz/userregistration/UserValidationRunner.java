package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserValidationRunner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char ch='y';
        UserValidation userValidation=new UserValidation();
        /*userValidation.firstName();
        while (ch=='y') {
            System.out.println("type y to check again");
            ch = sc.next().charAt(0);
            if (ch == 'y') {
                userValidation.firstName();
            } else {
                return;
            }
        }
        userValidation.lastName();
        while (ch=='y') {
            System.out.println("type y to check again");
            ch = sc.next().charAt(0);
            if (ch == 'y') {
                userValidation.lastName();
            } else {
                return;
            }
        }
        userValidation.email();
        while (ch=='y') {
            System.out.println("type y to check again");
            ch = sc.next().charAt(0);
            if (ch == 'y') {
                userValidation.email();
            } else {
                return;
            }
        }
        userValidation.mobileNumber();
        while (ch=='y') {
            System.out.println("type y to check again");
            ch = sc.next().charAt(0);
            if (ch == 'y') {
                userValidation.mobileNumber();
            } else {
                return;
            }
        }*/
        userValidation.password();
        while (ch=='y') {
            System.out.println("type y to check again");
            ch = sc.next().charAt(0);
            if (ch == 'y') {
                userValidation.password();
            } else {
                return;
            }
        }
    }
}
