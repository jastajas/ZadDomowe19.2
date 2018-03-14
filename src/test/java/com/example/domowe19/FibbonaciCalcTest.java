package com.example.domowe19;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FibbonaciCalcTest {


    @Test
    public void showSumEvenFibb(){
        //given
        FibbonaciCalc fibbonaciCalc = new FibbonaciCalc();

        fibbonaciCalc.getNumbers().add(3);
        fibbonaciCalc.getNumbers().add(5);
        fibbonaciCalc.getNumbers().add(8);
        fibbonaciCalc.getNumbers().add(13);
        fibbonaciCalc.getNumbers().add(21);

        //when
        int sum = fibbonaciCalc.sumEvenNo();

        //then
        Assert.assertThat(sum, CoreMatchers.is(10));

    }

    @Test
    public void showSumEvenRandom(){
        //given
        FibbonaciCalc fibbonaciCalc = new FibbonaciCalc();

        fibbonaciCalc.getNumbers().add(4);
        fibbonaciCalc.getNumbers().add(5);
        fibbonaciCalc.getNumbers().add(8);
        fibbonaciCalc.getNumbers().add(12);
        fibbonaciCalc.getNumbers().add(15);
        fibbonaciCalc.getNumbers().add(21);

        //when
        int sum = fibbonaciCalc.sumEvenNo();

        //then
        Assert.assertThat(sum, CoreMatchers.is(26));

    }

    @Test
    public void showSumFibbEvenNumberFor20(){
        //given
        FibbonaciCalc fibbonaciCalc = new FibbonaciCalc();
        int limit = 20;

        //when
        int sum = fibbonaciCalc.sumFibbonaciNumber(limit);

        //then
        Assert.assertThat(sum, CoreMatchers.is(10));

    }

    @Test
    public void showSumFibbEvenNumberFor1000(){
        //given
        FibbonaciCalc fibbonaciCalc = new FibbonaciCalc();
        int limit = 1000;

        //when
        int sum = fibbonaciCalc.sumFibbonaciNumber(limit);

        //then
        Assert.assertThat(sum, CoreMatchers.is(798));

    }

    @Test
    public void showSumFibbEvenNumberFor4000000(){
        //given
        FibbonaciCalc fibbonaciCalc = new FibbonaciCalc();
        int limit = 4000000;

        //when
        int sum = fibbonaciCalc.sumFibbonaciNumber(limit);

        //then
        Assert.assertThat(sum, CoreMatchers.is(4613732));

    }




}