package controller;

import model.UserDate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthday:");
        UserDate userDate = new UserDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Your birthday is " + userDate);

        System.out.println("Add days: ");
        int n = scanner.nextInt();

        userDate.addDays(n);

        System.out.println("Your birthday is " + userDate);
    }
}
