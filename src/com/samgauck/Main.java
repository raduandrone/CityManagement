package com.samgauck;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static long millis;
    private static Scanner s = new Scanner(System.in);
    private static String input;
    private static City city;

    public static void main(String[] args) {
	// TODO: Auto-generated method stub
        System.out.println("Sam Gauck Presents:");
        millis = System.currentTimeMillis();
        while (true){
            if (!(System.currentTimeMillis() - millis < 1000)) break;
        }
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
        System.out.println("CityManagement");
        System.out.println("Version 1.0");
        millis = System.currentTimeMillis();
        while (true){
            if (!(System.currentTimeMillis() - millis < 1000)) break;
        }
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
        System.out.print("Please enter a name for your city: ");
        input = s.next();
        city = new City(input);
    }
}
