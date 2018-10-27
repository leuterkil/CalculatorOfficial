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
}
