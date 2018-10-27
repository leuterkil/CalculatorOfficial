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
    public void multiplicationWorks()
    {
        MainActivity m = new MainActivity();
        float expected = 15;
        m.SetmValueOne(3);
        m.SetmValueTwo(5);
        float NumberOne = m.GetmValueOne();
        float NumberTwo = m.GetmValueTwo();
        assertEquals(expected,m.Multiplication(NumberOne,NumberTwo),15.0f);

    }



}
