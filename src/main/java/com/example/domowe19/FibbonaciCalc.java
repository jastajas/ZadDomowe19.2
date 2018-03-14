package com.example.domowe19;

import java.util.ArrayList;
import java.util.List;

public class FibbonaciCalc {


   private List<Integer> numbers;


    public FibbonaciCalc() {
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int sumFibbonaciNumber(int limitNo) {

        int ii = 1;

        for (int i = 0; (numbers.get(i) + numbers.get(ii)) < limitNo; i++) {

            numbers.add(numbers.get(i) + numbers.get(ii));
            ii++;
        }

        return sumEvenNo();
    }


    public int sumEvenNo() {
       int sum = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0){
                sum += number;
            }
        }

        return sum;
    }

}
