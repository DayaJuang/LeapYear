package org.example;

public class Main {
    public static void main(String[] args) {
        int[] inputs = {-1600,1600,2017,2000, 1924};
        boolean ans;

        for (int input : inputs)
        {
            ans = isLeapYear(input);

            System.out.println(ans);
        }

        // Print day of a month
        int temp = getDaysInMonth(2,2018);
        System.out.println(temp);
    }

    public static boolean isLeapYear(int year){
        // Check if year is valid and if it's divisible by 4
        if(year < 1 || year > 9999 || (year % 4 != 0))
            return false;

        // Do the leap year calculation
        if(year % 100 != 0)
            return true;

        return (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){
        // Check if input is valid
        if((month < 1 || year < 1) || (month > 12 || year > 9999))
            return -1;

        // Check if the year is Leap Year or not
        boolean isLeap = isLeapYear(year);

        // Print every month day
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeap)
                    return 29;
                else
                    return 28;
            default:
                return 30;
        }
    }
}