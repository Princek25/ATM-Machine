package com.company;

import java.util.Scanner;

class ATM {
    float balance;
    int pin = 1234;

    public void pin() {
        System.out.print("Welcome to our ATM, Please Enter your valid Pin - ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == pin) {
            menu();
        } else {
            System.out.println("Invalid Pin!");
            pin();
        }
    }

    public void menu() {
        System.out.println("Press 1 to view balance");
        System.out.println("Press 2 for deposit money");
        System.out.println("Press 3 for withdraw money");
        System.out.println("Press 4 to exit");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("The balance : " + balance);
            menu();
        } else if (input == 2) {
            depositMoney();
        } else if (input == 3) {
            withdrawMoney();
        } else if (input == 4) {
            System.out.println("Thanks for using our ATM Services");
        } else {
            System.out.println("Enter valid Input");
        }
    }

    public void depositMoney() {
        System.out.print("Enter money to deposit : ");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextInt();
        balance = balance + input;
        System.out.println("Your deposited money : " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.print("Enter money for withdraw : ");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextInt();
        if (input > balance) {
            System.out.println("insufficient balance");
        } else {
            balance = balance - input;
            System.out.println("Remaining amount : " + balance);
        }
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.pin();
    }
}
