package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList <Double> myList = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first value: ");
        double num1 = scanner.nextDouble();
        myList.add(num1);

        System.out.println("Write second value: ");
        double num2 = scanner.nextDouble();
        myList.add(num2);

        System.out.println("Write third value: ");
        double num3 = scanner.nextDouble();
        myList.add(num3);

        /* myList[0] = (1.2);
        myList[1] = (1.3);
        myList[2] = (2.3);
        myList[3] = (4.8); */

        double total=0;
        double bigNumber = myList.get(0);

        for(double number : myList){
            if(bigNumber<number){
                bigNumber = number;
            }
            total = total+ number;
            System.out.println(number);
        }
        System.out.println("Total: " +total);
        System.out.println("Big Number: " +bigNumber);
    }
}
