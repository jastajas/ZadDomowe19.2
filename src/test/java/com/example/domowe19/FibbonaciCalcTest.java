package com.example.domowe19;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FibbonaciCalcTest {


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