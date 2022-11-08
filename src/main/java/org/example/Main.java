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
}