package com.example.domowe19;

public class FibbonaciCalc {


    public int sumFibbonaciNumber(int limitNo) {

        int a = 1;
        int b = 1;
        int result = 0;
        int sum = 0;

        while ((a + b) < limitNo) {

            result = a + b;
            a = b;
            b = result;

            if (result % 2 == 0) {
                sum += result;
            }

        }

        return sum;
    }

}
