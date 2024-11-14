package dev.mariel.armstrong.service;

public class NumArmstrong {

    private static boolean isArmstrong(int num) {
        int numOrigin = num;
        int digits = (int)(Math.log10(num) + 1);
        int sum = 0;

        while (num >0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num /= 10; 
        }

        return numOrigin == sum;
    }

    public static boolean checkArmstrong(int num) {
        return isArmstrong(num);
    }

}
