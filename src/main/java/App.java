/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int monthNum = 0;
        String monthName = "", output;

        while(monthNum < 1 || monthNum > 12)
        {
            System.out.println("Please enter the number of the month: ");
            monthNum = scan.nextInt();
        }

        switch (monthNum)
        {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
        }

        output = String.format("The name of the month is %s.", monthName);

        System.out.println(output);

        scan.close();
    }
}