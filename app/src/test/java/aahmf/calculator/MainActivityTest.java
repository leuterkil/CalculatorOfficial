package aahmf.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void AdditionOfTheTwoNumbersIsCorrect()
    {
        MainActivity m = new MainActivity();
        float expected = 12;
        m.SetmValueOne(6);
        m.SetmValueTwo(6);
        float FirstNumber = m.GetmValueOne();
        float SecondNumber = m.GetmValueTwo();
        m.SetAddition(true);
        assertEquals(expected,m.Addition(FirstNumber,SecondNumber),12);

    }

    @Test
    public void TestIfTheAdditionIsFalse()
    {
        MainActivity m = new MainActivity();
        float expected = 12;
        m.SetmValueOne(3);
        m.SetmValueTwo(6);
        float FirstNumber = m.GetmValueOne();
        float SecondNumber = m.GetmValueTwo();
        m.SetAddition(true);
        assertNotEquals(expected,m.Addition(FirstNumber,SecondNumber));
    }



    @Test
    public void TestIfTheSubstratctionIsCorrect()
    {
        MainActivity m = new MainActivity();
        float expected = 1;
        m.SetmValueOne(4);
        m.SetmValueTwo(3);
        float FirstNumber = m.GetmValueOne();
        float SecondNumber = m.GetmValueTwo();
        m.SetSub(true);
        assertEquals(expected,m.Substract(FirstNumber,SecondNumber),1);

    }


    @Test

    public void TestIfTheSubstractionIsFalse()
    {
        MainActivity m = new MainActivity();
        float expected = 10;
        m.SetmValueOne(10);
        m.SetmValueTwo(11);
        float FirstNumber = m.GetmValueOne();
        float SecondNumber = m.GetmValueTwo();
        m.SetSub(true);
        assertNotEquals(expected,m.Substract(FirstNumber,SecondNumber));
    }
}
